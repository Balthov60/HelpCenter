package fr.heavencraft.helpcenter;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;
import org.bukkit.block.Skull;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class HelpCenterListener implements Listener
{

	// define sign and head characteristic
	private static final String MHF_QUESTION = "MHF_Question";
	private static final String TAG = ChatColor.AQUA + "[Infos]";

	// define basic strings
	private static final String ERROR_MSG = ChatColor.RED + "Informations non disponible (Contacter un Admin)";
	private static final String HEADER_MSG = ChatColor.AQUA + "¤¤¤¤¤¤¤¤¤¤ Infos ¤¤¤¤¤¤¤¤¤¤";
	private static final String FOOTER_MSG = ChatColor.AQUA + "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤";

	private final HelpCenter plugin;

	public HelpCenterListener(HelpCenter plugin)
	{
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler(ignoreCancelled = true)
	private void onPlayerInteract(PlayerInteractEvent event)
	{
		if (event.getAction() != Action.RIGHT_CLICK_BLOCK)
			return;

		final Block clickedBlock = event.getClickedBlock();

		switch (clickedBlock.getType())
		{
			case SKULL:
				onSkullClick((Skull) clickedBlock.getState(), event.getPlayer());
				break;
			case WALL_SIGN:
				onSignClick((Sign) clickedBlock.getState(), event.getPlayer());
				break;
			default:
				break;
		}
	}

	/**
	 * Search the sign linked to the skull
	 * 
	 * @param skull
	 * @param player
	 */
	private void onSkullClick(Skull skull, Player player)
	{
		if (!MHF_QUESTION.equals(skull.getOwner()))
			return;

		final Block sign = skull.getBlock().getRelative(BlockFace.DOWN).getRelative(skull.getRotation());

		if (sign.getType() != Material.WALL_SIGN)
			return;

		onSignClick((Sign) sign.getState(), player);
	}

	/**
	 * send the help message of this sign to the player
	 * 
	 * @param sign
	 * @param player
	 */
	private void onSignClick(Sign sign, Player player)
	{
		if (!TAG.equals(sign.getLine(0)))
			return;

		final String message = plugin.getMessageByName(sign.getLine(3));

		if (message == null)
			player.sendMessage(ERROR_MSG);
		else
		{
			player.sendMessage(HEADER_MSG);
			player.sendMessage(message);
			player.sendMessage(FOOTER_MSG);
		}
	}
}
package fr.heavencraft.helpcenter;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class HelpCenter extends JavaPlugin
{
	private final Map<String, String> messagesByName = new HashMap<String, String>();

	// define IG messages
	public HelpCenter()
	{
		// Provinces
		messagesByName.put("P0",
				" &1Qu'est-ce qu'une province ? \nUne province est un &6domaine réunissant plusieurs villes &fet un territoire délimité. Chaqune des &6cinq&f provinces est dirigée par un &6gouverneur&f. Pour en rejoindre une, il vous suffit d’aller a Healleven (spawn) et de parler (en cliquant sur lui) a &cNorgon (PNJ) sur le nuage&f. Il vous guidera vers la province, cliquer sur les passeurs (PNJ) présent à la fin de la route. Enfin, vous trouverez a déstination un panneau &c[Rejoindre]&f. Utilisez le en cliquant dessus. Pour quitter votre province, il vous suffira d’aller au centre d’aide au a Healleven et de cliquer sur le panneau &c[quitter]&f. \nPour plus d’informations concernant les provinces, cliquez sur les &6panneaux en dessous&f ou rendez vous sur le &6forum&f.");
		messagesByName.put("P1",
				" &6Province d’Enkidiev&f, Enkidiev est une province au style médiéval dominant avec ses villes &6Dubay &f(capitale d’enkidiev) et &6Hurlevent &fconstruitent de pierres et de bois. On y retrouve aussi la ville &6d’Orientis &fconstruite de grès et de bois. Cette province possède une &6ville Pvp&f, un domaine de jeu et une possibilité de construction hors des villes sur demande. Son gouverneur est &6Singethorax&f.");
		messagesByName.put("P2",
				" &3Province du Zéphyr&f, Le Zéphyr, la province enneigée, est une province alliant Moyen-Age et Renaissance. Elle a pour gouverneur &3Baka_Ryuuji&f. Elle possède trois villes, une médiévale du nom &3d’Eclypsia, &3Nailatrea&f, la ville minière et enfin &3Quebec &fcapitale du Zéphyr. Le Zéphyr possède des arènes ChunkWars et pvp, une ville RP ainsi qu’une possibilité de construire en dehors des villes sous accord avec le Gouverneur.");
		messagesByName.put("P3",
				" &cProvince d’Azur&f, Azur est une province futuriste, avancée dans son temps. Ayant pour gouverneur &cOthy_Alucard&f, elle possède deux villes, &cEpsilon&f, cette ville possède de multiples infrastructures et les seuls tours du serveur. &cAtlantys &fest la deuxième ville d’Azur qui possède également des zones RP et des décorations comme le Yacht All Capon.");
		messagesByName.put("P4",
				" &5Province du Fëador&f, Le Fëador est une province de la révolution industrielle tout en restant axé sur un passé en bois. Elle possède deux villes &5Stonebridge&f, capitale de cette province ayant pour maires &5Snoupy47&f aussi gouverneur et la ville de &5Rivebois&f. Elle possède de multiples constructions emblématiques et des Zones RP ainsi qu’une zone contenant de nombreuses arènes.");
		messagesByName.put("P5",
				" &2Province du Chansor&f, Le Chansor est une province composée de grande foret majestueuse faisant sa puissance. Son gouverneur est &2Splashmob&f. Le Chansor possède deux villes actives et une ville RP, la première est &2Oria &foffrant des maisons gratuites et accessibles à tous. la seconde, &2Illimityville &fdonne la possibilité d’avoir des parcelles free-build et vend ses maisons de 100 à 300 po’s. &2Neoralda &ftroisième ville du &2Chansor &fest une ville RP, ouverte à la visite vous ne pouvez par contre y habiter.");

		// Métiers
		messagesByName.put("M1",
				" &cQu’est-ce qu’un métier ? \n &6Un métier&f est un travail que vous faites au quotidien sur minecraft (bûcher, mineur, etc...) qui vous offre la possibilité de &6gagner des po's (Monnaie)&f. Votre revenu dépend de votre grade et du niveau de votre métier.\n &cATTENTION: &fSi vous changez de métier, vous perdez la progression de votre ancien métier. \n(http://bit.ly/1UJM2zl)");
		messagesByName.put("M2",
				" &cComment obtenir un métier ? \n &fSimple, il vous suffit d’aller au &6château de Healleven (spawn) &fet d’aller voir &cPaul Emploi (PNJ)&f. Il vous proposera différents métiers parmis une &6multitudes de choix&f, vous pourrez devenir &cgarde &fou bien &cbûcheron&f, selon &6vos préférences&f et selon votre &cStatut Social&f (voir Infos Chambellan).");
		messagesByName.put("M3",
				" &cComment faire évoluer mon métier ? \n &fPour faire évoluer votre métier, il vous suffira d'executer les tâches demandées dans &cl'annuaire des métiers &f(chez Paul Emploi) ou sur le &cwiki&f, attention pour les métiers demandant de casser des blocs, cela ne fonctionne que sur le monde ressource, alors que certains métiers comme Garde ou Forgeron fonctionnent aussi ici. \n(http://bit.ly/1UJM2zl)");

		// Chambellan
		messagesByName.put("C1",
				" &cQui est Chambellan ? \n &fChambellan est le &cconseiller du Roi&f, ce dernier vous permettra de &6faire évoluer votre grade social&f, ce qui vous ouvrira des portes et de &6nouvelles possibilités&f tel qu’un coffre sous la banque, une maison à Healleven ou bien d'évoluer dans votre métier. \n(http://bit.ly/1O8IaTX)");
		messagesByName.put("C2",
				" &cComment évoluer avec Chambellan ? \n&fPour évoluer dans les statuts sociaux, &cle conseiller &fvous demandera de lui fournir &6des ressources&f en tous genres et d’une quantité précise ainsi que des &6Pièces d'or&f. Ces ressources seront à farmées et accéssibles dans le monde ressource mais elles peuvent également être achetées à des commerçants. \n(http://bit.ly/1O8IaTX)");

		// Chancelier
		messagesByName.put("P6",
				" &cQui est le Chancelier ? \n&fLe Chancelier est &cl’ambassadeur des provinces &fpour le compte du Roi, ce dernier vous permettra &6d’augmenter le niveau de vos provinces&f.");
		messagesByName.put("P7",
				" &cA quoi sert-il et comment faire pour augmenter nos provinces ? &f\nAugmenter le niveau de votre province permet d’obtenir des &6avantages d’effets &fdes plus utiles. Pour augmenter le niveau de votre province, c’est aussi simple que Chambellan, en quoi il faut &6farmer des ressources &fet en apporter des une quantité précise mais illimité afin de monter les points de provinces. Plus une province a de points, plus elle a un niveau élevé donc plus d’effets. (http://bit.ly/1pkxMRM)");

		// Donjons
		messagesByName.put("D1",
				"&cLes donjons, qu’est-ce donc ? &f\nLes donjons sont des zones dans lesquels il faut &6remplir des objectifs &f(le plus souvent du &6PVM&f) afin d’obtenir des &6récompenses&f. Ils sont faisables seuls ou en groupes. Pour y accèder parler à &eKay l'aventurier &fà la sortie du spawn !");

		// Quêtes
		messagesByName.put("Q1",
				" &cLes quêtes journalières. \n&fLes quêtes journalières sont des objectifs où il vous est demandé de &6rendre des services &fà des &6PNJs&f partout dans la &6capitale&f en échange d’une certaine somme de &cpo’s&f et ainsi augmenter vos &6points d’influences&f.");

		// Events
		messagesByName.put("E1",
				" &bLes Events. \nDes évènements &6dynamisent régulièrement la vie d’Heaven&f. A la clé, &6des récompenses&f bien-sûr, mais aussi &6un bon moment à passer en communauté&f. Ouverts à tous les membres, les inscriptions à certains évènements se font sur le &6forum&f.");
	}

	@Override
	public void onEnable()
	{
		new HelpCenterListener(this);
	}

	/**
	 * Search in HashMap the message that correspond to the clicked sign
	 * 
	 * @param name (IG sign identifier)
	 * @return
	 */
	public String getMessageByName(String name)
	{
		final String text = messagesByName.get(name);
		if (text != null)
			return ChatColor.translateAlternateColorCodes('&', text);
		return null;
	}
}
package Configuration;

import Deck.BossEnemy;
import Deck.Player1;
import Deck.StandardCard;
import Deck.TeamLeader;

import java.util.List;
import java.util.Scanner;

public class PlayerConf {
    private final Scanner scanner;

    public PlayerConf(final Scanner scanner) {
        this.scanner = scanner;
    }

    public TeamLeader getTL() {

        TeamLeadersConf teamLeadersConf = new TeamLeadersConf();
        List<TeamLeader> teamLeaders = teamLeadersConf.getTeamLeaderList();
        String playerChoose = scanner.nextLine();
        return teamLeaders.get(Integer.parseInt(playerChoose) - 1);
    }

    CardDeckConf cardDeckConf = new CardDeckConf();

    StandardCardConf standardCardConf = new StandardCardConf();
    List<StandardCard> standardCards = standardCardConf.getStandardCardList();
    BossEnemyConf bossEnemyConf = new BossEnemyConf();
    List<BossEnemy> bossEnemies = bossEnemyConf.getBossEnemyList();


//    public void showTL(Player1 player1) {
//        System.out.println(player1.getTeamLeader().toString());
//    } stworzyc oddzielna klase w ktorej jest kooperacja z klasa player, klasa do wyswietlania

//    public void showHand() { klasa playerUtils
//
//        //  System.out.println(player1.getTeamLeader().getName());
//        //  System.out.println(cardDeckConf.getDeck().toString());

 //   }
}
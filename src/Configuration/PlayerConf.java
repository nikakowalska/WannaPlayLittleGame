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

    StandardCardConf standardCardBuilder = new StandardCardConf();
    List<StandardCard> standardCards = standardCardBuilder.getStandardCardList();
    BossEnemyConf enemyBuilder = new BossEnemyConf();
    List<BossEnemy> bossEnemies = enemyBuilder.getBossEnemyList();
    Player1 player1 = new Player1(getTL(), cardDeckConf.getDeck(), null, 0);

    public void showTL() {
        System.out.println(player1.getTeamLeader().toString());
    }

    public void showHand() {

        //  System.out.println(player1.getTeamLeader().getName());
        //  System.out.println(cardDeckBuilder.getDeck().toString());


    }
}
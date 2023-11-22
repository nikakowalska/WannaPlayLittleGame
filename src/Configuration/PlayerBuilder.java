package Configuration;

import Deck.BossEnemy;
import Deck.Player1;
import Deck.StandardCard;
import Deck.TeamLeader;

import java.util.List;
import java.util.Scanner;

public class PlayerBuilder {

    public TeamLeader getTL() {


        TeamLeadersBuilder teamLeadersBuilder = new TeamLeadersBuilder();
        List<TeamLeader> teamLeaders = teamLeadersBuilder.getTeamLeaderList();
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        scanner.close();
        return teamLeaders.get(a - 1);
    }

    CardDeckBuilder cardDeckBuilder = new CardDeckBuilder();

    StandardCardBuilder standardCardBuilder = new StandardCardBuilder();
    List<StandardCard> standardCards = standardCardBuilder.getStandardCardList();
    BossEnemyBuilder enemyBuilder = new BossEnemyBuilder();
    List<BossEnemy> bossEnemies = enemyBuilder.getBossEnemyList();
    Player1 player1 = new Player1(getTL(), cardDeckBuilder.getDeck(), null, 0);

    public void showTL() {
        System.out.println(player1.getTeamLeader().toString());
    }

    public void showHand() {

        //  System.out.println(player1.getTeamLeader().getName());
        //  System.out.println(cardDeckBuilder.getDeck().toString());


    }
}
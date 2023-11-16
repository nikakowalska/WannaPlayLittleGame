package Gameplay;

import Configuration.BossEnemyBuilder;
import Configuration.StandardCardBuilder;
import Configuration.TeamLeadersBuilder;
import Deck.BossEnemy;
import Deck.Player1;
import Deck.StandardCard;
import Deck.TeamLeader;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public boolean run() {
        Menu menu = new Menu();
        String playerChoose = menu.dispatcher();
        if (playerChoose.equals("N")) {
            return true;
        }
        if (playerChoose.equals("A")) {
            return
        }
        TeamLeadersBuilder teamLeadersBuilder = new TeamLeadersBuilder();
        List<TeamLeader> teamLeaders = teamLeadersBuilder.getTeamLeaderList();
        teamLeaders.forEach(teamLeader -> System.out.println(teamLeader));
        StandardCardBuilder standardCardBuilder = new StandardCardBuilder();
        List<StandardCard> standardCards = standardCardBuilder.getStandardCardList();
        BossEnemyBuilder enemyBuilder = new BossEnemyBuilder();
        List<BossEnemy> bossEnemies = enemyBuilder.getBossEnemyList();
        Player1 player1 = new Player1(null, null, null, 0);


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose your teamleader");
        System.out.println("1 - HardCandy");
        System.out.println("2 - ChilliChips");
        System.out.println("3 - Marshmallow");
        System.out.println("4 - HotSausage");
        System.out.println("5 - Sweet&Sour");
        System.out.println("6 - YourMomsDinner");
        System.out.println("Your choice:");
        final int w;
        w = keyboard.nextInt();

        // player1.setTeamLeader(teamLeaders.get(w-1));

        switch (w) {
            case 1: {
                System.out.println("You've chosen Hard Candy as your TeamLeader");
            }
            break;
            case 2: {
                System.out.println("You've chosen Chilli Chips as your TeamLeader");
            }
            break;
            case 3: {
                System.out.println("You've chosen Marshmallow as your TeamLeader");
            }
            break;
            case 4: {
                System.out.println("You've chosen Hot Sausage as your TeamLeader");
            }
            break;
            case 5: {
                System.out.println("You've chosen Sweet&Sour as your TeamLeader");
            }
            break;
            case 6: {
                System.out.println("You've chosen YourMomsDinner as your TeamLeader");
            }
            break;
            default: {
                System.out.println("Wrong number. Try again.");
            }
            break;
        }
        System.out.println(teamLeaders.size());
        if (teamLeaders.size() >= w) {
            player1.setTeamLeader(teamLeaders.get(w - 1));
            System.out.println(player1.getTeamLeader());
        }


//sposob by przerwac gre - zrobic petle nieskonczona,która ma warunki jak zakonczyc, np break, albo continue
        return true;
    }

}


import Configuration.BossEnemyBuilder;
import Configuration.StandardCardBuilder;
import Configuration.TeamLeadersBuilder;
import Deck.BossEnemy;
import Deck.Player1;
import Deck.StandardCard;
import Deck.TeamLeader;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Player1 player1;

    public static void main(String[] args) {

        TeamLeadersBuilder teamLeadersBuilder = new TeamLeadersBuilder();
        List<TeamLeader> teamLeaders = teamLeadersBuilder.getTeamLeaderList();
        teamLeaders.forEach(teamLeader -> System.out.println(teamLeader));
        StandardCardBuilder standardCardBuilder = new StandardCardBuilder();
        List<StandardCard> standardCards = standardCardBuilder.getStandardCardList();
        BossEnemyBuilder enemyBuilder = new BossEnemyBuilder();
        List<BossEnemy> bossEnemies = enemyBuilder.getBossEnemyList();
        Player1 player1 = new Player1(null, null, null, 0);
//karty postaci i przeciwnikow w ten sam sposob
        //postacie maja name, bron, klase, bron oddziielna klasa z nazwa broni z nazwa element, z ktorego jest bron
        //karty przeciwnikow z name, punkty zycia, punkty zwyciestwa ktore dostaje gracz, gdzie punkty zwyciestwa powinny byc odkladane
        //karty na stole, karty odrzucone
        //w jaki sposob podliczyc punkty gracza -moze klasa zliczjaca punkty, ktore posiada gracz

        //System.out.println("Podaj liczbę graczy");
        Scanner keyboard = new Scanner(System.in);
//        int liczbaGraczy = keyboard.nextInt();
//        keyboard.nextLine();
//        for (int i = 0; i < liczbaGraczy; i++) {
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


        for (int runda = 1; runda >= 0; runda++) {
            System.out.println("Runda numer " + runda);

        }

    }
}





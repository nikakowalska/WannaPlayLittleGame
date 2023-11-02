import Configuration.BossEnemyBuilder;
import Configuration.HeroesBuilder;
import Configuration.TeamLeadersBuilder;
import Deck.BossEnemy;
import Deck.Heroes;
import Deck.Player1;
import Deck.TeamLeader;

import javax.xml.namespace.QName;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TeamLeadersBuilder teamLeadersBuilder = new TeamLeadersBuilder();
        List< TeamLeader > teamLeaders = teamLeadersBuilder.getTeamLeaderList();
       teamLeaders.forEach(teamLeader -> System.out.println(teamLeader));
        HeroesBuilder heroesBuilder = new HeroesBuilder();
        List<Heroes> heroes = heroesBuilder.getHeroesList();
       // heroes.forEach(heroes1 -> System.out.println(heroes1) );
        BossEnemyBuilder enemyBuilder = new BossEnemyBuilder();
        List<BossEnemy> bossEnemies = enemyBuilder.getBossEnemyList();

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
               // System.out.println("Your choice:");

           // final String tl = tl.contentEquals(keyboard.nextLine());
      //  Player1 player1 = new Player1(tl, 0);


    }}





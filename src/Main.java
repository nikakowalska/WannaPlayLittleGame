import Configuration.TeamLeadersBuilder;
import TaliaGlowna.Elements;
import TaliaGlowna.TeamLeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // WyborPrzywodcyImpl wyborPrzywodcy = new WyborPrzywodcyImpl();
//wyborPrzywodcy.wyborPrzywodcy();
        TeamLeadersBuilder teamLeadersBuilder = new TeamLeadersBuilder();
        List< TeamLeader > teamLeaders = teamLeadersBuilder.getTeamLeaderList();
       teamLeaders.forEach(teamLeader -> System.out.println(teamLeader));

//zrobic karty postaci i przeciwnikow w ten sam sposob
        //postacie maja name, bron, klase, bron oddziielna klasa z nazwa broni z nazwa elementu, z ktorego jest bron
        //karty przeciwnikow z name, punkty zycia, punkty zwyciestwa ktore dostaje gracz, gdzie punkty zwyciestwa powinny byc odkladane
        System.out.println("Podaj liczbę graczy");
        Scanner keyboard = new Scanner(System.in);
        int liczbaGraczy = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < liczbaGraczy; i++) {

            System.out.println("Wybierz przywódcę swojej drużyny!");


          //  String przywodcaGracza = keyboard.nextLine();
            //if (przywodcyDruzyn.contains(przywodcaGracza)) {
//
//                System.out.println("Wybrałeś przywódcę: " + przywodcaGracza);
//
//            } else {
//                System.out.println("Spróbuj wybrać ponownie");
//                System.out.println(przywodcyDruzyn);
//                keyboard.nextLine();
//                if (przywodcaGracza.equals(keyboard.nextLine())) {
//
//                    System.out.println("Wybrałeś przywódcę: " + przywodcaGracza);
//                }
//            }
//
//        }keyboard.close();;
        }}}


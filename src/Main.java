import TaliaGlowna.PrzywódcyDrużyn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // WyborPrzywodcyImpl wyborPrzywodcy = new WyborPrzywodcyImpl();
//wyborPrzywodcy.wyborPrzywodcy();
        PrzywódcyDrużyn pd =new PrzywódcyDrużyn();
        pd.add("Cat1");
        pd.add("Cat2");
        pd.add("Cat3");
        pd.add("Cat4");
        pd.add("Cat5");
        pd.add("Cat6");
             pd.toString();

        System.out.println("Podaj liczbę graczy");
        Scanner keyboard = new Scanner(System.in);
        int liczbaGraczy = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < liczbaGraczy; i++) {

            System.out.println("Wybierz przywódcę swojej drużyny!");
            System.out.println(pd.toString());

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


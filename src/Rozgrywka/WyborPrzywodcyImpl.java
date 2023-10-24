package Rozgrywka;

import TaliaGlowna.PrzywódcyDrużyn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WyborPrzywodcyImpl implements WyborPrzywodcy  {

    @Override
    public void wyborPrzywodcy() {


        System.out.println("Podaj liczbę graczy");
        Scanner keyboard = new Scanner(System.in);
        int liczbaGraczy = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < liczbaGraczy; i++) {
          PrzywódcyDrużyn pd =new PrzywódcyDrużyn();
            pd.add("Cat1");
            pd.add("Cat2");
            pd.add("Cat3");
            pd.add("Cat4");
            pd.add("Cat5");
            pd.add("Cat6");
            System.out.println("Wybierz przywódcę swojej drużyny!");


          //  pd.stream().forEach(element -> System.out.println(element));

          ///  String przywodcaGracza = keyboard.nextLine();
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
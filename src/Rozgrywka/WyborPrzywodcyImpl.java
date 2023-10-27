package Rozgrywka;

import java.util.ArrayList;
import java.util.List;

public class WyborPrzywodcyImpl implements WyborPrzywodcy {
    List < String > przywodcyDruzyn = new ArrayList<>();

    @Override
    public void wyborPrzywodcy() {add("String");}

//logika biznesowa
        public void add(String cat) {

            przywodcyDruzyn.add("Cat1");
            przywodcyDruzyn.add("Cat2");
            przywodcyDruzyn.add("Cat3");
            przywodcyDruzyn.add("Cat4");
            przywodcyDruzyn.add("Cat5");
            przywodcyDruzyn.add("Cat6");

        }
        //  pd.stream().forEach(element -> System.out.println(element));
//controller
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
    }
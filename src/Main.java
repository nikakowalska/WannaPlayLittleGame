import Adnotations.MinimumListSizeHandler;
import Deck.FightStyle;
import Deck.Player1;
import Deck.StandardCard;
import Deck.Weapon;
import Gameplay.Runner;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Runner runner = new Runner(scanner);

        //run wykorzystuje sie w aplikacjach wielowatkowych - zobacz watki

        //loot:a

//        for (; ; ) {
//            if (runner.run()) {
//                //    continue;//dobre by wyjsc z duzego zagniezdzenia ifow, stary kod i ma zaszlosci, zrobili spaghetti
//                break;
//                //ponizej 20 jest goto
//
//            }
//
//        }
        MinimumListSizeHandler minimumListSizeHandler = new MinimumListSizeHandler();
        Player1 player1 = new Player1(
                null,
                List.of(new StandardCard("Chocolate&Coffee", "card1", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD),
                        new StandardCard("Chocolate&Coffee", "card1", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD),
                        new StandardCard("Chocolate&Coffee", "card1", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD),
                        new StandardCard("Chocolate&Coffee", "card1", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD),
                        new StandardCard("Chocolate&Coffee", "card1", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD),
                        new StandardCard("Chocolate&Coffee", "card1", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD)),
                List.of(new StandardCard("Chocolate&Coffee", "card1", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD)),
                0);
        boolean playerOk = minimumListSizeHandler.isValidList(player1);
        if (playerOk) {
            System.out.println("player ok");
        } else {
            System.out.println("player not ok");
        }
        scanner.close();
    }
}






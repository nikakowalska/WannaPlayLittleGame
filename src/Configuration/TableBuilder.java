package Configuration;

import Deck.StandardCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableBuilder {
    public List<StandardCard> throwCard(){
        List<StandardCard> p1Hand = new CardDeckBuilder().getDeck();
        List<StandardCard> p1Table = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <p1Hand.size(); i++) {
            System.out.println(p1Hand.);
        }
       p1Hand.forEach(card -> System.out.println(card));
        int number = Integer.parseInt(scanner.nextLine());

    }
}

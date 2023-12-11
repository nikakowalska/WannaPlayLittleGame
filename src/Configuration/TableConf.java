package Configuration;

import Deck.StandardCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TableConf {
    private final Scanner scanner;

    public TableConf(final Scanner scanner) {
        this.scanner = scanner;
    }

    public List<StandardCard> throwCard() {
        List<StandardCard> p1Hand = new CardDeckConf().getDeck();
        List<StandardCard> p1Table = new ArrayList<>();
        for (int i = 1; i < p1Hand.size() + 1; i++) {
            System.out.println(i + " - " + p1Hand.get(i - 1).getName());
            String playerChoose = scanner.nextLine();
            StandardCard card = p1Hand.get(Integer.parseInt(playerChoose) - 1);
            p1Table.add(card);
        }
        return p1Table;
    }
}

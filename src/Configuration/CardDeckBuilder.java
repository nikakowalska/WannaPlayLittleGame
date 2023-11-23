package Configuration;

import Deck.StandardCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardDeckBuilder {

    public List<StandardCard> getDeck() {
        List<StandardCard> tableCards = new StandardCardConf().getStandardCardList();
        List<StandardCard> p1Hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int a = random.nextInt(tableCards.size() - 1);//wazne
            StandardCard card = tableCards.get(a);
            if (p1Hand.contains(card)) {
                i--;
                continue;
            }

//           int i = 0;
//            do{
//                Random random = new Random();
//                int a = random.nextInt(tableCards.size() - 1);//wazne
//                StandardCard card = tableCards.get(a);
//                if (p1Hand.contains(card)) {
//                    i--;
//                    continue; }
//                i++;}
//            while (i<5);

//           int i =0;
//           while(i<5){
//            Random random = new Random();
//            int a = random.nextInt(tableCards.size() - 1);
//            StandardCard card = tableCards.get(a);
//            if (p1Hand.contains(card)) {
//            i--;
//            continue;}

            p1Hand.add(card);
        }
        return p1Hand;
    }
}
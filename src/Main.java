import Configuration.BossEnemyBuilder;
import Configuration.StandardCardBuilder;
import Configuration.TeamLeadersBuilder;
import Deck.BossEnemy;
import Deck.Player1;
import Deck.StandardCard;
import Deck.TeamLeader;
import Gameplay.Runner;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        //run wykorzystuje sie w aplikacjach wielowatkowych - zobacz watki

        //loot:
        for (; ; ) {
            if (runner.run()) {
                //    continue;//dobre by wyjsc z duzego zagniezdzenia ifow, stary kod i ma zaszlosci, zrobili spaghetti
                break;
                //ponizej 20 jest goto

            }

        }
    }
}





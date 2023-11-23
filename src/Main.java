import Gameplay.Runner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Runner runner = new Runner(scanner);

        //run wykorzystuje sie w aplikacjach wielowatkowych - zobacz watki

        //loot:a

        for (; ; ) {
            if (runner.run()) {
                //    continue;//dobre by wyjsc z duzego zagniezdzenia ifow, stary kod i ma zaszlosci, zrobili spaghetti
                break;
                //ponizej 20 jest goto

            }

        }
        scanner.close();
    }
}





package Gameplay;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu(final Scanner scanner) {
        this.scanner = scanner;
    }

    public String dispatcher() {
        String result;
        System.out.println("Do you want to play? Y/N");
        System.out.println("A. Choose your teamleader");
        System.out.println("B. Throw a card");
        System.out.println("C. Show my hand");
        result = scanner.nextLine();
        return result.toUpperCase();
    }
}

package Gameplay;

import java.util.Scanner;

public class Menu {
    public String dispatcher(){
         String result;
        System.out.println("Do you want to play? Y/N");
        System.out.println("A. Choose your teamleader");
        System.out.println("B. Throw a card");
        System.out.println("C. Show my hand");
        Scanner keyboard = new Scanner(System.in);
        result = keyboard.nextLine();
        return result.toUpperCase();
    }
}

package Gameplay;

import java.util.Scanner;

public class Menu {
    public String dispatcher(){
         String result;
        System.out.println("Do you want to play? Y/N");//dodaj menu uzytkownika:kolejne kroki np losuj karte, wyloz na stol,
        System.out.println("A. Choose your teamleader");//pobierz teamleadbuilder liste get() i powinno zwracac, z runnera przekazac liste z liderami
        System.out.println("B. Throw a card");
        Scanner keybord = new Scanner(System.in);
        result = keybord.nextLine();//zajac sie
        return result;

    }
}

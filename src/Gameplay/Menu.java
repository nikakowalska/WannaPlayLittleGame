package Gameplay;

import Exceptions.IncorrectUserSelectException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner;
    private final Map<String, String> menuOptions = new HashMap<>() {{
        put("A", "Choose your teamleader");
        put("B", "Throw a card");
        put("C", "Show my hand");
    }};

    public Menu(final Scanner scanner) {
        this.scanner = scanner;
    }

    public String dispatcher() {
        String result;
        System.out.println("Do you want to play? Y/N");
        for (Map.Entry<String, String> entry : menuOptions.entrySet()) {
            System.out.println(entry.getKey()+". "+entry.getValue());
        }
        result = scanner.nextLine().toUpperCase();
        if (userSelectIncorrectOption(result)){
            throw new IncorrectUserSelectException("123","User selected incorrect option");
        }
        return result;
    }
    private boolean userSelectIncorrectOption(String result){
        return !(menuOptions.containsKey(result)||result.equals("Y")||result.equals("N"));
    }
}

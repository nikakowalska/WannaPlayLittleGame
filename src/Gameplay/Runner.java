package Gameplay;

import Configuration.*;
import Deck.Player1;
import Exceptions.IncorrectUserSelectException;

import java.util.Scanner;

public class Runner {
    private Scanner scanner;
    private Menu menu;
    private PlayerConf playerConf;

    private TableConf tableConf;

    public Runner(final Scanner scanner) {
        this.scanner = scanner;
        this.menu = new Menu(this.scanner);
        this.playerConf = new PlayerConf(this.scanner);
        this.tableConf = new TableConf(this.scanner);

    }

    public boolean run() {
        String playerChoose;
        try {
            playerChoose = menu.dispatcher();
        } catch (IncorrectUserSelectException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getErrorId());
            return false;
        }
        if (playerChoose.equals("N")) {
            return true;
        } else if (playerChoose.equals("A")) {
            TeamLeadMenu teamLeadMenu = new TeamLeadMenu();
            teamLeadMenu.teamLeadMenu();
            System.out.println("Which Leader is Your chosen One?");
            PlayerConf playerConf = new PlayerConf(scanner);
            playerConf.getTL();
            CardDeckConf cardDeckConf = new CardDeckConf();
            //Player1 player1 = new Player1(playerConf.getTL(), cardDeckConf.getDeck(), null, 0);
            //playerConf.showTL();
            //playerBuilder.showHand();
            return false;
        } else if (playerChoose.equals("C")) {
            CardDeckConf cardDeckConf = new CardDeckConf();
            System.out.println(cardDeckConf.getDeck().toString());
        }
        return false;
    }
}














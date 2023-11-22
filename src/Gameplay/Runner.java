package Gameplay;

import Configuration.*;
import Deck.BossEnemy;
import Deck.Player1;
import Deck.StandardCard;
import Deck.TeamLeader;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public boolean run() {
        Menu menu = new Menu();
        String playerChoose = menu.dispatcher();
        if (playerChoose.equals("N")) {
            return true;
        } else if (playerChoose.equals("A")) {
TeamLeadMenu teamLeadMenu = new TeamLeadMenu();
teamLeadMenu.teamLeadMenu();
            System.out.println("Which Leader is Your chosen One?");
            PlayerBuilder playerBuilder = new PlayerBuilder();
            playerBuilder.getTL();
            CardDeckBuilder cardDeckBuilder = new CardDeckBuilder();
            Player1 player1 = new Player1(playerBuilder.getTL(), cardDeckBuilder.getDeck(), null, 0);
            playerBuilder.showTL();
            //playerBuilder.showHand();
return false;
    } else if (playerChoose.equals("C")) {
            CardDeckBuilder cardDeckBuilder = new CardDeckBuilder();
            System.out.println(cardDeckBuilder.getDeck().toString());
    }   return false;

}}














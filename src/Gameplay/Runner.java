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
            playerBuilder.showHand();
return false;
    } else if (playerChoose.equals("C")) {
            PlayerBuilder playerBuilder = new PlayerBuilder();
            playerBuilder.showHand();
    }   return false;

}}














package Gameplay;

import Configuration.TeamLeadersBuilder;
import Deck.TeamLeader;

import java.util.List;
import java.util.Scanner;

public class TeamLeadMenu {
    private String a;

    public void teamLeadMenu() {
        TeamLeadersBuilder teamLeadersBuilder = new TeamLeadersBuilder();
        List<TeamLeader> teamLeaders = teamLeadersBuilder.getTeamLeaderList();
        int i = 1;
        while (i < teamLeaders.size() + 1) {
            System.out.println(i + " - " + teamLeaders.get(i - 1).getName());
            i++;
        }
    }
}

//player1.setTeamLeader(teamLeaders.get(w-1));

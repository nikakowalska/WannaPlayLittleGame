package Gameplay;

import Configuration.TeamLeadersConf;
import Deck.TeamLeader;

import java.util.List;

public class TeamLeadMenu {

    public void teamLeadMenu() {
        TeamLeadersConf teamLeadersConf = new TeamLeadersConf();
        List<TeamLeader> teamLeaders = teamLeadersConf.getTeamLeaderList();
        int i = 1;
        while (i < teamLeaders.size() + 1) {
            System.out.println(i + " - " + teamLeaders.get(i - 1).getName());
            i++;
        }
    }
}



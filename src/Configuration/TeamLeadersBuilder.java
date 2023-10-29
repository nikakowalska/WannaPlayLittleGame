package Configuration;

import Deck.Elements;
import Deck.TeamLeader;

import java.util.ArrayList;
import java.util.List;

public class TeamLeadersBuilder {
    public List<TeamLeader> getTeamLeaderList() {
        return teamLeaderList;
    }

    public TeamLeadersBuilder() {
        this.teamLeaderList = new ArrayList<>();
        teamLeaderList.add(new TeamLeader("", Elements.FIRE, false));
        teamLeaderList.add(new TeamLeader("", Elements.FIRE, false));
        teamLeaderList.add(new TeamLeader("", Elements.FIRE, false));
        //zbudowac talie teamleadow
    }

    private List<TeamLeader> teamLeaderList;
}


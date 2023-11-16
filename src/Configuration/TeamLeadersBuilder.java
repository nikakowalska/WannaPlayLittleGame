package Configuration;

import Deck.Elements;
import Deck.TeamLeader;

import java.util.ArrayList;
import java.util.List;

public class TeamLeadersBuilder {
    private List<TeamLeader> teamLeaderList;

    public List<TeamLeader> getTeamLeaderList() {
        return teamLeaderList;
    }

    public TeamLeadersBuilder() {
        this.teamLeaderList = new ArrayList<>();
        teamLeaderList.add(new TeamLeader("lead1","HardCandy", Elements.FIRE, false));
        teamLeaderList.add(new TeamLeader("lead2","ChilliChips", Elements.LIGHTNING, false));
        teamLeaderList.add(new TeamLeader("lead3","Marshmallow", Elements.WIND, false));
        teamLeaderList.add(new TeamLeader("lead4","HotSausage", Elements.FIRE, false));
        teamLeaderList.add(new TeamLeader("lead5","Sweet&Sour", Elements.WATER, false));
        teamLeaderList.add(new TeamLeader("lead6","YourMomsDinner", Elements.FIRE, false));

    }
}


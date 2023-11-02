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
        teamLeaderList.add(new TeamLeader("HardCandy", Elements.FIRE, false));
        teamLeaderList.add(new TeamLeader("ChilliChips", Elements.LIGHTNING, false));
        teamLeaderList.add(new TeamLeader("Marshmallow", Elements.WIND, false));
        teamLeaderList.add(new TeamLeader("HotSausage", Elements.FIRE, false));
        teamLeaderList.add(new TeamLeader("Sweet&Sour", Elements.WATER, false));
        teamLeaderList.add(new TeamLeader("YourMomsDinner", Elements.FIRE, false));

    }
}


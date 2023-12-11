package Configuration;

import Deck.TeamLeader;
import Utils.FileReader;

import java.util.ArrayList;
import java.util.List;

public class TeamLeadersConf {
    private List<TeamLeader> teamLeaderList;

    public List<TeamLeader> getTeamLeaderList() {
        return teamLeaderList;
    }

    public TeamLeadersConf() {
        this.teamLeaderList = new ArrayList<>();
        FileReader fileReader = new FileReader();
        fileReader.readFile("TeamLeadersList.csv",this.teamLeaderList);

//        teamLeaderList.add(new TeamLeader("lead1", "HardCandy", Elements.FIRE, false));
//        teamLeaderList.add(new TeamLeader("lead2", "ChilliChips", Elements.LIGHTNING, false));
//        teamLeaderList.add(new TeamLeader("lead3", "Marshmallow", Elements.WIND, false));
//        teamLeaderList.add(new TeamLeader("lead4", "HotSausage", Elements.FIRE, false));
//        teamLeaderList.add(new TeamLeader("lead5", "Sweet&Sour", Elements.WATER, false));
//        teamLeaderList.add(new TeamLeader("lead6", "YourMomsDinner", Elements.FIRE, false));

    }

    @Override
    public String toString() {
        return "TeamLeadersBuilder{" +
                "teamLeaderList=" + teamLeaderList +
                '}';
    }
}


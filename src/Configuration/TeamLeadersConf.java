package Configuration;

import Builders.TeamLeaderBuilder;
import Deck.Elements;
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
        fileReader.readFile("TeamLeadersList.csv", this.teamLeaderList);
      //  TeamLeader teamLeader = new TeamLeaderBuilder().withId("lead7").withName("PowerPerfume").withBoostElement(Elements.WIND).withExtraThrow(false).build();

    }

    @Override
    public String toString() {
        return "TeamLeadersConf{" +
                "teamLeaderList=" + teamLeaderList +
                '}';
    }
}


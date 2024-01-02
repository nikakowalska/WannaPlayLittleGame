package Builders;

import Deck.Elements;
import Deck.TeamLeader;

public class TeamLeaderBuilder {
    private String id;
    public boolean extraThrow;
    private String name;
    private Elements boostElement;

    public TeamLeader build() {
        return new TeamLeader(id, name, boostElement, false);
    }

    public TeamLeaderBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public TeamLeaderBuilder withExtraThrow(boolean extraThrow) {
        this.extraThrow = extraThrow;
        return this;
    }

    public TeamLeaderBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public TeamLeaderBuilder withBoostElement(Elements boostElement) {
        this.boostElement = boostElement;
        return this;
    }

}

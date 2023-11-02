package Deck;

import Configuration.Points1;

import java.util.ArrayList;
import java.util.List;

public class Player1 {

    private String playerOneLeader;
    private int gamePoints;


    public Player1(final String playerOneLeader, final int gamePoints) {
        this.playerOneLeader = playerOneLeader;
        this.gamePoints = gamePoints;

    }

    private String getPlayerOneLeader() {
        return playerOneLeader;
    }

    private void setPlayerOneLeader(final String playerOneLeader) {
        this.playerOneLeader = playerOneLeader;
    }

    private int getGamePoints() {
        return gamePoints;
    }

    private void setGamePoints(final int gamePoints) {
        this.gamePoints = gamePoints;
    }

}

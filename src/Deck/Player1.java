package Deck;


import java.util.List;

public class Player1 {

    private String playerOneLeader;
    public int gamePoints;
    //metoda wspoldzielona przez wszystkie obiekty stworzone przez klase, nie robi sie tego. pole static moze byc komunikatem, stała
    public  List<Integer> p1list;
    private int scoreValue;

    public int getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(final int scoreValue) {
        int currentValue = this.scoreValue;
        this.scoreValue = currentValue+scoreValue;
        //ctrlw zaznacza
    }

    public Player1(final int gamePoints) {

        this.gamePoints = gamePoints;

    }

    public List<Integer> getP1list() {
        return p1list;
    }


    private int getGamePoints() {
        return gamePoints;
    }

    private void setGamePoints(final int gamePoints) {
       this.gamePoints = gamePoints;
    }

}




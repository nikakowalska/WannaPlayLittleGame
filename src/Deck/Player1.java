package Deck;


import java.util.List;

public class Player1 {

    private String playerOneLeader;
    public int gamePoints;
    public static List<Integer> p1list;

    public Player1(final int gamePoints) {

        this.gamePoints = gamePoints;

    }

    public static List<Integer> getP1list() {
        return p1list;
    }


    private int getGamePoints() {
        return gamePoints;
    }

    private void setGamePoints(final int gamePoints) {
       this.gamePoints = gamePoints;
    }


//    public static void main(String[] args) {

    public void addP1points() {
        p1list.add(gamePoints);
        int suma = 0;
        for (int points : p1list) {
            suma += points;
        }

        System.out.println("player1 achieved " + suma + "points");
    }

}




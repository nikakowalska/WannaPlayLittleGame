package Deck;


import java.util.List;

public class Player1 {
    private TeamLeader teamLeader;
    private List<StandardCard> hand;
    private List<StandardCard> table;
    private int scoreValue;

//ma do wyboru jedna z 2 akcji dobierz, zaatakuj i wyloz na stol. w kazdej rundzie(licznik runda 1) decydowac ktora akcje chce zrobic,
    //losowo dobierz karte, wyloz karte na stol, gdy mam wystarczajaco punktow akcji atakuje przypadkowego bosa


    public TeamLeader getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(final TeamLeader teamLeader) {
        this.teamLeader = teamLeader;
    }

    //static metoda wspoldzielona przez wszystkie obiekty stworzone przez klase, nie robi sie tego. pole static moze byc komunikatem, stała


    public int getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(final int scoreValue) {
        int currentValue = this.scoreValue;
        this.scoreValue = currentValue+scoreValue;
        //ctrlw zaznacza
    }

    public Player1(final TeamLeader teamLeader, final List<StandardCard> hand, final List<StandardCard> table, final int scoreValue) {
        this.teamLeader = teamLeader;
        this.hand = hand;
        this.table = table;
        this.scoreValue = scoreValue;
    }


    public List<StandardCard> getTable() {
        return table;
    }

    public void setTable(final List<StandardCard> table) {
        this.table = table;
    }

    public List<StandardCard> getHand() {
        return hand;
    }

    public void setHand(final List<StandardCard> hand) {
        this.hand = hand;
    }
}




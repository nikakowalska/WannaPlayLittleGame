package Deck;

public class TeamLeader {
    public boolean extraThrow;
    private String name;
    private Elements boostElement;

    public TeamLeader(final String name, final Elements boostElement, final boolean extraThrow) {
        this.name = name;
        this.boostElement = boostElement;
        this.extraThrow = extraThrow;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }


    private boolean isExtraThrow() {
        return extraThrow;
    }

    public void setExtraThrow(final boolean extraThrow) {
        this.extraThrow = extraThrow;
    }

    @Override
    public String toString() {
        return "TeamLeader{" +
                "name='" + name + '\'' +
                ", boostElement=" + boostElement +
                ", extraThrow=" + extraThrow +
                '}';
    }


}






package Deck;

public class TeamLeader {
    private String id;
    public boolean extraThrow;
    private String name;
    private Elements boostElement;

    public TeamLeader(final String id, final String name, final Elements boostElement, final boolean extraThrow) {
        this.id=id;
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


    public boolean isExtraThrow() {
        return extraThrow;
    }

    public void setExtraThrow(final boolean extraThrow) {
        this.extraThrow = extraThrow;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TeamLeader{" +
                "id='" + id + '\'' +
                ", extraThrow=" + extraThrow +
                ", name='" + name + '\'' +
                ", boostElement=" + boostElement +
                '}';
    }
}






package TaliaGlowna;

public class TeamLeader {

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    private String name;

    private Elements boostElement;
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

    public boolean extraThrow;

    public TeamLeader(final String name, final Elements boostElement, final boolean extraThrow) {
        this.name = name;
        this.boostElement = boostElement;
        this.extraThrow = extraThrow;
    }
}






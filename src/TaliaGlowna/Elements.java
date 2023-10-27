package TaliaGlowna;

public enum Elements {
    WATER (3), FIRE(3);

    private int getElementValue() {
        return elementValue;
    }

    private final int elementValue;

    Elements(final int i) {
    this.elementValue = i;
    }


    public boolean isFire(){
        return this==FIRE;
    }
}

package Deck;

public enum Elements {
    WATER (3), FIRE(3), WIND(3), LIGHTNING(3), NONE (0);
    private final int elementValue;
    Elements(final int i) {
        this.elementValue = i;
    }
    private int getElementValue() {
        return elementValue;
    }

    public boolean isFire(){
        return this==FIRE;
    }
}

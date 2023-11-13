package Deck;

public enum Weapon {


    SABER(7, Elements.NONE), ORB(7, Elements.NONE), BOW(7, Elements.NONE), DAGGER(7, Elements.NONE), LIRA(7, Elements.NONE), SWORD(7, Elements.NONE);

    private final int weaponAttackValue;
    public final Elements elementsValue;
    Weapon(final int weaponAttackValue, Elements elementValue) {
        this.weaponAttackValue = weaponAttackValue;
        this.elementsValue = elementValue;


    }
//feature ma miec nazwe funkcjonalnosci
    private int getWeaponAttackValue() {
        return weaponAttackValue;
    }


    public int comboAttack() {
        return weaponAttackValue + elementsValue.getElementValue();


    }
}
//
//    private int getWeaponAttackValue() {
//        return weaponAttackValue;
//    }
//
//    public void withSaber() { return; this==7}
//    public void withOrb() { return;
//        final boolean b = this == ORB;
//    }
//    public void withBow() { return; this.getWeaponAttackValue();
//    public boolean withSword() { return; this==SWORD}
//    public boolean withDagger() { return; this==DAGGER}
//    public boolean withLira() { return; this==LIRA}
//}

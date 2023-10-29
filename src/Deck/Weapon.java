package Deck;

public enum Weapon {


    SABER(7, Elements.FIRE), ORB(7, Elements.WATER), BOW(7, Elements.LIGHTNING), DAGGER(7, Elements.WIND), LIRA(7, Elements.WIND), SWORD(7, Elements.WATER);

    private final int weaponAttackValue;
    public final Elements elementsValue;
    Weapon(final int weaponAttackValue, Elements elementValue) {
        this.weaponAttackValue = weaponAttackValue;
        this.elementsValue = elementValue;


    }

    private int getWeaponAttackValue() {
        return weaponAttackValue;
    }


    public void withSword() {


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

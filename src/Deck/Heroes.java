package Deck;

public class Heroes {

    private String name;
    private Weapon weaponAttack;

    private FightStyle heroFightStyle;

    public Heroes(final String name, final Weapon weaponAttack, final FightStyle heroFightStyle) {
        this.name = name;
        this.weaponAttack = weaponAttack;
        this.heroFightStyle = heroFightStyle;
    }

    private String getName() {
        return name;
    }

    private void setName(final String name) {
        this.name = name;
    }

    private Weapon getWeaponAttack() {
        return weaponAttack;
    }

    private void setWeaponAttack(final Weapon weaponAttack) {
        this.weaponAttack = weaponAttack;
    }

    private FightStyle getHeroFightStyle() {
        return heroFightStyle;
    }

    public void setHeroFightStyle(final FightStyle heroFightStyle) {
        this.heroFightStyle = heroFightStyle;  ;
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "name='" + name + '\'' +
                ", weaponAttack=" + weaponAttack +
                ", heroFightStyle=" + heroFightStyle +
                '}';
    }
}

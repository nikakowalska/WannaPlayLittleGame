package Deck;

import java.util.List;

public class StandardCard {
    private String name;
    private String id;
    private boolean onGraveyard;
    private boolean hero;
    private boolean item;
    private int actionPoints;
    private Weapon weaponAttack;

    private FightStyle heroFightStyle;
    private List<StandardCard> standardCardList;

    public StandardCard(final String chochlik, final String id, final boolean onGraveyard, final boolean hero, final boolean item, final int actionPoints, final Weapon weaponAttack, final FightStyle heroFightStyle) {
        this.name = chochlik;
        this.id = id;
        this.onGraveyard = onGraveyard;
        this.hero = hero;
        this.item = item;
        this.actionPoints = actionPoints;
        this.weaponAttack = weaponAttack;
        this.heroFightStyle = heroFightStyle;
           }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public boolean isOnGraveyard() {
        return onGraveyard;
    }

    public void setOnGraveyard(final boolean onGraveyard) {
        this.onGraveyard = onGraveyard;
    }

    public boolean isHero() {
        return hero;
    }

    public void setHero(final boolean hero) {
        this.hero = hero;
    }

    public boolean isItem() {
        return item;
    }

    public void setItem(final boolean item) {
        this.item = item;
    }

    public int getActionPoints() {
        return actionPoints;
    }

    public void setActionPoints(final int actionPoints) {
        this.actionPoints = actionPoints;
    }



    public Weapon getWeaponAttack() {
        return weaponAttack;
    }

    public void setWeaponAttack(final Weapon weaponAttack) {
        this.weaponAttack = weaponAttack;
    }

    public FightStyle getHeroFightStyle() {
        return heroFightStyle;
    }

    public void setHeroFightStyle(final FightStyle heroFightStyle) {
        this.heroFightStyle = heroFightStyle;
    }

    @Override
    public String toString() {
        return "StandardCard{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", onGraveyard=" + onGraveyard +
                ", hero=" + hero +
                ", item=" + item +
                ", actionPoints=" + actionPoints +
                ", weaponAttack=" + weaponAttack +
                ", heroFightStyle=" + heroFightStyle +
                '}';
    }
}

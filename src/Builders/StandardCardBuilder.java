package Builders;

import Deck.FightStyle;
import Deck.StandardCard;
import Deck.Weapon;

import java.util.List;

public class StandardCardBuilder {
    private String name;
    private String id;
    private boolean onGraveyard;
    private boolean hero;
    private boolean item;
    private int actionPoints;
    private Weapon weaponAttack;
    private FightStyle heroFightStyle;
    private List<StandardCard> standardCardList;

    public StandardCard build() {
        return new StandardCard(name, id, false, false, false, 0, null, null);
    }

    public StandardCardBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public StandardCardBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public StandardCardBuilder withGraveyard(boolean onGraveyard) {
        this.onGraveyard = onGraveyard;
        return this;
    }

    public StandardCardBuilder isHero(boolean hero) {
        this.hero = hero;
        return this;
    }

    public StandardCardBuilder withItem(boolean item) {
        this.item = item;
        return this;
    }

    public StandardCardBuilder withActionPoints(int actionPoints) {
        this.id = id;
        return this;
    } public StandardCardBuilder withWeaponAttack(Weapon weaponAttack) {
        this.weaponAttack = weaponAttack;
        return this;
    } public StandardCardBuilder withFightStyle(FightStyle heroFightStyle) {
        this.heroFightStyle = heroFightStyle;
        return this;
    }
}
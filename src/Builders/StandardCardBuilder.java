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
}

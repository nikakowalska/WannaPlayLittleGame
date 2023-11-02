package Configuration;

import Deck.*;

import java.util.ArrayList;
import java.util.List;

public class HeroesBuilder {
    private List<Heroes> heroesList;
    public List<Heroes> getHeroesList() {
        return heroesList;
    }

    public HeroesBuilder() {
        this.heroesList = new ArrayList<>();
        heroesList.add(new Heroes("Chocolate&Coffee", Weapon.ORB, FightStyle.WIZARD));
        heroesList.add(new Heroes("Cappuccino", Weapon.BOW, FightStyle.HUNTER));
        heroesList.add(new Heroes("Macchiato", Weapon.DAGGER, FightStyle.THIEF));
        heroesList.add(new Heroes("FlatWhite", Weapon.SABER, FightStyle.WARRIOR));
        heroesList.add(new Heroes("Espresso", Weapon.SWORD, FightStyle.SENTINEL));
        heroesList.add(new Heroes("CoffeWith%", Weapon.LIRA, FightStyle.BARD));

    }
}

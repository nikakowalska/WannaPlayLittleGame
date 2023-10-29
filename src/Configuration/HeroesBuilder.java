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
        heroesList.add(new Heroes("", Weapon.ORB, FightStyle.WIZARD));

    }


}

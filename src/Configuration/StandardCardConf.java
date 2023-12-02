package Configuration;

import Builders.StandardCardBuilder;
import Deck.FightStyle;
import Deck.StandardCard;
import Deck.Weapon;

import java.util.ArrayList;
import java.util.List;

public class StandardCardConf {
    private List<StandardCard> standardCardList;

    public List<StandardCard> getStandardCardList() {
        return standardCardList;
    }

    public StandardCardConf() {
        this.standardCardList = new ArrayList<>();
        standardCardList.add(new StandardCard("Chocolate&Coffee", "card1", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD));
        standardCardList.add(new StandardCard("Cappuccino", "card2", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD));
        standardCardList.add(new StandardCard("Macchiato", "card3", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD));
        standardCardList.add(new StandardCard("FlatWhite", "card4", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD));
        standardCardList.add(new StandardCard("Espresso", "card5", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD));
        standardCardList.add(new StandardCard("CoffeeWith%", "card6", false, true, false, 5, Weapon.ORB, FightStyle.WIZARD));
        standardCardList.add(new StandardCard("Attack boosting snacks", "card7", false, false, false, 5, null, null));
        StandardCard sc = new StandardCardBuilder().withName("Hold my beer").withId("card8").withGraveyard(false).isHero(false).withItem(false).withActionPoints(10).build();
    }

    @Override
    public String toString() {
        return "StandardCardBuilder{" +
                "standardCardList=" + standardCardList +
                '}';
    }
}

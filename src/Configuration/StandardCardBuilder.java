package Configuration;

import Deck.FightStyle;
import Deck.StandardCard;
import Deck.Weapon;

import java.util.ArrayList;
import java.util.List;

public class StandardCardBuilder {
    private List<StandardCard> standardCardList;

    public List<StandardCard> getStandardCardList() {
        return standardCardList;
    }

    public StandardCardBuilder() {
        this.standardCardList = new ArrayList<>();
        standardCardList.add(new StandardCard("Chocolate&Coffee","card1",false,true,false,5,Weapon.ORB,FightStyle.WIZARD));
        standardCardList.add(new StandardCard("Cappuccino", "card2",false,true,false,5,Weapon.ORB,FightStyle.WIZARD));
        standardCardList.add(new StandardCard("Macchiato", "card3",false,true,false,5,Weapon.ORB,FightStyle.WIZARD));
        standardCardList.add(new StandardCard("FlatWhite", "card4",false,true,false,5,Weapon.ORB,FightStyle.WIZARD));
        standardCardList.add(new StandardCard("Espresso", "card5",false,true,false,5,Weapon.ORB,FightStyle.WIZARD));
        standardCardList.add(new StandardCard("CoffeeWith%", "card6",false,true,false,5,Weapon.ORB,FightStyle.WIZARD));
        standardCardList.add(new StandardCard("2", "card7",false,true,false,5,Weapon.ORB,FightStyle.WIZARD));
    }

    @Override
    public String toString() {
        return "StandardCardBuilder{" +
                "standardCardList=" + standardCardList +
                '}';
    }
}

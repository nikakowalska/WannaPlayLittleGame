package Configuration;

import Deck.BossEnemy;
import Deck.Elements;
import Deck.TeamLeader;

import java.util.ArrayList;
import java.util.List;

public class BossEnemyBuilder {
    private List<BossEnemy> BossEnemyList;

    public List<BossEnemy> getBossEnemyList() {
        return BossEnemyList;
    }

    public BossEnemyBuilder() {
        this.BossEnemyList = new ArrayList<>();
        BossEnemyList.add(new BossEnemy("boss1","NewSeriesOnNetflix",5, 13));
        BossEnemyList.add(new BossEnemy("boss2","Laundry",6, 14));
        BossEnemyList.add(new BossEnemy("boss3","AnotherOneBiteOfDust",7, 15));
        BossEnemyList.add(new BossEnemy("boss4","SleepingCatOnYourLap",8, 20));
        BossEnemyList.add(new BossEnemy("boss5","Nap",9, 23));
        BossEnemyList.add(new BossEnemy("boss6","90'HitsList",10, 27));

    }
}

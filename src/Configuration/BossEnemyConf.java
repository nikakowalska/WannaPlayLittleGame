package Configuration;

import Builders.BossEnemyBuilder;
import Deck.BossEnemy;

import java.util.ArrayList;
import java.util.List;

public class BossEnemyConf {
    private List<BossEnemy> BossEnemyList;

    public List<BossEnemy> getBossEnemyList() {
        return BossEnemyList;
    }

    public BossEnemyConf() {
        this.BossEnemyList = new ArrayList<>();
        BossEnemyList.add(new BossEnemy("boss1", "NewSeriesOnNetflix", 5, 13));
        BossEnemyList.add(new BossEnemy("boss2", "Laundry", 6, 14));
        BossEnemyList.add(new BossEnemy("boss3", "AnotherOneBiteOfDust", 7, 15));
        BossEnemyList.add(new BossEnemy("boss4", "SleepingCatOnYourLap", 8, 20));
        BossEnemyList.add(new BossEnemy("boss5", "Nap", 9, 23));
        BossEnemyList.add(new BossEnemy("boss6", "90'HitsList", 10, 27));
        BossEnemy bossEnemy = new BossEnemyBuilder().withId("boss7").withName("BlackFriday'sDeals").withAttackPlayer(11).withDefeated(28).build();
    }

    @Override
    public String toString() {
        return "BossEnemyBuilder{" +
                "BossEnemyList=" + BossEnemyList +
                '}';
    }
}

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
        BossEnemyList.add(new BossEnemy("NewSeriesOnNetflix", 13));
        BossEnemyList.add(new BossEnemy("Laundry", 14));
        BossEnemyList.add(new BossEnemy("AnotherOneBiteOfDust", 15));
        BossEnemyList.add(new BossEnemy("SleepingCatOnYourLap", 20));
        BossEnemyList.add(new BossEnemy("Nap", 23));
        BossEnemyList.add(new BossEnemy("90'HitsList", 27));

    }
}

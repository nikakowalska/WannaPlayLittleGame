package Builders;
import Deck.BossEnemy;
public class BossEnemyBuilder {
    private String id;
    private String name;

    private int attackPlayer;
    private int defeated;

    public BossEnemy build() {
        return new BossEnemy(id, name, attackPlayer, defeated);
    }

    public BossEnemyBuilder withName(String name) {
        this.name = name;
        return this;
    }


    public BossEnemyBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public BossEnemyBuilder withAttackPlayer(int attackPlayer) {
        this.attackPlayer = attackPlayer;
        return this;
    }

    public BossEnemyBuilder withDefeated(int defeated) {
        this.defeated = defeated;
        return this;
    }

}

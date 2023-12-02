package Deck;

public class BossEnemy {
    private String id;
    private String name;

    private int attackPlayer;
    private int defeated;


    public BossEnemy(final String id, final String name, final int attackPlayer, final int defeated) {
        this.id = id;
        this.attackPlayer = attackPlayer;
        this.defeated = defeated;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public int getAttackPlayer() {
        return attackPlayer;
    }

    public void setAttackPlayer(final int attackPlayer) {
        this.attackPlayer = attackPlayer;
    }

    public int getDefeated() {
        return defeated;
    }

    public void setDefeated(final int defeated) {
        this.defeated = defeated;
    }

    @Override
    public String toString() {
        return "BossEnemy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", attackPlayer=" + attackPlayer +
                ", defeated=" + defeated +
                '}';
    }
}


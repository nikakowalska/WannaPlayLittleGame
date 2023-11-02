package Deck;

public class BossEnemy {
    private String name;
    private int healthPoints;

    private String getName() {
        return name;
    }

    private void setName(final String name) {
        this.name = name;
    }

    private int getHealthPoints() {
        return healthPoints;
    }

    private void setHealthPoints(final int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public BossEnemy(final String name, final int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    @Override
    public String toString() {
        return "BossEnemy{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                '}';
    }


}


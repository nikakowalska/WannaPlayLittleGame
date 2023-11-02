package Deck;

public enum FightStyle {
    WARRIOR(5), WIZARD(5), HUNTER(5), SENTINEL(5), THIEF(5), BARD(5);
    //warrior plus 5 with saber
    //wizard plus 5 with orb
    //hunter plus 5 with bow
    //sentinel plus 5 with sword
    //thief plus 5 with dagger
    //bard plus 5 with lira

    private final int heroFightStyle;
    FightStyle(final int f) {
        this.heroFightStyle = f;
    }
        private int getHeroFightStyle() {
            return heroFightStyle;
        }
        public boolean warriorWithSaber() { return this==WARRIOR;}
        public boolean wizardWithOrb() { return this==WIZARD;}
        public boolean hunterWithBow() { return this==HUNTER;}
        public boolean sentinelWithSword() { return this==SENTINEL;}
        public boolean thiefWithDagger() { return this==THIEF;}
        public boolean bardWithLira() { return this==BARD;}
    }


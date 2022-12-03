public class Warrior extends Character implements Combat {
    public String getCharName() {
        return super.getCharName();
    }

    public double getHp() {
        return super.getHp() + 200;
    }
    public double getMp() {
        return super.getMp() + 105;
    }

    public double getDamageInstance() {
        return (int)Math.floor(Math.random()*(65-40+1)+40);
    }

    public double getManaCost() {
        return 20;
    }
}

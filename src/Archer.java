public class Archer extends Character implements Combat {
    public String getCharName() {
        return super.getCharName();
    }
    public double getHp() {
        return super.getHp() + 150;
    }
    public double getMp() {
        return super.getMp() + 150;
    }
    public double getDamageInstance() {
        return (int)Math.floor(Math.random()*(75-35+1)+35);
    }

    public double getManaCost() {
        return 25;
    }
}

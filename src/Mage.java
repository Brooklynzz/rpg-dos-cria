public class Mage extends Character implements Combat {
    public String getCharName() {
        return super.getCharName();
    }
    public double getHp() {
        return super.getHp() + 125;
    }
    public double getMp() {
        return super.getMp() + 200;
    }
    public double getDamageInstance() {
        return (int)Math.floor(Math.random()*(80-45+1)+45);
    }

    public double getManaCost() {
        return 40;
    }
}

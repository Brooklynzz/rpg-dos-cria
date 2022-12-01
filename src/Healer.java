public class Healer extends Character implements Combat {
    public String getCharName() {
        return super.getCharName();
    }

    public double getHp() {
        return super.getHp() + 175;
    }
    public double getMp() {
        return super.getMp() + 175;
    }
    public double getDamageInstance() {
        return (int)Math.floor(Math.random()*(60-25+1)+25);
    }

    public double getManaCost() {
        return 45;
    }
}

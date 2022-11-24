public class Warrior extends Character implements Combat{

    public String getCharName() {
        return super.getCharName();
    }

    public double getHp() {
        return super.getHp() + 200;
    }
    public double getMp() {
        return super.getMp() + 125;
    }

    public double getDamageInstance() {
        return (int)Math.floor(Math.random()*(80-40+1)+40);
    }
}

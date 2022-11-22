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
    @Override
    public double getDamageInstance1() {
        return 25;
    }
    public double getDamageInstance2() {
        return (int)Math.floor(Math.random()*(100-40+1)+40);
    }
}

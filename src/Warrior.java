public class Warrior extends Character implements Combat{

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
        int randomDamage = (int)Math.floor(Math.random()*(50-15+1)+15);
        return randomDamage;
    }
}

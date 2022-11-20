public class Healer extends Character implements Combat {

    public double getHp() {
        return super.getHp() + 175;
    }
    public double getMp() {
        return super.getMp() + 175;
    }
    @Override
    public double getDamageInstance1() {
        return 10;
    }
    public double getDamageInstance2() {
        int randomDamage = (int)Math.floor(Math.random()*(50-15+1)+15);
        return randomDamage;
    }
}

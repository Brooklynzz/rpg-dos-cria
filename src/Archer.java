public class Archer extends Character implements Combat {
    public double getHp() {
        return super.getHp() + 150;
    }
    public double getMp() {
        return super.getMp() + 150;
    }
    @Override
    public double getDamageInstance1() {
        return 20;
    }
    public double getDamageInstance2() {
        int randomDamage = (int)Math.floor(Math.random()*(50-15+1)+15);
        return randomDamage;
    }
}

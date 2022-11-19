public class Warrior extends Character {

    @Override
    public int getHp() {
        return super.getHp() + 200;
    }

    @Override
    public int getMp() {
        return super.getMp() + 150;
    }
}

public class TesteAtaque {
    public static void main(String[] args) throws InterruptedException {
        Character c1 = new Character();
        Warrior wrr = new Warrior();

        c1.setWarrior(wrr);

        Character c2 = new Character();
        Archer arch = new Archer();

        c2.setArcher(arch);

        CombatManager cm = new CombatManager();
        System.out.println(cm.startCombat(wrr,arch));
    }
}

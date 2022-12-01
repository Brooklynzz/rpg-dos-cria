public class NameTest {
    public static void main(String[] args) {
        Character cu = new Character();
        Warrior wrr = new Warrior();
        cu.setWarrior(wrr);
        Character teste = cu.getBaseInstance();

        System.out.println(teste.getMp());
        System.out.println(teste.getManaCost());
        System.out.println(teste.getManaCost());
        System.out.println(teste.getManaCost());
    }
}

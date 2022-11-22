public class NameTest {
    public static void main(String[] args) {
        Character c = new Character();
        c.setCharName("jose");
        Warrior wrr = new Warrior();

        c.setBaseInstance(wrr);
        System.out.println(wrr.getCharName());
        System.out.println(wrr.getHp());
    }
}

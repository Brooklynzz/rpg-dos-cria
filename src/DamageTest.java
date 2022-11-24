public class DamageTest {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            int random = (int)Math.floor(Math.random()*(90-40+1)+40);
            System.out.println(random);
            i++;
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharacterNames {

    public String selectName() {
        List<String> firstName = new ArrayList<>();
        firstName.add("América");
        firstName.add("Malek");
        firstName.add("Fellipe");
        firstName.add("Bruno");
        firstName.add("Sheila");
        firstName.add("Eni");

        List<String> lastName = new ArrayList<>();
        lastName.add("Puxa Cabo");
        lastName.add("Mundi");
        lastName.add("Melo");
        lastName.add("Tapete");

        Random random = new Random();
        int firstIndex = random.nextInt(firstName.size());
        int lastIndex = random.nextInt(lastName.size());

        String randomFirst = firstName.get(firstIndex);
        String randomLast = lastName.get(lastIndex);

        return randomFirst + " " + randomLast;
    }

    public CharacterNames() {

    }

}

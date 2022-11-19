import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Character character = new Character();
        System.out.println("Escolha o nome do seu personagem:");
        String charName = input.nextLine();
        character.setCharName(charName);

        System.out.println("Escolha sua raça:");
        System.out.println("1 - Anão");
        System.out.println("2 - Humano");
        System.out.println("3 - Elfo Negro");
        System.out.println("4 - Orc");
        int race = input.nextInt();

        System.out.println("Escolha sua classe:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");
        System.out.println("4 - Curandeiro");
        int role = input.nextInt();

        character.setRace(race);
        Warrior warriorInstance = null;
        Mage mageInstance = null;
        Archer archerInstance = null;
        Healer healerInstance = null;
        Character baseInstance = null;

        switch (role) {
            case 1:
                warriorInstance = new Warrior();
                character.setGuerreiro(warriorInstance);
                baseInstance = warriorInstance;
                break;
            case 2:
                mageInstance = new Mage();
                character.setMago(mageInstance);
                baseInstance = mageInstance;
                break;
            case 3:
                archerInstance = new Archer();
                character.setArcher(archerInstance);
                baseInstance = archerInstance;
                break;
            case 4:
                healerInstance = new Healer();
                character.setHealer(healerInstance);
                baseInstance = healerInstance;
                break;
            default:
                System.out.println("Sem classe");;
        }

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(character.getCharName() + " é um " + character.getRace() + " de classe " + character.getChosenRole() + " com " + baseInstance.getHp() +
                " de Vida e " + baseInstance.getMp() + " de Mana");
        System.out.println("-----------------------------------------------------------------------------------------------");

        input.close();
    }
}

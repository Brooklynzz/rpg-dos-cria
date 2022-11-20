import java.util.Scanner;

public class CharacterCreator {

    public Character newChar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o nome do personagem:");
        String charName = input.nextLine();

        System.out.println("-----------------------------------------------");
        System.out.println("Escolha sua raça:");
        System.out.println("1 - Anão");
        System.out.println("2 - Humano");
        System.out.println("3 - Elfo Negro");
        System.out.println("4 - Orc");
        int race = input.nextInt();

        System.out.println("-----------------------------------------------");
        System.out.println("Escolha sua classe:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");
        System.out.println("4 - Curandeiro");
        int role = input.nextInt();

        Character character = new Character(charName);
        character.setRaca(race);
        character.setRole(role);
        Character baseInstance = character.getBaseInstance();

        return character;
    }

    public Character randomEnemy() {
        int min = 1;
        int max = 4;
        int randomRace = (int)Math.floor(Math.random()*(max-min+1)+min);
        int randomRole = (int)Math.floor(Math.random()*(max-min+1)+min);

        Character characterEnemy = new Character("Inimigo");
        characterEnemy.setRaca(randomRace);
        characterEnemy.setRole(randomRole);
        Character enemyBaseInstance = characterEnemy.getBaseInstance();
        return characterEnemy;
    }
}

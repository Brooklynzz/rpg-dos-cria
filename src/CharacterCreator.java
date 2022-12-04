/**
 * Classe responsável pela criação dos personagens, tanto o seu próprio, quanto o seu inimigo. Há também o método
 * para criação de um inimigo aleatório. Tudo é feito por meio de um scanner que coleta dados do console.
 *
 */

import java.util.Scanner;

public class CharacterCreator {

    public Character newChar() {
        Scanner input = new Scanner(System.in);
        System.out.println(ConsoleColors.GREEN + "Escolha o nome do personagem:" + ConsoleColors.RESET);
        String charName = input.nextLine();

        System.out.println("-----------------------------------------------");
        System.out.println(ConsoleColors.GREEN + "Escolha sua raça:" + ConsoleColors.RESET);
        System.out.println("1 - Anão");
        System.out.println("2 - Humano");
        System.out.println("3 - Elfo Negro");
        System.out.println("4 - Orc");
        int race = input.nextInt();

        System.out.println("-----------------------------------------------");
        System.out.println(ConsoleColors.GREEN + "Escolha sua classe:" + ConsoleColors.RESET);
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

/**
 * Método para criação de um inimigo aleatório abaixo.
 */

    public Character randomEnemy() {
        int min = 1;
        int max = 4;
        int randomRace = (int)Math.floor(Math.random()*(max-min+1)+min);
        int randomRole = (int)Math.floor(Math.random()*(max-min+1)+min);

        CharacterNames nomeAleatorio = new CharacterNames();

        Character characterEnemy = new Character(nomeAleatorio.selectName());
        characterEnemy.setRaca(randomRace);
        characterEnemy.setRole(randomRole);
        Character enemyBaseInstance = characterEnemy.getBaseInstance();
        return characterEnemy;
    }
}

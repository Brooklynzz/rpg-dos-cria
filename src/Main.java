import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o nome do seu personagem:");
        String charName = input.nextLine();

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

        Character character = new Character(charName);
        character.setRaca(race);
        character.setRole(role);
        Character baseInstance = character.getBaseInstance();

//        Warrior instancedWarrior = null;
//        Mage instancedMage = null;
//        Archer instancedArcher = null;
//        Healer instancedHealer = null;
//
//            switch (role) {
//                case 1:
//                    instancedWarrior = new Warrior();
//                    baseInstance = instancedWarrior;
//                    character.setWarrior(instancedWarrior);
//                    break;
//                case 2:
//                    instancedMage = new Mage();
//                    baseInstance = instancedMage;
//                    character.setMage(instancedMage);
//                    break;
//                case 3:
//                    instancedArcher = new Archer();
//                    baseInstance = instancedArcher;
//                    character.setArcher(instancedArcher);
//                    break;
//                case 4:
//                    instancedHealer = new Healer();
//                    baseInstance = instancedHealer;
//                    character.setHealer(instancedHealer);
//                    break;
//                default:
//                    System.out.println("Sem classe");;
//            }

            System.out.println(character.getCharName() + " é um " + character.getRaca() + " de classe " + character.getChosenRole() +
                    " com " + baseInstance.getHp() + " de Vida e " + baseInstance.getMp() + " de Mana");

        System.out.println("Gerando um oponente digno...");
        Thread.sleep(5000);

        int min = 1;
        int max = 4;
        int randomRace = (int)Math.floor(Math.random()*(max-min+1)+min);
        int randomRole = (int)Math.floor(Math.random()*(max-min+1)+min);

        Character characterEnemy = new Character("Inimigo");
        characterEnemy.setRaca(randomRace);
        characterEnemy.setRole(randomRole);
        Character enemyBaseInstance = characterEnemy.getBaseInstance();

        System.out.println("Seu oponente se chama: " + characterEnemy.getCharName() + ", ele é um " +
                characterEnemy.getRaca() + " de classe " + characterEnemy.getChosenRole() +
                " com " + enemyBaseInstance.getHp() + " de Vida e " + enemyBaseInstance.getMp() + " de Mana");

        input.close();
    }
}

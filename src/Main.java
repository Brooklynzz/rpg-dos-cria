import java.util.Scanner;
import static java.lang.Thread.sleep;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        CharacterCreator creator = new CharacterCreator();
        Character character = creator.newChar();
        Character baseInstance = character.getBaseInstance();
        System.out.println("-----------------------------------------------");
        System.out.println(ConsoleColors.RED + "1 - Aleatorizar inimigo \n2 - Criar inimigo\n" + ConsoleColors.RESET);
        int randomEnemy = input.nextInt();

        Character characterEnemy;

        if (randomEnemy == 2) {
            Character enemy = creator.newChar();
            characterEnemy = enemy;
        } else {
            Character enemy = creator.randomEnemy();
            characterEnemy = enemy;
        }
        Character enemyBaseInstance = characterEnemy.getBaseInstance();

        System.out.println(ConsoleColors.GREEN + character.getCharName() + " é um " + character.getRaca() + " de classe " + character.getChosenRole() +
                " com " + baseInstance.getHp() + " de Vida e " + baseInstance.getMp() + " de Mana" + ConsoleColors.RESET);

        System.out.println(ConsoleColors.RED_BOLD + "Gerando um oponente digno..." + ConsoleColors.RESET);
        Thread.sleep(5000);


        System.out.println("ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー");
        System.out.println(ConsoleColors.RED + "Seu oponente se chama: " + characterEnemy.getCharName() + ", ele é um " +
                characterEnemy.getRaca() + " de classe " + characterEnemy.getChosenRole() +
                " com " + enemyBaseInstance.getHp() + " de Vida e " + enemyBaseInstance.getMp() + " de Mana" + ConsoleColors.RESET);

        System.out.println(ConsoleColors.YELLOW + "Se preparando para o duelo..." + ConsoleColors.RESET);
        Thread.sleep(5000);
        //System.out.println(character.getCharName() + " desfere o primeiro golpe em " + characterEnemy.getCharName());
        Thread.sleep(3000);
        CombatManager cm = new CombatManager();
        cm.startCombat(character, baseInstance, characterEnemy, enemyBaseInstance);

        input.close();
    }
}

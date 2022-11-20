import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        CharacterCreator creator = new CharacterCreator();
        Character character = creator.newChar();
        Character baseInstance = character.getBaseInstance();
        System.out.print("1 - Aleatorizar inimigo \n2 - Criar inimigo\n");
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

        System.out.println(character.getCharName() + " é um " + character.getRaca() + " de classe " + character.getChosenRole() +
                    " com " + baseInstance.getHp() + " de Vida e " + baseInstance.getMp() + " de Mana");

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Gerando um oponente digno...");
        Thread.sleep(5000);


        System.out.println("--------------------------------------------------------------------");
        System.out.println("Seu oponente se chama: " + characterEnemy.getCharName() + ", ele é um " +
                characterEnemy.getRaca() + " de classe " + characterEnemy.getChosenRole() +
                " com " + enemyBaseInstance.getHp() + " de Vida e " + enemyBaseInstance.getMp() + " de Mana");

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Se preparando para o duelo...");
        Thread.sleep(5000);
        System.out.println(character.getCharName() + " desfere o primeiro golpe em " + characterEnemy.getCharName());
        Thread.sleep(3000);
        CombatManager cm = new CombatManager();
        cm.startCombat(baseInstance, enemyBaseInstance);

    }
}

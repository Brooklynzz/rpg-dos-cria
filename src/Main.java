import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        Scanner input = new Scanner(System.in);
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

        character.setRaca(race);

        Warrior instancedWarrior = null;
        Mage instancedMage = null;
        Archer instancedArcher = null;
        Healer instancedHealer = null;
        Character baseInstance = null;



            switch (role) {
                case 1:
                    instancedWarrior = new Warrior();
                    baseInstance = instancedWarrior;
                    character.setWarrior(instancedWarrior);
                    break;
                case 2:
                    instancedMage = new Mage();
                    baseInstance = instancedMage;
                    character.setMage(instancedMage);
                    break;
                case 3:
                    instancedArcher = new Archer();
                    baseInstance = instancedArcher;
                    character.setArcher(instancedArcher);
                    break;
                case 4:
                    instancedHealer = new Healer();
                    baseInstance = instancedHealer;
                    character.setHealer(instancedHealer);
                    break;
                default:
                    System.out.println("Sem classe");;
            }

        System.out.println("Seu personagem é um " + character.getRaca() + " de classe " + character.getChosenRole() + " com " + baseInstance.getHp() +
                " de Vida e " + baseInstance.getMp() + " de Mana");

        input.close();
    }
}

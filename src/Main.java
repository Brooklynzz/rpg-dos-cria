import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
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

        personagem.setRaca(race);

            switch (role) {
                case 1:
                    Guerreiro guerreiro = new Guerreiro();
                    personagem.setGuerreiro(guerreiro);
                    break;
                case 2:
                    Mago mago = new Mago();
                    personagem.setMago(mago);
                    break;
                case 3:
                    Arqueiro arqueiro = new Arqueiro();
                    personagem.setArqueiro(arqueiro);
                    break;
                case 4:
                    Curandeiro curandeiro = new Curandeiro();
                    personagem.setCurandeiro(curandeiro);
                    break;
                default:
                    System.out.println("Sem classe");;
            }

        System.out.println("Seu personagem é um " + personagem.getRaca() + " de classe " + personagem.getChosenRole() + " com " + personagem.getHp() +
                " de Vida e " + personagem.getMp() + " de Mana");

        input.close();
    }
}

/**
 * Classe mãe que serve de base para o modelo de criação dos personagens, cada personagem recebe outra classe, que
 * definirá sua role.
 *
 * @author Brooklyn
 * @version 0.1
 */

public class Character {
    private String charName;
    private String raca;
    private String chosenRole;
    private String enemyRole;
    private double hp;
    private double mp;
    private Warrior warrior;
    private Mage mage;
    private Archer archer;
    private Healer healer;
    private Character baseInstance;
    private double damageInstance;
    private double manaCost;

    public Character() {

    }

    public Character(String charName) {
        this.charName = charName;
    }

    public String getCharName() {
        return this.charName;
    }

    public void setRaca(int id) {
        switch (id) {
            case 1:
                this.raca = "Anão";
                break;
            case 2:
                this.raca = "Humano";
                break;
            case 3:
                this.raca = "Elfo Negro";
                break;
            case 4:
                this.raca = "Orc";
                break;
            default:
                this.raca = "Sem Raça";
        }
    }

    public String getRaca() {
        return raca;
    }

    public String getChosenRole() {
        return chosenRole;
    }

    Warrior instancedWarrior = null;
    Mage instancedMage = null;
    Archer instancedArcher = null;
    Healer instancedHealer = null;

    public int setRole(int role) {
        switch (role) {
            case 1:
                instancedWarrior = new Warrior();
                baseInstance = instancedWarrior;
                this.setWarrior(instancedWarrior);
                break;
            case 2:
                instancedMage = new Mage();
                baseInstance = instancedMage;
                this.setMage(instancedMage);
                break;
            case 3:
                instancedArcher = new Archer();
                baseInstance = instancedArcher;
                this.setArcher(instancedArcher);
                break;
            case 4:
                instancedHealer = new Healer();
                baseInstance = instancedHealer;
                this.setHealer(instancedHealer);
                break;
            default:
                System.out.println("Sem classe");
        }
        return role;
    }

    public double getHp() {
        return hp;
    }

    public double setHp(double hp) {
        this.hp = hp;
        return hp;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getDamageInstance() {
        return damageInstance;
    }

    public double getManaCost() {
        return this.manaCost;
    }

    public void setChosenRole(String chosenRole) {
        this.chosenRole = chosenRole;
    }

    public Character getBaseInstance() {
        return baseInstance;
    }

    public void setBaseInstance(Character baseInstance) {
        this.baseInstance = baseInstance;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
        this.setChosenRole("Guerreiro");
        this.baseInstance = warrior;
    }

    public Mage getMage() {
        return mage;
    }

    public void setMage(Mage mage) {
        this.mage = mage;
        this.setChosenRole("Mago");
    }

    public Archer getArcher() {
        return archer;
    }

   public void setArcher(Archer archer) {
        this.archer = archer;
        this.setChosenRole("Arqueiro");
    }

    public Healer getHealer() {
        return healer;
    }

    public void setHealer(Healer healer) {
        this.healer = healer;
        this.setChosenRole("Curandeiro");
    }

    public double damage(double valor) {
        double v = this.hp -= valor;
        return this.hp;
    }

    public double manaUsage(double valor) {
        double v = this.mp -= valor;
        return this.mp;
    }

    public double heal(double valor) {
        double v = this.hp += valor;
        return this.hp;
    }
}

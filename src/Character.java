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
    private double damageInstance1;
    private double damageInstance2;

    public double getDamageInstance1() {
        return damageInstance1;
    }

    public void setDamageInstance1(int damageInstance1) {
        this.damageInstance1 = damageInstance1;
    }

    public double getDamageInstance2() {
        return damageInstance2;
    }

    public void setDamageInstance2(double damageInstance2) {
        this.damageInstance2 = damageInstance2;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Character(String charName) {
        this.charName = charName;
    }

    public Character() {

    }

    public void setRaca(String raca) {
        this.raca = raca;
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

    public double getHp() {
        return hp;
    }

    public double setHp(double hp) {
        this.hp = hp;
        return hp;
    }

    public double damage(double valor) {
        double v = this.hp -= valor;
        return this.hp;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
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
    //Character baseInstance = null;

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
}

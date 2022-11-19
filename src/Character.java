public class Character {
    private String charName;
    private String raca;
    private String chosenRole;
    private String enemyRole;
    private int hp;
    private int mp;
    private Warrior warrior;
    private Mage mage;
    private Archer archer;
    private Healer healer;
    private Character baseInstance;

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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
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

//    public void setEnemyRole(int idRole) {
//        switch (idRole) {
//            case 1:
//                this.chosenRole = "Guerreiro";
//                break;
//            case 2:
//                this.chosenRole = "Mago";
//                break;
//            case 3:
//                this.chosenRole = "Arqueiro";
//                break;
//            case 4:
//                this.chosenRole = "Curandeiro";
//                break;
//            default:
//                this.chosenRole = "Sem Classe";
//        }
//    }

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

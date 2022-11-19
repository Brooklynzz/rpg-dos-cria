public class Character {
    private String raca;
    private String chosenRole;
    private int hp;
    private int mp;
    private Warrior warrior;
    private Mage mage;
    private Archer archer;
    private Healer healer;

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setChosenRole(String chosenRole) {
        this.chosenRole = chosenRole;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
        this.setChosenRole("Guerreiro");
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

    public String getRaca() {
        return raca;
    }

    public String getChosenRole() {
        return chosenRole;
    }
}

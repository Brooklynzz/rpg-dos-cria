public class Character {
    private String charName;
    private String race;
    private String chosenRole;
    private int hp;
    private int mp;
    private Warrior warrior;
    private Mage mage;
    private Archer archer;
    private Healer healer;


    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Warrior getGuerreiro() {
        return warrior;
    }

    public void setGuerreiro(Warrior warrior) {
        this.warrior = warrior;
        this.chosenRole = "Guerreiro";
    }

    public Mage getMago() {
        return mage;
    }

    public void setMago(Mage mage) {
        this.mage = mage;
        this.chosenRole = "Mago";
    }

    public Archer getArcher() {
        return archer;
    }

    public void setArcher(Archer archer) {
        this.archer = archer;
        this.chosenRole = "Arqueiro";
    }

    public Healer getHealer() {
        return healer;
    }

    public void setHealer(Healer healer) {
        this.healer = healer;
        this.chosenRole = "Curandeiro";
    }

    public int getHp() {
        return this.hp;
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


    public void setRace(int id) {
        switch (id) {
            case 1:
                this.race = "Anão";
                break;
            case 2:
                this.race = "Humano";
                break;
            case 3:
                this.race = "Elfo Negro";
                break;
            case 4:
                this.race = "Orc";
                break;
            default:
                this.race = "Sem Raça";
        }
    }

    public String getRace() {
        return race;
    }

    public String getChosenRole() {
        return this.chosenRole;
    }
}

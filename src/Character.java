public class Personagem {
    private String raca;
    private String chosenRole;
    private int hp;
    private int mp;
    private Guerreiro guerreiro;
    private Mago mago;
    private Arqueiro arqueiro;
    private Curandeiro curandeiro;


    public Guerreiro getGuerreiro() {
        return guerreiro;
    }

    public void setGuerreiro(Guerreiro guerreiro) {
        this.guerreiro = guerreiro;
        this.chosenRole = "Guerreiro";
    }

    public Mago getMago() {
        return mago;
    }

    public void setMago(Mago mago) {
        this.mago = mago;
        this.chosenRole = "Mago";
    }

    public Arqueiro getArqueiro() {
        return arqueiro;
    }

    public void setArqueiro(Arqueiro arqueiro) {
        this.arqueiro = arqueiro;
        this.chosenRole = "Arqueiro";
    }

    public Curandeiro getCurandeiro() {
        return curandeiro;
    }

    public void setCurandeiro(Curandeiro curandeiro) {
        this.curandeiro = curandeiro;
        this.chosenRole = "Curandeiro";
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

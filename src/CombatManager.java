import java.util.Objects;

public class CombatManager  {
        boolean manaAvailable = true;

    public void primaryAttack(Character cdata, Character c, Character edata, Character e) {
        double attackerDamage1 = c.getDamageInstance();
        System.out.println("------------------------------------");
        System.out.println(ConsoleColors.RED_BACKGROUND + cdata.getCharName() + " está atacando agora!" + ConsoleColors.RESET);
        if (attackerDamage1 > 70) {
            System.out.println(ConsoleColors.RED_BRIGHT + attackerDamage1 + " de dano, GOLPE CRÍTICO!" + ConsoleColors.RESET);
        } else {
            System.out.println("O dano do golpe é de " + attackerDamage1);
        }

        double attackedChar = e.getHp();
        double manaBurn = c.getManaCost();
        double manaUsage = c.manaUsage(manaBurn);
        if (c.getMp() > 0) {
            System.out.println(ConsoleColors.CYAN_BOLD + cdata.getCharName() + " gastou " + manaBurn + " de mana e agora possui " + c.getMp() + ConsoleColors.RESET);
            System.out.println("Vida antes do ataque: " + attackedChar);
            e.damage(attackerDamage1);
            System.out.println(ConsoleColors.BLACK_BACKGROUND_BRIGHT + edata.getCharName()+ " ficou com " + e.getHp() + " de vida!" + ConsoleColors.RESET);
        } else {
            manaAvailable = false;
            System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + cdata.getCharName() + " PERDEU POR FALTA DE MANA! " +  ConsoleColors.RESET);
            System.exit(0);
        }
        double healChance = (int)Math.floor(Math.random()*(10-1+1)+1);
        if (Objects.equals(cdata.getChosenRole(), "Curandeiro") && healChance >= 5) {
            c.heal(35);
            System.out.println(ConsoleColors.PURPLE_BRIGHT + cdata.getCharName() + " se curou em 50 de vida!" + ConsoleColors.RESET);
        }
    }

    public void startCombat(Character cdata, Character c, Character edata, Character e) throws InterruptedException {
        double enemyHp = e.getHp();
        double currentHp = c.getHp();

        while (enemyHp > 0 && currentHp > 0 && manaAvailable) {
            Thread.sleep(4000);
            this.primaryAttack(cdata, c, edata, e);
            Thread.sleep(4000);
            this.primaryAttack(edata, e, cdata, c);
            enemyHp = e.getHp();
            currentHp = c.getHp();

            if (enemyHp <= 0) {
                System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + cdata.getCharName() + " DERROTOU " + edata.getCharName().toUpperCase() + ConsoleColors.RESET);
                System. exit(0);
            } else if (currentHp <= 0) {
                System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + edata.getCharName() + " DERROTOU " + cdata.getCharName() +  ConsoleColors.RESET);
                System. exit(0);
            }
        }
    }
}
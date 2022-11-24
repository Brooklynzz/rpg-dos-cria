public class CombatManager{

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
        System.out.println("Vida antes do ataque: " + attackedChar);
        e.damage(attackerDamage1);
        System.out.println(ConsoleColors.BLACK_BACKGROUND_BRIGHT + edata.getCharName()+ " ficou com " + e.getHp() + " de vida!" + ConsoleColors.RESET);
    }

    public void startCombat(Character cdata, Character c, Character edata, Character e) throws InterruptedException {
        double enemyHp = e.getHp();
        double currentHp = c.getHp();

        while (enemyHp > 0 && currentHp > 0) {
            Thread.sleep(4000);
            this.primaryAttack(cdata, c, edata, e);
            Thread.sleep(4000);
            this.primaryAttack(edata, e, cdata, c);
            enemyHp = e.getHp();
            currentHp = c.getHp();

            if (enemyHp <= 0) {
                System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + cdata.getCharName() + " DERROTOU " + edata.getCharName().toUpperCase() + ConsoleColors.RESET);
                break;
            } else if (currentHp <= 0) {
                System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + edata.getCharName() + " DERROTOU " + cdata.getCharName() +  ConsoleColors.RESET);
                break;
            }
        }
    }
}
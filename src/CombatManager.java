public class CombatManager{

    public void primaryAttack(Character cdata, Character c, Character edata, Character e) {
        double attackerDamage1 = c.getDamageInstance1();
        System.out.println("------------------------------------");
        System.out.println(ConsoleColors.RED_BACKGROUND + cdata.getCharName() + " está atacando agora!" + ConsoleColors.RESET);
        System.out.println("O dano do golpe é de " + attackerDamage1);
        double attackedChar = e.getHp();
        System.out.println("Vida antes do ataque: " + attackedChar);
        e.damage(attackerDamage1);
        System.out.println(ConsoleColors.BLACK_BACKGROUND_BRIGHT + edata.getCharName()+ " ficou com " + e.getHp() + " de vida!" + ConsoleColors.RESET);
    }

    public void secondaryAttack(Character cdata, Character c, Character edata, Character e) {
        double attackerDamage2 = c.getDamageInstance2();
        System.out.println("------------------------------------");
        System.out.println(ConsoleColors.RED_BACKGROUND + cdata.getCharName() + " está atacando agora!" + ConsoleColors.RESET);
        System.out.println("O dano do golpe é de " + attackerDamage2);
        double attackedChar = e.getHp();
        System.out.println("Vida antes do ataque: " + attackedChar);
        e.damage(attackerDamage2);

        System.out.println(ConsoleColors.BLACK_BACKGROUND_BRIGHT + edata.getCharName()+ " ficou com " + e.getHp() + " de vida!" + ConsoleColors.RESET);
    }

    public void startCombat(Character cdata, Character c, Character edata, Character e) throws InterruptedException {
        CombatManager cm = new CombatManager();
        double enemyHp = e.getHp();
        double currentHp = c.getHp();
//        do {
//            Thread.sleep(4000);
//            cm.primaryAttack(cdata, c, edata, e);
//            Thread.sleep(4000);
//            cm.secondaryAttack(edata, e, cdata, c);
//        } while (enemyHp > 0 || currentHp > 0);

        while (enemyHp > 0 && currentHp > 0) {
            Thread.sleep(4000);
            cm.primaryAttack(cdata, c, edata, e);
            Thread.sleep(4000);
            cm.primaryAttack(edata, e, cdata, c);
            enemyHp = e.getHp();
            currentHp = c.getHp();

            if (enemyHp <= 0) {
                System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + " VOCÊ DERROTOU " + edata.getCharName().toUpperCase() + ConsoleColors.RESET);
                break;
            } else if (currentHp <= 0) {
                System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + "VOCÊ PERDEU" +  ConsoleColors.RESET);
                break;
            }
        }
    }
}
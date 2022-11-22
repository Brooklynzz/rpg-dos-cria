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

        if (e.getHp() > 0.0) {
            System.out.println(edata.getCharName() + " ficou com " + e.getHp() + " de vida!");
        } else {
            System.out.println(edata.getCharName() + " ficou com " + Math.max(0, e.getHp()) + " de vida!");
        }
    }

    public void startCombat(Character cdata, Character c, Character edata, Character e) throws InterruptedException {
        CombatManager cm = new CombatManager();
            double enemyHp = e.getHp();
            double currentHp = c.getHp();
        do {
            cm.primaryAttack(cdata, c, edata, e);
            System.out.println("INFERNOOOOO " + e.getHp());
            enemyHp = e.getHp();
            Thread.sleep(5000);
            cm.secondaryAttack(edata, e, cdata, c);
        }while(enemyHp >= 0.0 || currentHp >= 0.0);
    }
}
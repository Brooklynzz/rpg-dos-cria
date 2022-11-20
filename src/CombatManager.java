import static java.lang.Thread.sleep;
public class CombatManager{

    public void primaryAttack(Character c, Character e) {
        double attackerDamage1 = c.getDamageInstance1();
        System.out.println("O dano do golpe é de " + attackerDamage1);
        double attackedChar = e.getHp();
        System.out.println("Vida antes do ataque: " + attackedChar);
        e.damage(attackerDamage1);
        System.out.println("O inimigo ficou com " + e.getHp() + " de vida!");
    }

    public void secondaryAttack(Character c, Character e) {
        double attackerDamage2 = c.getDamageInstance2();
        System.out.println("------------------------------------");
        System.out.println("Desferindo o segundo golpe!");
        System.out.println("O dano do golpe é de " + attackerDamage2);
        double attackedChar = e.getHp();
        System.out.println("Vida antes do ataque: " + attackedChar);
        e.damage(attackerDamage2);

        System.out.println("O inimigo ficou com " + e.getHp() + " de vida!");
    }

    public double startCombat(Character c, Character e) throws InterruptedException {
        CombatManager cm = new CombatManager();
        cm.primaryAttack(c, e);
        Thread.sleep(5000);
        cm.secondaryAttack(c, e);
        return e.getHp();
    }
}

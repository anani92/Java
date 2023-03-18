
public class AttackWithLazer implements  AttackBehavior {
    private Integer damage;

    public AttackWithLazer(Integer damage) {
        this.damage = damage;
    }
    public void attack(Entity target) {
        if (target.getHealth() > 0) {
            target.takeDamage(damage);
            System.out.println("Infected total Damage " + damage + "to " + target.getName());
        }
    }
}

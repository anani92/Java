
public class AttackWithMissle implements  AttackBehavior{
    private Integer damage;

    public AttackWithMissle(Integer damage) {
        this.damage = damage;
    }
    public void attack(Entity target) {
        if (target.getHealth() > 0) {
            target.takeDamage(damage);
            System.out.println("Infected total Damage " + damage + "to " + target.getName());
        }
    }

}

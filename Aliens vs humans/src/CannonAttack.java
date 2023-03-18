public class CannonAttack implements AttackBehavior {
    private Integer damage;
    public CannonAttack(Integer damage) {
        this.damage = damage;
    }
    public void attack(Entity target) {
        System.out.println("Firing cannons at " + target.getName() + "...");
        target.takeDamage(damage);

    }
}
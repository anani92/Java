public class HumanShip extends Entity {
    public HumanShip(String name, Integer health, MoveBehavior moveBehavior, RetreatBehavior retreatBehavior, AttackBehavior attackBehavior, TakeDamageBehavior takeDamageBehavior) {
        super(name, health, moveBehavior, retreatBehavior, attackBehavior, takeDamageBehavior);
        this.setTakeDamageBehavior(new TakeLaserDamage(this));
    }



    @Override
    public void display() {
        System.out.println("Human ship: " + getName());
    }
    public void attack(Entity target) {
        getAttackBehavior().attack(target);
    }
}

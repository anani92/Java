
public class AlienShip extends Entity  {
    public AlienShip(String name, Integer health, MoveBehavior moveBehavior, RetreatBehavior retreatBehavior, AttackBehavior attackBehavior, TakeDamageBehavior takeDamageBehavior) {

        super(name, health, moveBehavior, retreatBehavior, attackBehavior, takeDamageBehavior);
        this.setTakeDamageBehavior(new TakeCannonDamage(this));
    }


    @Override
    public void display() {
        System.out.println("Alien ship: " + getName());
    }
    public void attack(Entity target) {
        getAttackBehavior().attack(target);
    }
}
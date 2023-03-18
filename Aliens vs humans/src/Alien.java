public class Alien extends Entity{
    private String type;

    public Alien(String name, Integer health, MoveBehavior moveBehavior, RetreatBehavior retreatBehavior, AttackBehavior attackBehavior, TakeDamageBehavior takeDamageBehavior, String type) {
        super(name, health, moveBehavior, retreatBehavior, attackBehavior, takeDamageBehavior);
        this.type = type;
    }

    public void display() {
        System.out.println("Name: " + getName() + ", Type: " + type + ", Health: " + getHealth());
    }
}

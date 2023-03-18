public class Human extends Entity{
        public Human(String name, Integer health, MoveBehavior moveBehavior, RetreatBehavior retreatBehavior, AttackBehavior attackBehavior, TakeDamageBehavior takeDamageBehavior) {
            super(name, health, moveBehavior, retreatBehavior, attackBehavior, takeDamageBehavior);
        }

        public void display() {
            System.out.println("Name: " + getName() + ", Health: " + getHealth());
        }

}

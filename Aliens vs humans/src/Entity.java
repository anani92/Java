public abstract class Entity {
    private String name;

    private Integer health;
    private MoveBehavior moveBehavior;
    private RetreatBehavior retreatBehavior;
    private AttackBehavior attackBehavior;
    private TakeDamageBehavior takeDamageBehavior;

    public Entity(String name, Integer health, MoveBehavior moveBehavior, RetreatBehavior retreatBehavior, AttackBehavior attackBehavior, TakeDamageBehavior takeDamageBehavior){

        this.name = name;
        this.health = health;
        this.moveBehavior = moveBehavior;
        this.attackBehavior = attackBehavior;
        this.retreatBehavior = retreatBehavior;
        this.takeDamageBehavior = takeDamageBehavior;
    }

    public Entity() {}

    public abstract void display();
    public void move() {
        moveBehavior.move();
    }

    public void retreat() {
        retreatBehavior.retreat();
    }
    public <T> void attack(Entity target) {
        attackBehavior.attack(target);
    }

    public void takeDamage(Integer damage) {
        takeDamageBehavior.takeDamage(damage);
    }

    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public MoveBehavior getMoveBehavior() {
        return moveBehavior;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public RetreatBehavior getRetreatBehavior() {
        return retreatBehavior;
    }

    public void setRetreatBehavior(RetreatBehavior retreatBehavior) {
        this.retreatBehavior = retreatBehavior;
    }

    public AttackBehavior getAttackBehavior() {
        return attackBehavior;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public TakeDamageBehavior getTakeDamageBehavior() {
        return takeDamageBehavior;
    }

    public void setTakeDamageBehavior(TakeDamageBehavior takeDamageBehavior) {
        this.takeDamageBehavior = takeDamageBehavior;
    }
}

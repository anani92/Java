public class TakeCannonDamage implements TakeDamageBehavior<Entity> {
    private Entity entity;
    public TakeCannonDamage(Entity entity) {
        this.entity = entity;
    }
    public TakeCannonDamage() {}

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
    public void takeDamage(Integer damage){
        entity.setHealth(entity.getHealth() - damage);
        System.out.println(entity.getName() + " took " + damage + " cannon damage!");
    }
}

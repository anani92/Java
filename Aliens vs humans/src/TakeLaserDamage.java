public class TakeLaserDamage implements TakeDamageBehavior<Entity> {
    private Entity entity;
    public TakeLaserDamage(Entity entity) {
        this.entity = entity;
    }

    public TakeLaserDamage() {}

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
    public void takeDamage(Integer damage){
        entity.setHealth(entity.getHealth() - damage);
    }
}

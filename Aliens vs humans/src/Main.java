public class Main {
    public static void main(String[] args) {
        Entity humanShip = new HumanShip("HMS Victory", 1000,  new SailMove(), new SinkRetreat(), new CannonAttack(100),  new TakeCannonDamage());

        Entity alienShip = new AlienShip("UFO", 500, new TeleportMove(), new TeleportRetreat(),  new AttackWithLazer(50), new TakeCannonDamage());
        humanShip.attack(alienShip);
    }
}
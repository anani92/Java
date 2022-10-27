public class Bat extends Mammal {
  public Bat() {
    this.setEnergy(300);
  }
  public void fly() {
    System.out.println("Flying ZZZZZZZZZZZZZZZZZ");
    this.decreaseEnergy(50);
  }
  public void eatHumans() {
    System.out.println("gross but I like it");
    this.increaseEnergy(25);

  }
  public void attackTown() {
    System.out.println("destroy this shit");
    this.decreaseEnergy(100);
}
}

public class Mammal {
	private int energyLevel;
	public Mammal() {
		this.energyLevel = 100;
	}
	public void setEnergy(int amount) {
		this.energyLevel = amount;
	}
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	public void increaseEnergy(int amount) {
		this.energyLevel += amount;
	}
	public void decreaseEnergy(int amount) {
		this.energyLevel -= amount;
	}
}
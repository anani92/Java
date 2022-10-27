package com.axsos.zoo;

public class Mamal {
	public int energyLevel;
	public Mamal() {
		this.energyLevel = 100;
	}
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	
}

package com.axsos.zoo;

public class Gorilla extends Mamal {
	
	public void	throwSomething(){ 
		System.out.println("Throw something");
		this.energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("yum yum yum");
		this.energyLevel += 10;
	}
	public void	climb(){
		System.out.println("I climbed this thing hahaha");
		this.energyLevel -= 10;
	}
	
}

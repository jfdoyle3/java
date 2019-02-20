package oop;

public class oop {
	int tWater=0; // How much water in the water bottle
	
	public oop() {
		// Default Constructor
		
	}
	public oop(int waterAmount) {
		tWater=waterAmount;
	}
	
	public void addWater(int amount) {
		tWater=tWater+amount;
	}
	public void drinkWater(int amount) {
		tWater=tWater-amount;
	}
	public int getWater() {
		return tWater;
	}
}



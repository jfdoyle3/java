package oop;

public class oopTest {

	public static void main(String[] args) {
		oop waterBottle= new oop(0);
		waterBottle.addWater(100);
		waterBottle.drinkWater(20);
		System.out.println("Your remaining water level is: "+waterBottle.getWater());
	}

}

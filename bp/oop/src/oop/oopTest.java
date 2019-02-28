package oop;

public class oopTest {

	public static void main(String[] args) {
		oop waterBottle= new oop();
		waterBottle.addWater(100);
		waterBottle.drinkWater(20);
		System.out.println("Your waterBottle water level is: "+waterBottle.getWater());
		oop gallonJug=new oop();
		gallonJug.addWater(10000);
		gallonJug.drinkWater(10);
		System.out.println("Your Gallon Jug water level is: "+gallonJug.getWater());
	}
}

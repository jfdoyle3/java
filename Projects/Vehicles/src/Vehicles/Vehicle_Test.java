/**
 * 
 */
package Vehicles;
import java.util.Scanner;
/**
 * @author Jim Doyle
 *
 */
public class Vehicle_Test {

	private static Scanner input;

	public static void main(String[] args)
	{
		Bicycle bike=new Bicycle();
		
		input = new Scanner(System.in);

		System.out.print("Sold a bike for: $");
		int price=input.nextInt();
		
		System.out.print("How many did you sell?");
		int qty=input.nextInt();
		
		bike.Sell(price, qty);
		
		System.out.print("Profit: ");
		System.out.println(bike.getTill());
		System.out.print("Stock: ");
		System.out.println(bike.getStock());
		
		
	}
}

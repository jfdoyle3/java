package areaOfATriangle;

import java.util.Scanner;

public class areaOfATriangle {
	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
	
		//declare variables
		double base, height;
		
		//Enter base length
		System.out.print("Enter the Triangle's base: ");
		base=sc.nextDouble();
		
		//Enter height
		System.out.print("Enter the Triangle's height: ");
		height=sc.nextDouble();
		
		// Get Area
		double preArea=base*height;
		
		// Divide by 2
		double area=preArea/2;
		
		// area calculated
		System.out.println("The area of the triangle is: "+ area);

	}

}

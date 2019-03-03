/**
 * 
 */
package TripPlanner;

import java.util.Scanner;
/**
 * @author Jim Doyle
 *
 */
public class TripPlanner {

	
	/**
	 * @param args
	 */
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Greet();
		Cost();
		Time();
		sqArea();
		

	}
	
	
	public static void  Greet()
	{
		System.out.println("Vacation planner");
		System.out.println("-----------------");
		System.out.print("What is your name?");
		String name=input.next();
		
		System.out.print("Nice to meet you "+name+ ", where are you traveling to?");
		String destination=input.next();
//		TODO: fix Space input
		System.out.print("Great!"+destination+" sounds like a great trip!");
		methodBreak();
	}
	
	
	public static void Cost() {
		
		// Days
		System.out.print("How many days are you going to spend traveling?");
		int days=input.nextInt();
		
		//  US Dollar
		System.out.print("How much, in USD, are you planning to spend on your trip?");
		double usDollar=input.nextDouble();
		
		// Currency Symbol
		System.out.print("What is the three letter currency symbol for your travel destination?");
		String currencySymbol=input.next();
		
		// Exchange Rate
		System.out.print("How many "+currencySymbol+" are there in 1 USD?");
		double exchangeRate=input.nextDouble();
		System.out.println();
		
		// Hours and Minutes
		int hours=days*24;
		int minutes=hours*60;
		System.out.println("If you are travelling for "+days+" that is the same as "+hours+" hours or "+minutes+" minutes");
		
		// Daily spend
		double dailySpend=Math.floor((usDollar/days)*100)/100;
		System.out.println("If you are going to spend $"+usDollar+" USD that means per day you can spend up to $"+dailySpend+" USD");
		double fCurrency=usDollar*exchangeRate;
		double dailyFSpend=Math.floor((fCurrency/days)*100)/100;
		System.out.println("Your total budget in "+currencySymbol+" is "+fCurrency+" "+currencySymbol+", which perday is "+dailyFSpend+" "+currencySymbol);		
		methodBreak();
	}
	public static void Time() {
	// TODO: fix this whole time mess.. works, but really quite right.
		int midnight=0;
		int noon=12;
		System.out.print("What is the time difference, in hours, between your home and your destiniation?");
		int tZone=input.nextInt();
		int hTime=tZone+noon;
		int dTime=tZone+midnight;
		System.out.print("That means that when it is midnight at home it will be "+dTime+":00 in your travel destination\nand when it is noon at home it will be "+hTime+":00");
		methodBreak();
	}
	public static void sqArea() {
		System.out.print("What is the square area of your destination country?");
		double dSqArea=input.nextDouble();
		double sqArea=dSqArea*0.38610;
		System.out.print("In miles2 that is "+sqArea);

		methodBreak();
	}
	public static void methodBreak() {
		System.out.println("\n******************\n");
	}

}

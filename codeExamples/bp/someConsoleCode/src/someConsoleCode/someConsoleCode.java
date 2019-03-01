package someConsoleCode;

import java.util.Scanner;

public class someConsoleCode {
	
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		//inputTest();
		//countNumber();
		compareUnequalString();
	}
	public static void inputTest() {
		String message=input.nextLine();
		System.out.println(Hello(message));
		}
	public static String Hello(String message) {
		if (message.equals("Hi")) {
			return "Hello";
	} else {
		return "Goodbye";
	}
  }
	public static void countNumber() {
		int i=0;
		while (i<=100) {
			System.out.println(i);
			i++;
			
		}
	}
	public static void compareUnequalString() {
		String x="boy";
		String y="girl";
		String z="girl";
		if (!x.equals(y)) {
			System.out.println(x+" does not equal "+y);
		} 
		if (y.equals(z)) {
			System.out.println(z+" equals "+y);
			}
		}
	
}

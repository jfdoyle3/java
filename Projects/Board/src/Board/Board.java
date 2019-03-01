/**
 * 
 */
package Board;

/**
 * @author Jim Doyle
 *
 */
//import java.util.Scanner;

public class Board {

//	private static Scanner input;

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int x=4;
		int y=4;
		
		for (int i=1; i<=x;i++)
		{
		Print("+---+---+---+\n");
		if (i<4) {
		Print("|   |   |   |\n");
		}
//		Print("+---+---+---+\n");
		}
//	input = new Scanner(System.in);
//	System.out.println("How many spaces across?");
//	int x=input.nextInt();
//	System.out.println("How many spaces Down");
//	int y=input.nextInt();
	
	}
	public static void Print(Object input) {
		System.out.print(input);
	}
}
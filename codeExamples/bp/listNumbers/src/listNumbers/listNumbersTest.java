/**
 * 
 */
package listNumbers;
import java.util.Scanner;	// Needs for user input
/**
 * @author Jim Doyle
 *
 */
public class listNumbersTest {

	static Scanner input=new Scanner(System.in);  // Needs for User input
	public static void main(String[] args) {
		System.out.println("Welcome to the listNumbers , enter 5 numbers");
		String in=input.nextLine();
		System.out.println("Math: ");
		listNumbers lnMath= new listNumbers(Integer.parseInt(in));
		lnMath.reverseCount();
		System.out.println("Using Strings");
		listNumbers lnString=new listNumbers(in);
		lnString.reverseCountByString();
	}

}

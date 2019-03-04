/**
 * 
 */
package Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Jim Doyle
 *
 */
public class Test {

	static Scanner input=new Scanner(System.in);
	
	/**
	 * Test Code
	 */
	public static void main(String[] args)
	{
		
		arrayTest();
		

	}
	public static void mario()
	{
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < i; j++) {
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
	public static void arrayTest()
	{
		Print ("Array:");
		int[] b = {1,2,1};
		int[] w=b;
		Print(Arrays.toString(w));
		Print ("\nArrayList\n1");
		ArrayList<Integer> numbers=	new ArrayList<Integer>();
		Print("Enter some numbers. 0 to exit");
		 
			int number = input.nextInt();
			numbers.add(number);
			while (number !=0)
			{
				numbers.add(number);
				number=input.nextInt();
			}
		
		
		Print (numbers);
	}
	public static void Print(Object input)
	{
		System.out.print(input);
	}

}

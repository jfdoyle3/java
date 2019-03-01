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
	
		int x=5;
		int y=5;
//		String corner="+";
//		String hEdge="-";
//		String vEdge="|";
//		String space=" ";
//		
//		System.out.print(corner);
		for (int i=1; i<=x;i++)
		{
		  for (int j=1; j<=y; j++) {
			if (i == j) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");
			}
		}
		  System.out.print("\n");
		}
  }
}

//	input = new Scanner(System.in);
//	System.out.println("How many spaces across?");
//	int x=input.nextInt();
//	System.out.println("How many spaces Down");
//	int y=input.nextInt();
	

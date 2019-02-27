/**
 * 
 */
package naughtCrosses;

/**
 * @author Jim Doyle
 *
 */
public class board {
	
	
	public board() {
		
	}
	
	public void draw() {
	  System.out.println(" | | ");
		for (int i=0; i<2; i++ ) {
			System.out.println("-|-|-");
		}
	  System.out.println(" | | ");
	}
}

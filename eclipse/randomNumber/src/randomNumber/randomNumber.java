/**
 * 
 */
package randomNumber;
import java.util.Random;  // Number random generator library
/**
 * @author Jim Doyle
 *
 */
public class randomNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random rnd=new Random();
		System.out.println(rnd.nextInt(100));

	}

}

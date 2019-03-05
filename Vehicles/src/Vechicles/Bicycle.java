/**
 * 
 */
package Vechicles;

/**
 * @author Jim
 *
 */
public class Bicycle {
	String color;
	String type;

	public Bicycle()
	{
	
	}
	
	public Bicycle(String color, String type)
	{
		this.color=color;
		this.type=type;
		
		if (color.equals("Grey"))
		{
			System.out.println("Awesome Color");
		}
		
	}

}

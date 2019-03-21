/**
 * 
 */
package Vehicles;
/**
 * @author Jim Doyle
 *
 */
public class Bicycle {
	private String color;
	private String type;
	private int profit;
	private String serialNumber;
	private int stock=1000;

	public Bicycle()
	{
	
	}
	
	public Bicycle(String color, String type)
	{
		this.color=color;
		this.type=type;	
	}
	
	public int Sell(int cost, int quantity)
	{	
		stock-=quantity;
		for (int i=0; i<quantity; i++)
		{
		profit += cost;
		}
		return profit;				
	}
	public String serialNumber(String sNumber)
	{
		return serialNumber;
	}
	
	public int getStock()
	{
		return stock;
	}
	public int getTill()
	{
		return profit;
	}

}

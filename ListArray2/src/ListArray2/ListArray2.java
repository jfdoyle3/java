/**
 * 
 */
package ListArray2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jim Doyle
 *
 */
public class ListArray2 {
	
	public static ArrayList<Integer> array=new ArrayList<Integer>();
	public static Scanner reader= new Scanner(System.in);
	
	public static void main(String[] arg)
	{
		System.out.println("Enter mumbers from 1-100");
		int input=reader.nextInt();
		while (input !=0)
		{
			if ((input >=1) && (input <=100))
			{
			array.add(input);
			
			}
			else
			{
			System.out.println("A number between 1 and 100");
			}
			input=reader.nextInt();
		}
		
		for (int i=1;i<10; i++)
		{
			int firstNum=((i-1)*10)+1;
			int secondNum=(i*10);
			int count=0;
			System.out.print(firstNum+" - "+secondNum+"   |");
			for (int number : array)
			{
				if((number>=firstNum)&&(number<=secondNum))
				{
					count++;
				}
			}
			for (int x=0; x<count; x++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}

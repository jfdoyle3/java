package ListArray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jim Doyle
 *
 */
public class ListArray {

		static Scanner reader=new Scanner(System.in);
		static ArrayList<Integer> array= new ArrayList<Integer>();
		
		public static void main(String[] args) 
		{
			System.out.println("Please type a bunch on integers and end with a 0");
			int in=reader.nextInt();
			while(in !=0)
			{
	// array.add(x) adds item into the array
				array.add(in);
				in=reader.nextInt();
			}
			
			// User typed 0
			PrintArray();
			
			System.out.println("Delete which number?");
			int del=reader.nextInt();
			for (int i=0; i<array.size(); i++)
			{
				if (array.get(i)==del) {
	// array.remove(x) removes item from array by index
					array.remove(i);
					break;
				}
			}
			PrintArray();
		}
		public static void PrintArray()
		{
			System.out.println("----------Array-----------");
			for (int i : array)
			{
				System.out.println(i);
			}
		}
}

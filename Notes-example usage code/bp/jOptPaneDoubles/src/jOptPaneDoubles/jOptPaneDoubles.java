/**
 * 
 */
package jOptPaneDoubles;

import javax.swing.JOptionPane;

/**
 * @author Jim Doyle
 *
 */
public class jOptPaneDoubles {

	public static void main(String[] args) {
		
		String fingers=JOptionPane.showInputDialog("How many finger do you have?");
		JOptionPane.showMessageDialog(null, "You have "+fingers+" fingers" );
		
		Double number=Double.parseDouble(JOptionPane.showInputDialog("What is 3/2?"));
		if ((number - 1.5)<.00001)
		{
			JOptionPane.showMessageDialog(null, "You are correct!" );
		} else
		{
			JOptionPane.showMessageDialog(null, "You are wrong" );
		}
	}

}

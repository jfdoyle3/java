package introAppGraphix;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class introAppGraphix extends Applet
{
	public void paint(Graphics g) 
	{
		int x=50;
		int y=50;
		int width=100;
		int height=100;
		
		Graphics2D g2=(Graphics2D)g;
		Ellipse2D.Double e=new Ellipse2D.Double(x,y,width,height);
		g2.draw(e);
	}
}

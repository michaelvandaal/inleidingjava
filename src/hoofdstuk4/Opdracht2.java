package hoofdstuk4;

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht2 extends Applet{
	public void init(){
		
	}
	public void paint(Graphics g){
		
		g.drawRect(50, 125, 100, 100);
		g.drawLine(100, 50, 50, 125);
		g.drawLine(100, 50, 150, 125);
		g.drawRect(50, 155, 40, 70);
		g.drawOval(120, 150, 20, 20);
	}
}


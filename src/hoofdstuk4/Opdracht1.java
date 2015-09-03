package hoofdstuk4;

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht1 extends Applet {
	
	public void init(){
		
	}

	public void paint(Graphics g){
		
		g.drawLine(50, 100, 100, 100);
		g.drawLine(50, 100, 75, 50);
		g.drawLine(75, 50,	100, 100);
	}
}
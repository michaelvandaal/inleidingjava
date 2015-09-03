package hoofdstuk4;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Opdracht3 extends Applet {
	
	public void init(){
		
	}

	public void paint(Graphics g){
	  g.drawRect(50, 50, 10, 500);
	  g.drawLine(359, 110, 359, 160);
	  g.setColor(Color.red);
	  g.fillRect(60, 60, 300, 50);
	  g.setColor(Color.blue);
	  g.fillRect(60, 160, 300, 50);
	}
}

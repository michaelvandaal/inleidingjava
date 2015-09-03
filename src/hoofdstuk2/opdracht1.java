package hoofdstuk2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class opdracht1 extends Applet{

	public void init(){
		setBackground(Color.blue);
	}
	public  void paint(Graphics g){
		g.setColor(Color.yellow);
		g.drawString("Michael van Daal", 50, 60);
	}
	
}

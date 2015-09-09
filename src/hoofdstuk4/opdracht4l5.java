package hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class opdracht4l5 extends Applet{
	
	public void init(){
		
	setBackground(Color.blue);
	}
	public void paint(Graphics g){
		g.setColor(Color.yellow);
		g.fillArc(0, 300, 1600, 1000, 0, 180);
	}

}
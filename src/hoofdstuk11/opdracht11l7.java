package hoofdstuk11;
import java.applet.Applet;
import java.awt.Graphics;


public class opdracht11l7 extends Applet{

	public void init(){
		
	}
	
	public void paint(Graphics g){
		int teller =  0;
		int x = 200;
		int y = 200;
		int width = 15;
		int height = 15;
		
		for (teller = 0; teller <5; teller++){
			x -= 25;
			y -= 25;
			width += 50;
			height += 50;
			
			g.drawOval(x, y, width, height);
		}
	}
	
}

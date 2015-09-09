package hoofdstuk11;
import java.applet.Applet;
import java.awt.Graphics;


public class opdracht11l8 extends Applet{

	public void init(){
		
	}
	
	public void paint(Graphics g){
		int teller = 50;
		int x = 400;
		int y = 400;
		int height = 5;
		int width =  5;
		
		for(teller = 0; teller < 50; teller++){
			x -= 5;
			y -= 5;
			height += 10;
			width += 10;
			
			g.drawOval(x, y, width, height);
			
			
		}
	}
	
}

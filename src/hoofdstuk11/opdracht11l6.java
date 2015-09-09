package hoofdstuk11;
import java.applet.Applet;
import java.awt.Graphics;


public class opdracht11l6 extends Applet{
	
	public void init(){
		
	}
	
	public void paint(Graphics g){
		
		int teller = 0;
		int x = 50;
		int y = 50;
		int width = 50;
		int height = 50;
		
		for (teller = 0; teller <5; teller++){
			x += 50;
			y += 50;
			
			g.drawRect(x, y, width, height);
		}
		
	}
}

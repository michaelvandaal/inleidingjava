package hoofdstuk11;
import java.applet.Applet;
import java.awt.Graphics;


public class opdracht11l9 extends Applet{

	public void init(){
		
	}
	
	public void paint(Graphics g){
		
		long teller = 0;
		int width = 10;
		int height = 10;
		
		for(teller =0; teller < 100; teller++){
			width += 10;
			height += 10;
			
			g.drawOval(50, 50, width, height);
		}
	}
}

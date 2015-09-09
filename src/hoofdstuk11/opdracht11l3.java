package hoofdstuk11;
import java.applet.Applet;
import java.awt.Graphics;


public class opdracht11l3 extends Applet{
	
	public void init(){
		
	}
	
	public void paint(Graphics g){
		long teller = 1;
		long teller2 = 0;
		long getal = 0;
		int x = 0;
		int y = 50;
		
		while (teller >= 0){
			x += 200;
			getal = teller + teller2;
			teller = teller2;
			teller2 = getal;
			
		if(x > 1000){
			y += 20;
			x = 200;
		}
		
			g.drawString("" + getal, x, y);
			
		}
		
	}

}

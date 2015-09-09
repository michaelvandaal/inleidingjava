package hoofdstuk11;
import java.applet.Applet;
import java.awt.Graphics;


public class opdracht11l4 extends Applet{

	public void init(){
		
	}
	
	public void paint(Graphics g){
		
		int teller = 0;
		int getal = 0;
		int y = 50;
		
		do{
			y += 20;
			teller++;
			getal = 3 * teller;
			
			g.drawString("3 * " + teller + " = " + getal, 50, y);
			
		} while (teller<=9);
			
			
		
		
	}
}

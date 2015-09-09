package hoofdstuk6;
import java.awt.*;
import java.applet.*;

public class opdaracht6l3 extends Applet{
	
	int getal;
	
	public void init(){
	
		getal = 3 + 3;
		
	}
	
	public void paint(Graphics g){

		g.drawString("-"  + getal, 50, 50);
		
	}
}

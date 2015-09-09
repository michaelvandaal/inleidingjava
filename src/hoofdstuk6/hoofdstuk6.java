package hoofdstuk6;
import java.awt.*;
import java.applet.*;

public class hoofdstuk6 extends Applet{

	int a,b,c;
	double uitkomst;
	
	public void init(){
		
		a = 59;
		b = 63;
		c = 69;
		uitkomst =  ((a + b + c) / 3)/ 10.0;
		
	}
	
	public void paint(Graphics g){
		
		g.drawString("het gemiddelde is: " + uitkomst, 50, 50);
	}
}

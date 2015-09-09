package hoofdstuk6;
import java.awt.*;
import java.applet.*;

public class hoofdstuk6l1 extends Applet{
	double a;
	double uitkomst;
	
	public void init(){
		a = 113;
		uitkomst = a / 4;
	}
	
	public void paint (Graphics g){
		
		g.drawString("totaal:           " + a, 50, 50);
		g.drawString("Jan:               " + uitkomst, 50, 65);
		g.drawString("Ali:                 " + uitkomst, 50, 80);
		g.drawString("Jeanette:      " + uitkomst, 50, 95);
		g.drawString("Michael:       " + uitkomst, 50, 110);
	}

}

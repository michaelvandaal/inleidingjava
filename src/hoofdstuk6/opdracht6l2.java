package hoofdstuk6;
import java.awt.*;
import java.applet.*;

public class opdracht6l2 extends Applet{
	int a;
	int uur,dag,jaar;
	
	public void init(){
		
		a = 1;
		uur = a *= 60;
		dag = (24 * 60) * uur;
		jaar = 365 * dag;
		
		
	}

	public void paint(Graphics g){
		
		g.drawString("sec in min: " + uur + "sec", 50, 50);
		g.drawString("sec in dag: " + dag + "sec", 50, 70);
		g.drawString("sec in jaar: " + jaar + "sec", 50, 90);
	}
}

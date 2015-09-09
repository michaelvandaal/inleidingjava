package hoofdstuk4;
import java.awt.*;
import java.applet.*;

public class opdracht4l7 extends Applet{

	public void init(){
		
	}
	
	public void paint(Graphics g){
		
		g.drawRoundRect(50, 50, 100, 100, 50, 50);
		g.fillOval(60, 60, 20, 20);
		g.fillOval(120, 60, 20, 20);
		g.fillOval(60, 120, 20, 20);
		g.fillOval(120, 120, 20, 20);
	}
}

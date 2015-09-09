package hoofdstuk4;
import java.awt.*;
import java.applet.*;

public class opdracht4l6 extends Applet {
	
	public void init(){
		
	}

	public void paint(Graphics g){
		
		g.drawRect(50, 50, 200, 400);
		g.fillRect(60, 60, 180, 380);
		g.setColor(Color.red);
		g.fillOval(110, 80, 90, 90);
		g.setColor(Color.yellow);
		g.fillOval(110, 200, 90, 90);
		g.setColor(Color.green);
		g.fillOval(110, 320, 90, 90);
		
	}
}

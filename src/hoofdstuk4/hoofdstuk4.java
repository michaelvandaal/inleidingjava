package hoofdstuk4;
import java.awt.*;
import java.applet.*;

public class hoofdstuk4 extends Applet{
	
	public void init(){
		
	}

	public void paint(Graphics g){
		g.drawRect(50, 50, 400, 200);
		g.drawString("Rechthoek", 200, 270);
		g.drawRoundRect(50, 350, 400, 200, 30, 30);
		g.drawString("Afgeronde Rechthoek", 170, 570);
		g.setColor(Color.magenta);
		g.fillRect(550, 50, 400, 200);
		g.setColor(Color.black);
		g.drawOval(550, 50, 400, 200);
		g.drawString("Gevulde Rechthoek met Ovaal", 670, 270);
		g.setColor(Color.magenta);
		g.fillOval(550, 350, 400, 200);
		g.setColor(Color.black);
		g.drawString("Gevulde Ovaal", 700, 570);
		g.drawOval(1050, 50, 400, 200);
		g.setColor(Color.magenta);
		g.fillArc(1050, 50, 400, 200, 0, 45);
		g.setColor(Color.black);
		g.drawString("Taartpunt met Ovaal er omheen", 1150, 270);
		g.drawOval(1150, 350, 200, 200);
		g.drawString("Cirkel", 1250, 570);
		g.drawLine(50, 650, 450, 650);
		g.drawString("Lijn", 220, 670);
	}
}
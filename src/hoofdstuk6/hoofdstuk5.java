package hoofdstuk6;
import java.awt.*;
import java.applet.*;

public class hoofdstuk5 extends Applet{
	
	Color opvulkleur;
	Color lijnkleur;
	int breedte;
	int lengte;
	
	public void init(){
		opvulkleur = Color.magenta;
		lijnkleur = Color.black;
		breedte = 400;
		lengte = 200;
	}

	public void paint(Graphics g){
		g.drawRect(50, 50, breedte, lengte);
		g.drawString("Rechthoek", 200, 270);
		g.drawRoundRect(50, 350, breedte, lengte, 30, 30);
		g.drawString("Afgeronde Rechthoek", 170, 570);
		g.setColor(opvulkleur);
		g.fillRect(550, 50, breedte, lengte);
		g.setColor(lijnkleur);
		g.drawOval(550, 50, breedte, lengte);
		g.drawString("Gevulde Rechthoek met Ovaal", 670, 270);
		g.setColor(opvulkleur);
		g.fillOval(550, 350, breedte, lengte);
		g.setColor(lijnkleur);
		g.drawString("Gevulde Ovaal", 700, 570);
		g.drawOval(1050, 50, breedte, lengte);
		g.setColor(opvulkleur);
		g.fillArc(1050, 50, breedte, lengte, 0, 45);
		g.setColor(lijnkleur);
		g.drawString("Taartpunt met Ovaal er omheen", 1150, 270);
		g.drawOval(1150, 350, lengte, lengte);
		g.drawString("Cirkel", 1250, 570);
		g.drawLine(50, 650, 450, 650);
		g.drawString("Lijn", 220, 670);
	}
}
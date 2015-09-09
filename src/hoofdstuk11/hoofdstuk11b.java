package hoofdstuk11;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class hoofdstuk11b extends Applet{
	
	Button knop;
	int getal1 = 0;
	
	public void init(){
		
		knop = new Button("ok");
		knop.addActionListener(new knoplistener());
		add(knop);
		
	}
	
	public void paint(Graphics g){
		int teller = 0;
		int getal = 0;
		int y = 50;
		
		do{
			y += 20;
			teller++;
			getal = teller * getal1;
			
			g.drawString(teller + " * " + getal1 + " = " + getal, 50, y);
			
		}while (teller < 10);
	}

	class knoplistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			getal1 = getal1 + 1;
			
			if( getal1 > 10){
				getal1 = 0;
			}
			
			repaint();
		}
	}
	
}

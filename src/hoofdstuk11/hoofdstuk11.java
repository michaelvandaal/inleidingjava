package hoofdstuk11;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class hoofdstuk11 extends Applet{
	
	Button knop;
	TextField tekstvak;
	int getal;
	String s;
	
	public void init(){
		
		tekstvak = new TextField("",10);
		knop = new Button("ok");
		knop.addActionListener(new knoplistener());
		add (tekstvak);
		add (knop);
		s = "";
		
	}
	
	public void paint(Graphics g){
		int teller = 0;
		int getal1 = 0;
		int y = 50;
		
		do{
			y += 20;
			teller++;
			getal1 = teller * getal;
			
			g.drawString(getal + " * " + teller + " = " + getal1, 50, y);
		}while (teller < 10);
	}
	
	class knoplistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			tekstvak.setText("");
			s = tekstvak.getText();
			getal = Integer.parseInt(s);
			repaint();
		}
	}

}

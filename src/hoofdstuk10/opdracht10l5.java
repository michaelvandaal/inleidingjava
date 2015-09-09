package hoofdstuk10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht10l5 extends Applet{
	
	TextField tekstvak;
	Label label;
	Button knop;
	String s, tekst, tekst2;
	double cijfer;
	
	public void init(){
		
		tekstvak = new TextField("", 20);
		label = new Label("voer uw cijfer in");
		knop = new Button("ok");
		knop.addActionListener(new knoplistener());
		add (tekstvak);
		add (label);
		add (knop);
		tekst = "";
		tekst2 = "";
		
	}

	public void paint(Graphics g){
		
		g.drawString("" + tekst, 50, 50);
		g.drawString("" + tekst2, 50, 70);
		
	}
	
	class knoplistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			s = tekstvak.getText();
			cijfer = Double.parseDouble(s);
			if (cijfer > 5.5){
				tekst = "voeldoende";
			}
			else {
				tekst = "onvoldoende";
			}
			
			
			repaint();
		}
	}
}

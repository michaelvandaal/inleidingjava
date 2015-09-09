package hoofdstuk10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht10l1 extends Applet{
	
	TextField tekstvak;
	Label label;
	Button knop;
	String s;
	int teller;
	int getal1;
	
	public void init(){
		
		tekstvak = new TextField("", 30);
		knop = new Button("ok");
		knop.addActionListener(new knoplistener());
		label = new Label ("voer getal in");
		add (tekstvak);
		add (knop);
		add (label);
		s = "";
		
	}
	
	public void paint(Graphics g){
		
		g.drawString("het hoogste getal is: " + getal1, 50, 50);
		
	}

	class knoplistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tekstvak.setText("");
			s = tekstvak.getText();
			getal1 = Integer.parseInt(s);
			if (getal1 > teller){
				teller = getal1;
				repaint();
				
			}
		}
	}
	
}

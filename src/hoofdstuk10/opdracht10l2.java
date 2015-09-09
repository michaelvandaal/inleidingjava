package hoofdstuk10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht10l2 extends Applet{
	
	TextField tekstvak;
	Label label;
	String s;
	Button knop;
	int laagste, hoogste, teller;
	int getal, getal1;
	
	public void init(){
		
		tekstvak = new TextField("", 30);
		knop = new Button("ok");
		knop.addActionListener(new knoplistener());
		label = new Label("voer getal in");
		add (tekstvak);
		add (knop);
		add (label);
		s = "";
		laagste = 0;
		hoogste = 0;
		teller = 0;
		
	}
	
	public void paint(Graphics g){
		
		g.drawString("het hoogste getal is: " + hoogste, 50, 50);
		g.drawString("het laagste getal is: " + laagste, 50, 70);
	}
	
	class knoplistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tekstvak.setText("");
			s = tekstvak.getText();
			teller = teller + 1;
			getal  = Integer.parseInt(s);
			if (getal > hoogste){
				hoogste = getal;
				repaint();
			}
			if (teller == 1){
				laagste = hoogste;}
				else { 
			 if (getal < laagste) {
				laagste = getal;
				repaint();
			}
				}
		}
	}

}

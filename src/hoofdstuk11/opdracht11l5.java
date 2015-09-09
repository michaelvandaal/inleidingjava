package hoofdstuk11;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class opdracht11l5 extends Applet{
	
	Button knop;
	TextField tekstvak;
	Label label;
	String s;
	int getal;

	public void init(){
		
		tekstvak = new TextField("",30);
		label = new Label("voer uw getal in");
		knop = new Button("ok");
		knop.addActionListener(new knoplistener());
		add (tekstvak);
		add (label);
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
			
		}while (teller <= 9);
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

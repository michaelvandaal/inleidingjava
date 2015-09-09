package hoofdstuk8;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht8l3 extends Applet{
	
	Button knop;
	TextField tekstvak;
	Label label;
	String s;
	double getal;
	
	public void init(){
		
		tekstvak = new TextField("", 30);
		knop = new Button ("ok");
		label = new Label("voer bedrag in excl BTW");
		knop.addActionListener(new knoplistener());
		add (tekstvak);
		add (knop);
		add (label);
		s = "";
		
	}
	
	public void paint(Graphics g){
		
		g.drawString("prijs inncl BTW: € " + getal, 50, 50);
		
	}
	
	class knoplistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			tekstvak.setText("");
			s = tekstvak.getText();
			getal = Double.parseDouble(s) * 1.19;
			repaint();
		}
	}

}

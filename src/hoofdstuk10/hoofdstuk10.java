package hoofdstuk10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class hoofdstuk10 extends Applet{
	
	TextField tekstvak;
	Label label;
	Button knop;
	String s, tekst;
	int cijfer;

	public void init(){
		tekstvak = new TextField("", 10);
		label = new Label("voer uw cijfer in (heel getal)");
		knop = new Button("ok");
		knop.addActionListener(new knoplistener());
		add (tekstvak);
		add (label);
		add (knop);
		tekst = "";
		
	}
	
	public void paint(Graphics g){
		
		g.drawString(tekst, 50, 50);
		
	}
	
	class knoplistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			s = tekstvak.getText();
			cijfer = Integer.parseInt(s);
			if (cijfer >= 1 && cijfer <= 3 ){
				tekst = "slecht";
			}	
			else if (cijfer == 4){
				tekst = "onvoldoende";
			}
			else if (cijfer == 5){
				tekst = "matig";
			}
			else if (cijfer == 6 || cijfer == 7){
				tekst = "voldoende";
			}
			else if (cijfer >= 8 && cijfer <=10){
				tekst = "goed";
			}
			else {
				tekst = "fout getal porbeer het opnieuw (getal tussen de 1 en de 10)";
			}
			repaint();
		}
	}
}

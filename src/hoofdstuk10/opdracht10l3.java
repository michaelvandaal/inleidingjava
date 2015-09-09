package hoofdstuk10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht10l3 extends Applet{
	
	TextField tekstvak;
	Label label;
	Button knop;
	String s, tekst;
	int maand;
	
	public void init(){
		
		tekstvak = new TextField("", 20);
		label = new Label("voer getal in tussen 1 en 12");
		knop = new Button("ok");
		knop.addActionListener(new knoplistener());
		add (tekstvak);
		add (knop);
		add (label);
		tekst = "";
		
	}

	public void paint(Graphics g){
		
		g.drawString(tekst, 50, 50);
		
	}
	
	class knoplistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			s = tekstvak.getText();
			maand = Integer.parseInt(s);
			switch (maand){
			case 1:
				tekst = "Januari 31 dagen";
				break;
			case 2:
				tekst = "Februari 28 of 29 dagen";
				break;
			case 3:
				tekst = "Maart 31 dagen";
				break;
			case 4:
				tekst = "April 30 dagen";
				break;
			case 5:
				tekst = "Mei 31 dagen";
				break;
			case 6:
				tekst = "Juni 30 dagen";
				break;
			case 7:
				tekst = "juli 31 dagen";
				break;
			case 8:
				tekst = "Augustus 31 dagen";
				break;
			case 9:
				tekst = "September 30 dagen";
				break;
			case 10:
				tekst = "Oktober 31 dagen";
				break;
			case 11:
				tekst = "November 30 dagen";
				break;
			case 12:
				tekst = "December 31 dagen";
			default:
				tekst = "voer ander getal in";
				break;
				
			}
			repaint();
		}
	}
}

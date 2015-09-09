package hoofdstuk10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht10l4 extends Applet{
	
	TextField tekstvak;
	TextField tekstvak2;
	Label label;
	Button knop;
	String s, s2, tekst, tekst2;
	int maand, jaartal;
	
	public void init(){
		tekstvak = new TextField("", 20);
		tekstvak2 = new TextField("", 20);
		label = new Label("voer een getal in en een jaartal");
		knop = new Button("ok");
		knop.addActionListener(new knoplistener());
		add (tekstvak);
		add (tekstvak2);
		add (label);
		add (knop);
		tekst = "";
		tekst2 = "";
		
	}

	public void paint (Graphics g){
		
		g.drawString(tekst + tekst2, 50, 50);
		
	}
	
	class knoplistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			s = tekstvak.getText();
			s2 = tekstvak2.getText();
			maand = Integer.parseInt(s);
			jaartal = Integer.parseInt(s2);
			switch (maand){
			case 1:
				tekst = "Januari 31 dagen ";
				break;
			case 2:
				tekst = "Februari 28 of 29 dagen ";
				break;
			case 3:
				tekst = "Maart 31 dagen ";
				break;
			case 4:
				tekst = "April 30 dagen ";
				break;
			case 5:
				tekst = "Mei 31 dagen ";
				break;
			case 6:
				tekst = "Juni 30 dagen ";
				break;
			case 7:
				tekst = "juli 31 dagen ";
				break;
			case 8:
				tekst = "Augustus 31 dagen ";
				break;
			case 9:
				tekst = "September 30 dagen ";
				break;
			case 10:
				tekst = "Oktober 31 dagen ";
				break;
			case 11:
				tekst = "November 30 dagen ";
				break;
			case 12:
				tekst = "December 31 dagen ";
			default:
				tekst = "voer ander getal in ";
				break;
			}
			if ((jaartal % 4 == 0 && !(jaartal % 100 == 0 )) || jaartal % 400 == 0){
				tekst2 = "" + jaartal + " is een Schrikkeljaar";	
			}
			else{
				tekst2 = "" + jaartal + " is geen schrikkeljaar";
			}
			repaint();
		}
	}
	
}

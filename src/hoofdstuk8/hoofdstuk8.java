package hoofdstuk8;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class hoofdstuk8 extends Applet{
	
	TextField tekstvak1;
	TextField tekstvak2;
	Button knop1;
	Button knop2;
	Button knop3;
	Button knop4;
	String s;
	String s1;
	double getal;
	
	public void init(){
		setSize(700, 400);
		tekstvak1 = new TextField("", 30);
		tekstvak2 = new TextField("", 30);
		knop1 = new Button("+");
		knop2 = new Button("-");
		knop3 = new Button("*");
		knop4 = new Button("/");
		knop1.addActionListener(new knoplistener());
		knop2.addActionListener(new knoplistener1());
		knop3.addActionListener(new knoplistener2());
		knop4.addActionListener(new knoplistener3());
		add (tekstvak1);
		add (tekstvak2);
		add (knop1);
		add (knop2);
		add (knop3);
		add (knop4);
		s = "";
		s1 = "";
	}

	public void paint(Graphics g){
		
		g.drawString("" + getal, 50, 50);
		
	}
	
	class knoplistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tekstvak1.setText("");
			tekstvak2.setText("");
			s = tekstvak1.getText();
			s1 = tekstvak2.getText();
			getal = Double.parseDouble(s) + Double.parseDouble(s1);
			repaint();
			
		}
	}
	
	class knoplistener1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tekstvak1.setText("");
			tekstvak2.setText("");
			s = tekstvak1.getText();
			s1 = tekstvak2.getText();
			getal = Double.parseDouble(s) - Double.parseDouble(s1);
			repaint();
		}
	}
	
	class knoplistener2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tekstvak1.setText("");
			tekstvak2.setText("");
			s = tekstvak1.getText();
			s1 = tekstvak2.getText();
			getal = Double.parseDouble(s) * Double.parseDouble(s1);
			repaint();
		}
	}
	
	class knoplistener3 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tekstvak1.setText("");
			tekstvak2.setText("");
			s = tekstvak1.getText();
			s1 = tekstvak2.getText();
			getal = Double.parseDouble(s) / Double.parseDouble(s1);
			repaint();
		}
	}
	
}

package hoofdstuk8;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht8l2 extends Applet{
	
	Button knop;
	Button knop1;
	Button knop2;
	Button knop3;
	int teller, teller1, teller2, teller3, teller4, uitkomst, uitkomst1, uitkomst2, uitkomst3, uitkomst4;
	
	public void init(){
		
		knop = new Button("Man");
		knop1 = new Button("Vrouw");
		knop2 = new Button("Leerling man");
		knop3 = new Button("Leerling vrouw");
		knop.addActionListener(new knoplistener());
		knop1.addActionListener(new knoplistener1());
		knop2.addActionListener(new knoplistener2());
		knop3.addActionListener(new knoplistener3());
		teller += 0;
		add(knop);
		add(knop1);
		add(knop2);
		add(knop3);
		
	}
	
	public void paint(Graphics g){
		
		g.drawString("aantal bezoekers: " + uitkomst, 50, 50);
		g.drawString("aantal mannen: " + uitkomst1, 50, 70);
		g.drawString("aantal vrouwen: " + uitkomst2, 50, 90);
		g.drawString("aantal leerlingen man: " + uitkomst3, 50, 110);
		g.drawString("aantal leerlingen vrouw: " + uitkomst4 , 50, 130);
	}
	
	class knoplistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			teller = teller + 1;
			uitkomst = teller;
			teller1 = teller1 + 1;
			uitkomst1 = teller1;
			repaint();
		}
	}
	
	class knoplistener1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			teller = teller + 1;
			uitkomst = teller;
			teller2 = teller2 + 1;
			uitkomst2 = teller2;
			repaint();
		}
	}
	
	class knoplistener2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			teller = teller + 1;
			uitkomst = teller;
			teller1 = teller1 + 1;
			uitkomst1 = teller1;
			teller3 = teller3 + 1;
			uitkomst3 = teller3;
			repaint();
		}
	}
	
	class knoplistener3 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			teller = teller + 1;
			uitkomst = teller;
			teller2 = teller2 + 1;
			uitkomst2 = teller2;
			teller4 = teller4 + 1;
			uitkomst4 = teller4;
			repaint();
		}
	}

}

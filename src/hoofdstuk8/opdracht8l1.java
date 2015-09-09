package hoofdstuk8;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht8l1 extends Applet{
	
	TextField Tekstvak;
	Label label;
	Button knop;
	Button knop1;
	String s;
	
	public void init(){
		
		Tekstvak = new TextField("" , 40);
		label = new Label("tik iets in");
		knop = new Button("ok");
		knop.addActionListener(new KnopListener());
		knop1 = new Button("reset");
		knop1.addActionListener(new KnopListener1());
		s = "";
		add(label);
		add(Tekstvak);
		add(knop);
		add(knop1);
		
	}

	public void paint(Graphics g){
		
		g.drawString( s, 50, 50);
		
	}
	class KnopListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Tekstvak.setText("");
			s = Tekstvak.getText();
			repaint();
		}
	}
	class KnopListener1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Tekstvak.setText(null);
			s = null;
			repaint();
		}
	}
}

package hoofdstuk11;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class opdracht11l10 extends Applet{

	public void init(){
		
	}
	
	public void paint(Graphics g){
		
		int x = 50;
		int y = 50;
		int kolom = 0;
		int breedte = 50;
		int hoogte = 50;
		
		
		// eesrte rij
		for(kolom = 0; kolom < 8; kolom++){
			if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
				g.setColor(Color.black);
				g.fillRect(x, y, breedte, hoogte);
			}else{
			g.drawRect(x, y, breedte, hoogte);
			}
			
			x += breedte;
		}
		
		// tweede rij
		x = 50;
		y += hoogte;
		
		for (kolom = 0; kolom < 8; kolom++){
			if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
				g.drawRect(x, y, breedte, hoogte);
			}else{
				g.setColor(Color.black);
				g.fillRect(x, y, breedte, hoogte);
			}
			x += breedte;
		}
		
		// derde rij
		x = 50;
		y += hoogte;
		
		for(kolom = 0; kolom < 8; kolom++){
			if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
				g.setColor(Color.black);
				g.fillRect(x, y, breedte, hoogte);
			}else{
			g.drawRect(x, y, breedte, hoogte);
			}
			
			x += breedte;
		}
		
		//vierde rij
		x = 50;
		y += hoogte;
		
		for (kolom = 0; kolom < 8; kolom++){
			if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
				g.drawRect(x, y, breedte, hoogte);
			}else{
				g.setColor(Color.black);
				g.fillRect(x, y, breedte, hoogte);
			}
			x += breedte;
		}
		
		//vijfde rij
		x = 50;
		y += hoogte;
		
		for(kolom = 0; kolom < 8; kolom++){
			if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
				g.setColor(Color.black);
				g.fillRect(x, y, breedte, hoogte);
			}else{
			g.drawRect(x, y, breedte, hoogte);
			}
			
			x += breedte;
		}
		
		//zede rij
		x = 50;
		y += hoogte;
		
		for (kolom = 0; kolom < 8; kolom++){
			if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
				g.drawRect(x, y, breedte, hoogte);
			}else{
				g.setColor(Color.black);
				g.fillRect(x, y, breedte, hoogte);
			}
			x += breedte;
		}
		
		// zevende rij
		x = 50;
		y += hoogte;
		
		for(kolom = 0; kolom < 8; kolom++){
			if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
				g.setColor(Color.black);
				g.fillRect(x, y, breedte, hoogte);
			}else{
			g.drawRect(x, y, breedte, hoogte);
			}
			
			x += breedte;
		}
		
		//achtste rij
		x = 50;
		y += hoogte;
		
		for (kolom = 0; kolom < 8; kolom++){
			if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
				g.drawRect(x, y, breedte, hoogte);
			}else{
				g.setColor(Color.black);
				g.fillRect(x, y, breedte, hoogte);
			}
			x += breedte;
		}
	}
}

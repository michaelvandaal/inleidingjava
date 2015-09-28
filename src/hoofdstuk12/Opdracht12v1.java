package hoofdstuk12;

import java.applet.*;
import java.awt.Graphics;

public class Opdracht12v1 extends Applet{
	  int[] getal;
	  int[] teller;
	  int gem;
		
	    public void init() {
	        getal = new int[10];
	        
	        for (int teller = 0; teller < getal.length; teller ++) {
	            getal[teller] = (teller++);
	         }
	        
	        getal[0] = 66;
	        getal[1] = 90;
	        getal[2] = 23;
	        getal[3] = 49;
	        getal[4] = 87;
	        getal[5] = 92;
	        getal[6] = 72;
	        getal[7] = 77;
	        getal[8] = 39;
	        getal[9] = 98;
	        gem = (getal[1] + getal[2] + getal[3] + getal[4] + getal[5] + getal[6] + getal[7] + getal[8] + getal[9] + getal[0]) / 10;
	        
	    }

	    public void paint(Graphics g) {
	    	int teller =0; 
	    	int y = 0;
	    	
	    	while (teller < 10){
	    	y+= 20;
	    	g.drawString("" + getal[teller], 50, y);
	    	g.drawString("gemiddelde is: " + gem , 50, 220);
	    	teller++;
	
	    }
	}
}

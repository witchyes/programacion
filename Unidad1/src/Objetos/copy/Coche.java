package Objetos.copy;

import graphics.Canvas;
import graphics.Rectangle;
import graphics.Ellipse;
import graphics.Color;
import graphics.Line;




public class Coche {

	public static void main(String[] args)  throws InterruptedException {

		Canvas lienzo;
		Rectangle rectangulo1,rectangulo2;
		Ellipse rueda1,rueda2;
		Line suelo;
		
		
		suelo = new Line (10,230,1000,230);
		suelo.draw ();
		
		lienzo = Canvas.getInstance();
		rectangulo1 = new Rectangle		(100,150,400,70);
		rectangulo1.draw();
		rectangulo2 = new Rectangle (200,100,200,70);
		rectangulo2.draw();
		
		rueda1=new Ellipse(365,175,60,60);
		rueda1.draw();
		
		rueda2=new Ellipse(165,175,60,60);
		rueda2.draw();
		
		rectangulo1.setColor(Color.GREEN);	
		rectangulo1.fill();	
		
		rectangulo2.setColor (Color.GREEN);
		rectangulo2.fill();
		
		rueda1.setColor(Color.BLACK);	
		rueda1.fill();	
		
		rueda2.setColor(Color.BLACK);	
		rueda2.fill();
		
		//movimiento
		int x=0;
		x=0;
		
		while (10==10){	
			
			while (x!=70){
			
				Thread.sleep(10);
			
				rectangulo1.translate(5,0);
				rectangulo2.translate(5,0);
				rueda1.translate(5,0);
				rueda2.translate(5,0);
				
				x++;
					
			}
		
			while (x!=0){
				
				Thread.sleep(10);
			
				rectangulo1.translate(-5,0);
				rectangulo2.translate(-5,0);
				rueda1.translate(-5,0);
				rueda2.translate(-5,0);
				
				x--;
		
			}
			
			}
				
				
			
			
			
			
		







	}

}
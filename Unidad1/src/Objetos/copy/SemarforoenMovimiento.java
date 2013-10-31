package Objetos.copy;

import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Color;

public class SemarforoenMovimiento {

	
	public static void main(String[] args) throws InterruptedException {
	
		Rectangle caja, palo;	
		Ellipse verde, ambar, rojo;

		caja = new Rectangle (10,10,60,110);
		caja.draw ();
		
		palo = new Rectangle (30,120,15,100);
		palo.draw ();
		
		palo.fill(); //lo dibuja relleno
		
		verde = new Ellipse (25,85,30,30);
		
		verde.fill ();
		verde.setColor (Color.GREEN);
		
		ambar = new Ellipse (25,50,30,30);
		ambar.fill ();
		ambar.setColor (Color.WHITE);
		
		rojo = new Ellipse (25, 15, 30,30);
		rojo.fill ();
		rojo.setColor (Color.WHITE);
		
		Thread.sleep(1000);
		
		verde = new Ellipse (25,85,30,30);
		verde.fill ();
		verde.setColor (Color.WHITE);
		
		ambar = new Ellipse (25,50,30,30);
		
		ambar = new Ellipse (25,50,30,30);
		ambar.fill ();
		ambar.setColor (Color.ORANGE);
		
		rojo = new Ellipse (25, 15, 30,30);
		rojo.fill ();
		rojo.setColor (Color.WHITE);
		
		Thread.sleep(1000);
		
		verde = new Ellipse (25,85,30,30);
		verde.fill ();
		verde.setColor (Color.WHITE);
		
		ambar = new Ellipse (25,50,30,30);
		ambar.fill ();
		ambar.setColor (Color.WHITE);
		
		rojo = new Ellipse (25, 15, 30,30);
		rojo.fill ();
		rojo.setColor (Color.RED);
		
		
		
		
		
		
		
		
	}

}

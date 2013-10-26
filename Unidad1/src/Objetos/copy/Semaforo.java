package Objetos.copy;


	

	import graphics.Canvas;
	import graphics.Color;
	import graphics.Ellipse;
	import graphics.Rectangle;

	public class Semaforo {
		public static void main(String[] args) {
			Canvas lienzo;
			Rectangle rectangulo;
			Ellipse circuloVerde;
			Ellipse circuloAmarillo;
			Ellipse circuloRojo;
			
			
			lienzo = Canvas.getInstance();
			rectangulo = new Rectangle		(10,10,100,400);
			circuloVerde = new Ellipse		(10,50,100,100);
			circuloAmarillo = new Ellipse	(10,150,100,100);
			circuloRojo = new Ellipse		(10,250,100,100);
			
			
			rectangulo.draw();
			circuloVerde.draw();
			circuloAmarillo.draw();
			circuloRojo.draw();
			
			rectangulo.fill();
			
			circuloVerde.fill();
			circuloAmarillo.fill();
			circuloRojo.fill();

			
			rectangulo.setColor(Color.DARK_GRAY);
			
			circuloVerde.setColor(Color.GREEN);
			circuloAmarillo.setColor(Color.YELLOW);
			circuloRojo.setColor(Color.RED);
			
			Canvas.pause();
			

		}

	}


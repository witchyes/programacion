package EjemplosGraphics2;

import java.awt.Point;

import Graphics2.Canvas;
import Graphics2.Color;
import Graphics2.Ellipse;
import Graphics2.Rectangle;
import Graphics2.Text;

public class MoverUnObjetoConPulsacion {

	public static void main(String[] args) {
		// Al pulsar, el circulo se mueve donde pulso
		Rectangle cuadrado;
		
		cuadrado = new Rectangle (100,100,300,300);
		cuadrado.setThickness(6.5f); //para el grosor de las lineas
		cuadrado.setColor(Color.RED);
		cuadrado.draw();
		
		
		
		Ellipse circulo;
		
		circulo = new Ellipse (150,150,30,30);
		circulo.setThickness(20f);
		circulo.setColor (Color.BLUE);
		circulo.draw();
		
		Canvas c;
		c= Canvas.getInstance();
		c.waitMouseClick();
		
		
		
		while (true){
			Point pulsacion = c.waitMouseClick(); 
			circulo.undraw();
			circulo = new Ellipse (pulsacion.x-15,pulsacion.y-15,30,30);
			circulo.setColor(Color.BLUE);
			circulo.draw();
			
		/*
		 * Otra forma de hacerlo seria
		 * circulo.translate(pulsacion.x-circulo.getX()-circulo.getWidth()/2,pulsacion.y-circulo.getY()
		 * -circulo.getHeight()/2);
		 
		 */
		}
	}

}

package EjemplosGraphics2;

import java.awt.Point;

import Graphics2.*;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle cuadrado;
		
		cuadrado = new Rectangle (100,100,300,300);
		cuadrado.setThickness(6.5f); //para el grosor de las lineas
		cuadrado.setColor(Color.RED);
		cuadrado.draw();
		
		Ellipse circulo;
		
		circulo = new Ellipse (150,150,200,200);
		circulo.setThickness(20f);
		circulo.setColor (Color.BLUE);
		circulo.draw();
		
		/*
		Canvas.pause (); //Sale una ventana de espera
		
		circulo.undraw(); //Desdibujar
		*/
		
		Canvas c;
		c= Canvas.getInstance();
		c.waitMouseClick();  //espera a que le des un click en la ventana para seguir con la siguiente orden
		
		//otra opicion es:
		//Canvas.getInstance().waitMouseClick();
		
		circulo.undraw();
		
		Point pulsacion = c.waitMouseClick(); //Point es un metodo que tiene las cordenadas x,y
		
		System.out.println("Has pulsado en: "+ pulsacion.x +"-"+pulsacion.y);
		
	}

}

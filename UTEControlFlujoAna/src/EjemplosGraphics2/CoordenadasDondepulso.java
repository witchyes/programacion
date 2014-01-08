package EjemplosGraphics2;

import java.awt.Point;

import Graphics2.*;

public class CoordenadasDondepulso {

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
		
		Canvas c;
		c= Canvas.getInstance();
		c.waitMouseClick();
		Text texto;
		texto = new Text (10,10,"-");
		texto.draw();
		while (true){
			Point pulsacion = c.waitMouseClick(); 
			circulo.undraw();
			texto.setText(pulsacion.x+"-"+pulsacion.y);
		}
		
		
	}

}

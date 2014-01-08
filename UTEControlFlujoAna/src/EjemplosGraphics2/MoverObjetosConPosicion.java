package EjemplosGraphics2;

import Graphics2.Text;

import java.awt.Point;

import Graphics2.Canvas;
import Graphics2.Color;
import Graphics2.Ellipse;

public class MoverObjetosConPosicion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		
		Ellipse circulo;
		
		circulo = new Ellipse (150,150,30,30);
		circulo.setThickness(20f);
		circulo.setColor (Color.BLUE);
		circulo.draw();
		
		Canvas c;
		c= Canvas.getInstance();
		c.waitMouseClick();
		
		Text coordenadas = new Text (10,10,"-");
		coordenadas.draw();
		
		circulo.fill();
		while (true){
			Point pulsacion = c.getMousePosition(); 
			circulo.undraw();
			
			coordenadas.setText(pulsacion.x+"-"+pulsacion.y);
			
			circulo = new Ellipse (pulsacion.x-15,pulsacion.y-15,30,30);
			circulo.setColor(Color.BLUE);
			circulo.fill();
			
			Thread.sleep(100);
		}
	}

}
	

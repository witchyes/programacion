package Objetos.copy;
import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class SemaforoCalculos {

	public static void main(String[] args) {

		Rectangle caja, palo;
		Ellipse verde, ambar, rojo;
		int ancho, alto, centro_x, centro_y, diametro_disco;
		
		ancho=100;
		alto=300;
		centro_x=300;
		centro_y=300;
		diametro_disco=ancho/2;
		
		caja = new Rectangle (centro_x - ancho/2, centro_y - alto/2, ancho, alto);
		
		caja.draw ();
		
		palo = new Rectangle (centro_x - ancho/10,centro_y + alto/2,ancho/5,alto);
		
		palo.draw();
		palo.fill ();
		
		verde = new Ellipse (centro_x - diametro_disco/2, centro_y - diametro_disco*2, diametro_disco,diametro_disco);
		verde.draw ();
		
		ambar = new Ellipse (centro_x - diametro_disco/2, centro_y - diametro_disco/2, diametro_disco, diametro_disco);
		ambar.draw ();
		
		rojo = new Ellipse (centro_x - diametro_disco/2, centro_y + diametro_disco,diametro_disco,diametro_disco);
		rojo.draw ();
		
	}

}

package ejercicios;

import java.util.Scanner;

public class Velocidades2 {

	public static void main(String[] args) {

		double tama�o;
		double velocidad;
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println(" �cu�l es el tama�o del archivo (Mbytes)? ");
		tama�o = teclado.nextDouble();
		System.out.println(" �cu�l es la velocidad de tu l�nea (Mbps) ");
		velocidad = teclado.nextDouble();
		
		tama�o = tama�o * 1024 * 1024 * 8;
		// tambien se puede poner tama�o = tama�o * Math.pow (2,20) * 8;
		
		velocidad = velocidad * 1000000;
		// tambien se puede poner velocidad = velocidad * Math.pow (6,10);
		
		System.out.print ("Datos: "+tama�o+"bips");
		System.out.print ("Velocidad "+velocidad+ "bips");
		
		System.out.print ("Tiempo para transmitir: "+tama�o/velocidad +"segundos" );
		
		teclado.close ();
		

	}

}

package ejercicios;

import java.util.Scanner;

public class Velocidades2 {

	public static void main(String[] args) {

		double tamaño;
		double velocidad;
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println(" ¿cuál es el tamaño del archivo (Mbytes)? ");
		tamaño = teclado.nextDouble();
		System.out.println(" ¿cuál es la velocidad de tu línea (Mbps) ");
		velocidad = teclado.nextDouble();
		
		tamaño = tamaño * 1024 * 1024 * 8;
		// tambien se puede poner tamaño = tamaño * Math.pow (2,20) * 8;
		
		velocidad = velocidad * 1000000;
		// tambien se puede poner velocidad = velocidad * Math.pow (6,10);
		
		System.out.print ("Datos: "+tamaño+"bips");
		System.out.print ("Velocidad "+velocidad+ "bips");
		
		System.out.print ("Tiempo para transmitir: "+tamaño/velocidad +"segundos" );
		
		teclado.close ();
		

	}

}

package ejercicios;

import java.util.Scanner;

public class Esfera2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int radio;
		double volumen;
		//final double PI = Math.PI;
		
		System.out.print ("Introduzca el radio de la esfera (cm) ");
		
		radio=teclado.nextInt ();
		
		teclado.close();
		
		volumen = (4 * Math.PI * Math.pow(radio,3))/3;
		
		System.out.println("-----RESULTADOS----");
		System.out.println( "Volumen: "+ Math.round (volumen));
		//Math.round para redondear
		
		
		

	}

}

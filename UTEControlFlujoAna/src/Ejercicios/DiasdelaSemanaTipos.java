package Ejercicios;

import java.util.Scanner;

public class DiasdelaSemanaTipos {

	
	public static void main(String[] args) {
		// Escriba el dia de la semana y diga si es festivo y laborable
		

		Scanner teclado = new Scanner (System.in);
		int numero_dia;
		String letra_dia="";
		
		System.out.println("Dame el d�a de la semana (en n�mero): ");
		numero_dia = teclado.nextInt ();
		
		switch (numero_dia){
		
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: System.out.println ("D�a laborable");
		break;
		case 6: 
		case 7: System.out.println ("D�a festivo");
		break;
		
		default: System.out.println ("Error. Introduce un n�mero correcto");
		break;
		}
		
		
	
	



	}

}

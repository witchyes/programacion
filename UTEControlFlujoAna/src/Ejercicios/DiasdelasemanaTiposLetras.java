package Ejercicios;

import java.util.Scanner;
public class DiasdelasemanaTiposLetras {



	
	public static void main(String[] args) {
		// Escriba el dia de la semana y diga si es festivo y laborable
		

		Scanner teclado = new Scanner (System.in);
		int numero_dia;
		String dia="";
		
		System.out.println("Dame el d�a de la semana (en letra): ");
		dia = teclado.next ();
		
		switch (dia){
		
		case "lunes": 
		case "martes": 
		case "miercoles":
		case "jueves":	
		case "viernes": System.out.println ("D�a laborable");
		break;
		case "sabado": 
		case "domingo": System.out.println ("D�a festivo");
		break;
		
		default: System.out.println ("Error. Introduce un n�mero correcto");
		break;
		}
		
	}

}

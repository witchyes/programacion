package Ejercicios;

import java.util.Scanner;

public class PalabraOculta {

	
	public static void main(String[] args) {
		// Crea un programa que tiene una palabra oculta. El programa pregunta la contrase�a al jugador, 
		//si la adivina muestra un mensaje de �xito. Si no, muestra el error.

		String contrase�a = "tardes";
		
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Escribe la contrase�a: ");
		
		String resultado = teclado.next();
		
		if (contrase�a.equals(resultado)){
			
		System.out.println ("BRAVO, has encontrado la contrase�a");
		}else  System.out.println ("Lo sentimos sigue intentadolo");
		
		
	}

}

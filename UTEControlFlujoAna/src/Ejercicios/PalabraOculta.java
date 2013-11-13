package Ejercicios;

import java.util.Scanner;

public class PalabraOculta {

	
	public static void main(String[] args) {
		// Crea un programa que tiene una palabra oculta. El programa pregunta la contraseña al jugador, 
		//si la adivina muestra un mensaje de éxito. Si no, muestra el error.

		String contraseña = "tardes";
		
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Escribe la contraseña: ");
		
		String resultado = teclado.next();
		
		if (contraseña.equals(resultado)){
			
		System.out.println ("BRAVO, has encontrado la contraseña");
		}else  System.out.println ("Lo sentimos sigue intentadolo");
		
		
	}

}

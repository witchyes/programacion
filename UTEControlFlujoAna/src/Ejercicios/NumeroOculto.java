package Ejercicios;

import java.util.Scanner;

public class NumeroOculto {

	public static void main(String[] args) {
		// Crea un programa que tiene un numero oculto (del 1 al 10). 
		//El programa pregunta el n�mero al jugador, si la adivina muestra un mensaje de �xito. Si no, muestra el error.
		
		int oculto = 7;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Escribe un n�mero del 1 al 10: ");
		
		int numero = teclado.nextInt();
		
		if (numero == 7){
			System.out.println ("BRAVO, acertaste la palabra oculta");
			
		}else System.out.println ("Sigue intentandolo");

	}

}
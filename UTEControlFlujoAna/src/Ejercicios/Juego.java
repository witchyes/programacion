package Ejercicios;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		// El juego de piedra/papel/tijera. Haz un programa para jugar a piedra/papel/tijera con el ordenador. 
		//Solo una ronda por ejecucion
		//para obtener un número aleatorio en Java entre 1 y 3
		//resultado = (int )(Math.random() * 3 + 1);

		int resultado = (int)(Math.random ()* 3+1);
		String opcion;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Escribe (piedra/papel/tijera)");
		opcion=teclado.next ();
		
		
		
		
	}

}

package Ejercicios;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		// El juego de piedra/papel/tijera. Haz un programa para jugar a piedra/papel/tijera con el ordenador. 
		//Solo una ronda por ejecucion
		//para obtener un número aleatorio en Java entre 1 y 3
		//resultado = (int )(Math.random() * 3 + 1);
// equivalencias: 1=piedra, 2=papel, 3=tijera
		
		int resultado = (int)(Math.random ()* 3+1);
		String eleccion;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Escribe (piedra/papel/tijera)");
		eleccion=teclado.next ();
		
		if (resultado == 1){
			System.out.println ("piedra");
		}else if (resultado == 2){
			System.out.println ("papel");
		}else {
			System.out.println ("tijera");
		}
		
		if (eleccion.equals("papel")&& resultado ==1){
			System.out.println ("usuario: Gana papel");
			
		}else if (eleccion.equals("piedra")&& resultado == 2){
			System.out.println ("maquina. Gana papel");
			
		}else if (eleccion.equals("papel")&& resultado == 2 || 
				eleccion.equals ("piedra")&& resultado == 1 || eleccion.equals ("tijera")&& resultado ==3 ){
			System.out.println ("Empate");
		}else if (eleccion.equals ("tijera")&& resultado == 2){
			System.out.println ("usuario: Gana tijera");
		}else if (eleccion.equals ("tijera")&& resultado == 1){
			System.out.println ("maquina: Gana piedra");
		}
		
	}

}

package ejercicios;

import java.util.Scanner;

public class kilogramos {

	public static void main(String[] args) {
	float kilogramos;
	float calculo;
	calculo=352739619;	
		
	float onzas;
	
	Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe los kilogramos: ");
		
	kilogramos=teclado.nextFloat();
		
	onzas =calculo*kilogramos;
		
		System.out.println("Son:"+onzas+" onzas");
		
		
		teclado.close();

	}

}

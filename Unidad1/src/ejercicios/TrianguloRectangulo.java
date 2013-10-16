package ejercicios;

import java.util.Scanner;

public class TrianguloRectangulo {

	public static void main(String[] args) {
		float cateto1; 
		float cateto2;
		float calculo;
		float hipotenusa;
		
	
	Scanner teclado =new Scanner (System.in);
	
	System.out.println("Escribe el cateto1: ");
	cateto1= teclado.nextFloat();
	System.out.println("Escribe el cateto2: ");
	cateto2= teclado.nextFloat();
	calculo=(cateto1*cateto1)+(cateto2*cateto2);
	hipotenusa=calculo*calculo;
	System.out.println("Hipotenusa: "+hipotenusa);
	
	
	teclado.close();

	}

}

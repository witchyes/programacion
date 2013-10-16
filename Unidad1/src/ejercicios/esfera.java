package ejercicios;

import java.util.Scanner;

public class esfera {

	public static void main(String[] args) {
		float radio; 
		float volumen;
		float pi=3.14F;
		
		
	
	Scanner teclado =new Scanner (System.in);
	
	System.out.println("Escribe el radio: ");
	radio= teclado.nextFloat();
	
	volumen=(4/3*pi*radio*radio*radio);
	
	System.out.println("Volumen: "+volumen);
	
	
	teclado.close();

	}

}

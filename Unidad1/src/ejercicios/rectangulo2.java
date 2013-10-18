package ejercicios;

import java.util.Scanner;

public class rectangulo2 {

	public static void main(String[] args) {
		float x1; 
		float x2; 
		float y1; 
		float y2;
		float area;
		
		
	
	Scanner teclado =new Scanner (System.in);
	
	System.out.println("Escribe x1: ");
	x1= teclado.nextFloat();
	System.out.println("Escribe x2: ");
	x2=teclado.nextFloat();
	System.out.println("Escribe y1: ");
	y1= teclado.nextFloat();
	System.out.println("Escribe y2: ");
	y2=teclado.nextFloat();
	area=(x2-x1)+(y2*y1);
	
	System.out.println("Area: "+area);
	
	
	teclado.close();

	}

}

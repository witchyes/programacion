package ejercicios;

import java.util.Scanner;

public class circulo {

	public static void main(String[] args) {
		float radio;
		float area;
		float perimetro;
		float pi=3.14F;
	
	Scanner teclado =new Scanner (System.in);
	
	System.out.println("Escribe el radio: ");
	radio= teclado.nextFloat();
	area=radio*radio*pi;
	perimetro=(2*pi*radio);
	System.out.println("Area: "+area);
	System.out.println("Perimetro: "+perimetro);
	
	teclado.close();

	}

}

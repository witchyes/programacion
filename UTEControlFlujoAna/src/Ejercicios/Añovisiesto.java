package Ejercicios;

import java.util.Scanner;

public class Añovisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println ("Escribe un año: ");
		Scanner teclado = new Scanner (System.in);
		int año = teclado.nextInt ();
		
		
		if ((año%4 == 0 && año%100 !=0) || (año%400 == 0))
		{ System.out.printf ("El año %d es bisiesto" , año);
		
		}else {
			System.out.printf ("El año %d no es bisiesto", año);
		}

			}
	}

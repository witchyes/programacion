package Ejercicios;

import java.util.Scanner;

public class A�ovisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println ("Escribe un a�o: ");
		Scanner teclado = new Scanner (System.in);
		int a�o = teclado.nextInt ();
		
		
		if ((a�o%4 == 0 && a�o%100 !=0) || (a�o%400 == 0))
		{ System.out.printf ("El a�o %d es bisiesto" , a�o);
		
		}else {
			System.out.printf ("El a�o %d no es bisiesto", a�o);
		}

			}
	}

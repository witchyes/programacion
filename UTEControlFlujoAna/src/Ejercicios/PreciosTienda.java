package Ejercicios;

import java.util.Scanner;

public class PreciosTienda {


	public static void main(String[] args) {
		// Una tienda hace un descuento del 10% por compras menores de 20€, 
		//un 20% por compras entre 20 y 50€ y un 25% si la compra es mayor. 
		//Escribe un programa que pida el precio de un producto y muestre su precio final en las rebajas.

	int precio;
	
	Scanner teclado = new Scanner (System.in);
	
	System.out.println ("Escribe el precio del producto: ");
	
	precio = teclado.nextInt();
	
	if (precio<20){
		System.out.println ("El precio es: "+ (precio -(precio*0.1)));
		
	
	}else {
		if(precio>=20 && precio<50){
			System.out.println ("El precio es: "+ (precio -(precio*0.2)));

		}else {
			if (precio>50){
				System.out.println ("El precio es: "+ (precio -(precio*0.25)));

			}
		}
	}
		
	
	}

}


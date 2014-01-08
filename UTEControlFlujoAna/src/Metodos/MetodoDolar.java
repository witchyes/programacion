package Metodos;
 
import java.util.Scanner;
 
public class MetodoDolar {
 
public static void main(String[] args) {
		//Escribir un metodo que convierta de euros a dolares. Recibir  un numero decimal correspondiente a la cantidad en euros
		//y devolver la cantidad correspondiente en dolares. Escribir el codigo en el main necesario para probarlo.
		// Teclado de toda la vida...
		Scanner teclado = new Scanner(System.in);
		// Pedimos Euros
		System.out.println("Indica los euros");
		// Metemos lo de la consola a "euro"
		double euro = teclado.nextDouble();
		// Imprimimos lo que nos contesta "euroDolar", que es el m�todo que hay abajo
		System.out.println(euroDolar(euro) + "$");
	}
	/*
	* A este m�todo le pasamos un valor en euros (double para que sea decimal)
	* El m�todo se encarga de hacer la conversi�n
	* Nos contesta a trav�s del "return" el resultado de la conversi�n
	* Ese resultado es el que imprime arriba.
	*/
	public static double euroDolar(double euros) {
		// Relaci�n de precio dolar / euro
		double dolar = 1.37570;
		// En vonversi�n metemos el resultado
		double conversion;
		// Al multiplicar euros por la relaci�n entre euros por d�lares
		// conseguimos el valor en d�lares
		conversion = euros * dolar;
		// Devolvemos el resultado de la conversion
		return conversion;
	}
 
}
package ejemplos.primeros_proyectos;

import java.util.Scanner;

public class Cadenas {
	public static void main(String[] args) {
	Scanner teclado=new Scanner (System.in);
	
	String nombre;
	System.out.print("Escribe tu nombre");
	nombre=teclado.nextLine();
	
	System.out.print("Hola "+nombre);
	teclado.close ();
}
}
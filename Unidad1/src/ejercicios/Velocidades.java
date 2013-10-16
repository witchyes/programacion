package ejercicios;

import java.util.Scanner;

public class Velocidades {

	public static void main(String[] args) {
	float mbytes; 
	float mbps;
		
		float Tiempo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe el tamaño del archivo en Mbytes: ");
		
		mbytes=teclado.nextFloat();
		
		System.out.println("Escribe la velocidad de transmision en Mbps: ");
		mbps=teclado.nextFloat();
		Tiempo = mbytes*mbps;
		
		System.out.println("El tiempo de transmisión es: "+Tiempo);
	
		
		teclado.close();

	}

}

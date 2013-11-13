package Ejercicios;

import java.util.Scanner;

public class GasolinaCoche {

	
	public static void main(String[] args) {
		// El ordenador de nuestro coche calcula los kil�metros que nos quedan antes de repostar. 
		//Crea un programa que pida: tama�o del dep�sito (en litros), porcentaje del dep�sito que est� lleno 
		//y litros de consumo por 100kms. El programa mostrar� los kil�metros que quedan de autonom�a. 
		//Si quedan menos de 30 kil�metros mostrar� un aviso de que hay que repostar porque estamos usando la reserva.

	     Scanner teclado = new Scanner(System.in);

         System.out.println("Listros del dep�sito:");
         double deposito = teclado.nextDouble();

         System.out.println("Porcentaje del dep�sito lleno:");
         double cantidad = teclado.nextDouble();
         
         System.out.println("Consumo de combustible (l/100km):");
         double consumo = teclado.nextDouble();
         
         double litosRestantes = deposito * cantidad / 100.0;
         
         int kmRestantes = (int)(litosRestantes / consumo * 100);
         
         System.out.println((kmRestantes<30?"[Reserva] ":"") + "Kil�metros restantes: " + kmRestantes);
         
         teclado.close();
		
		
	}

}

package Ejercicios;

import java.util.Scanner;

public class GasolinaCoche {

	
	public static void main(String[] args) {
		// El ordenador de nuestro coche calcula los kilómetros que nos quedan antes de repostar. 
		//Crea un programa que pida: tamaño del depósito (en litros), porcentaje del depósito que está lleno 
		//y litros de consumo por 100kms. El programa mostrará los kilómetros que quedan de autonomía. 
		//Si quedan menos de 30 kilómetros mostrará un aviso de que hay que repostar porque estamos usando la reserva.

	     Scanner teclado = new Scanner(System.in);

         System.out.println("Listros del depósito:");
         double deposito = teclado.nextDouble();

         System.out.println("Porcentaje del depósito lleno:");
         double cantidad = teclado.nextDouble();
         
         System.out.println("Consumo de combustible (l/100km):");
         double consumo = teclado.nextDouble();
         
         double litosRestantes = deposito * cantidad / 100.0;
         
         int kmRestantes = (int)(litosRestantes / consumo * 100);
         
         System.out.println((kmRestantes<30?"[Reserva] ":"") + "Kilómetros restantes: " + kmRestantes);
         
         teclado.close();
		
		
	}

}

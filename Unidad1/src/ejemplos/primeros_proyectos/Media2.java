package ejemplos.primeros_proyectos;

import java.util.Scanner;

public class Media2 {
	
	public static void main(String[] args) {
		float numero1, numero2;
		
		float media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame los dos numeros: ");
		
		numero1=teclado.nextFloat();
		
		numero2=teclado.nextFloat();
		media = (numero1+numero2) / 2;
		
		System.out.println("La media es:");
		System.out.println(media);
		
		teclado.close();
}
}

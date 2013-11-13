package Ejercicios;



import java.util.Scanner;

public class DiasdelasemanaConIf {

	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		int numero_dia;
		String letra_dia="";
		
		System.out.println("Dame el día de la semana (en número): ");
		numero_dia = teclado.nextInt();
		
		if (numero_dia==1){
			
			letra_dia="Lunes";
			
		}else if (numero_dia==2){
			
			letra_dia="Martes";
		}else if (numero_dia==3){
			
			letra_dia="Miercoles";
		}else if (numero_dia==4){
			
			letra_dia="Jueves";
		}else if (numero_dia==5){
			
			letra_dia="Viernes";
		}else if (numero_dia==6){
			
			letra_dia="Sabado";
		}else if (numero_dia==7){
			
			letra_dia="Domingo";
		}else 
			System.out.println ("ERROR: Introduce un número correcto");
			letra_dia="Error";
			
			{
	
		if (!letra_dia.equals("Error"))	
			System.out.println ("El día "+numero_dia+" corresponde al "+ letra_dia);
			}
	}

}

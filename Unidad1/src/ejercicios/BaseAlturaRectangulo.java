package ejercicios;
import java.util.Scanner;
public class BaseAlturaRectangulo {

	
	public static void main(String[] args)
	{
	float base; float altura;
		float area;
		float perimetro;
		
	
	Scanner teclado =new Scanner (System.in);
	
	System.out.println("Escribe la base: ");
	base= teclado.nextFloat();
	System.out.println("Escribe la altura: ");
	altura=teclado.nextFloat();
	area=(base*altura);
	perimetro=(altura*2)+(base*2);
	System.out.println("Area: "+area);
	System.out.println("Perimetro: "+perimetro);
	
	teclado.close();
	}
}


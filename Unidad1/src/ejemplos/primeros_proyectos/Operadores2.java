package ejemplos.primeros_proyectos;
import java.util.Scanner;

public class Operadores2 {

	public static void main(String[] args) {
		boolean variable;

		
		variable = 5 > 4 + 2;
		System.out.print("5 > (4+2) = " + variable);

		System.out.print("5 > (4+2) = "+ (5 > (4+2)));
		
		boolean se_congela;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print ("Dame la temperatura del agua: ");
		
		if(teclado.nextInt()<=0) se_congela=true;
		else se_congela=false;
		
		teclado.close ();
		
		
	}

}

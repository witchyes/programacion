package ejercicios;

public class Ejercicio_operadores2 {

	public static void main(String[] args) {
		boolean a,b;
		
		
		System.out.println ("a\tb\ta and b\ta or b\tnot a\tnot b");
		
		a= 3>5;
		b= 12 != 8;
		
		System.out.print("3>5\t12!=8\t" + (a&&b));
		System.out.print("\t");
		System.out.print(a||b);
		System.out.print("\t");
		System.out.print(!a);
		System.out.print("\t");
		System.out.println(!b);
		
		a=5>=6;
		b=3!=3;
		
		System.out.print("5>=6\t3!=3\t" + (a&&b));
		System.out.print("\t");
		System.out.print(a||b);
		System.out.print("\t");
		System.out.print(!a);
		System.out.print("\t");
		System.out.println(!b);
		
		
		
		System.out.println("a=(-7==8)\tb=22\tLa expresion es erronea");
		
		a=21!=12;
		b=true;
		
		System.out.print("21!=12\ttrue\t" + (a&&b));
		System.out.print("\t");
		System.out.print(a||b);
		System.out.print("\t");
		System.out.print(!a);
		System.out.print("\t");
		System.out.println(!b);
		
		a=4==2;
		b=7>=-9;
		
		System.out.print("4==2\t7>=-9\t" + (a&&b));
		System.out.print("\t");
		System.out.print(a||b);
		System.out.print("\t");
		System.out.print(!a);
		System.out.print("\t");
		System.out.println(!b);
	}

}

package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		System.out.println(((4-2)*(5+1)/2)>2-(4+3));
		
		System.out.println((6+3)>8 && (6-1)* 2 < 8 || 2* 3==8);
		
		int x,z, y;
		x=7;
		z=2;
		System.out.println((1.0 < x) && (x < z+7.0));
		
		
		x=1;
		y=4; 
		z=10;
	
	
		System.out.println (Math.PI * Math.pow(x,x) > y || 2*Math.PI* x <= z);
		
		 x=1; 
		 y=4; 
		 z=10;
				
		System.out.println (x>3 && y==4 || x + y <= z);
		
		 x=1; 
		 y=4; 
		 z=10;
		
		System.out.println (x>3 && (y==4 || x + y <= z));
	}

}

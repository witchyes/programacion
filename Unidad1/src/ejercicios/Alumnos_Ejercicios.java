package ejercicios;

public class Alumnos_Ejercicios {

	public static void main(String[] args) {
		Alumnos alu1, alu2;
		
		alu1= new Alumnos ();
		alu2= new Alumnos ();
		
		alu1.setNombre ("Angel");
		System.out.println(alu1.getNombre());
		alu2.setNombre("Juan");
		alu2.setEdad(25);
		System.out.println(alu2.getNombre()+" "+alu2.getEdad());

	}

}

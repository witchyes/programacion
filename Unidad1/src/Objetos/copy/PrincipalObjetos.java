package Objetos.copy;


public class PrincipalObjetos {

	public static void main(String[] args) {
		
		Clase1 objeto, objeto2;
		
		objeto = new Clase1();
		objeto2 = new Clase1 ();
		objeto.mensaje();
		objeto2.mensaje();
		
		Alumno juan, pedro;
		
		juan = new Alumno ();
		
		juan.nombre="Juan";
		
		juan.mensaje();
		
	}

}

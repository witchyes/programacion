package ejercicios;

import java.util.Scanner;

public class Alumnos {

	
		private String nombre;
		private int edad;
		
		public Alumnos (){
			
			this.nombre = "";
			this.edad = 0;
		}
	
	public Alumnos (String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
		
	public String getNombre() {
		return nombre;
	}

	

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

}

package Ejercicios;



import java.util.Scanner;

public class Acidez {

        public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);

                System.out.println("Acidez:");
                double acido = teclado.nextDouble();
                
                System.out.println( acido > 3 ? acido > 7 ? "No es �cido" : "Es �cido" : "Es extremadamente �cido");
                
                teclado.close();

        }

}



package main;
import java.util.Scanner;

/**
 * @author elena
 */

public class Actividad1 {
	
	/**
	 * Este es mi método main
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * 
		 * Declaro el atributo scanner
		 */
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Dime la altura que quieres que tenga tu triángulo: ");
		
		/**
		 * Aquí declaro las variables
		 */
		int altura = scanner.nextInt();
		scanner.close();
		
		/**
		 * Aquí creo el bucle anidado con for 
		 */
		 for (int contador = 0; contador < altura; contador++) {
	           for (int filas = 0; filas <= contador;  filas++)
	               System.out.print("*");
	           System.out.println();
		}
		
		
	}
	
}

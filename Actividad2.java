package main;
import java.util.Scanner;

/**
 * @author elena
 */

public class Actividad2 {
	
	/**
	 * Este es mi método main 
	 * @param args
	 */

	public static void main(String[] args) {
		
		/**
		 * Aquí declaro el atributo scanner
		 */
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Dime un número y te hago una triángulo rectángulo: ");
		
		/**
		 * Aquí declaro las variables
		 */
		
		int altura = scanner.nextInt();
		int numero = 1;
		
		scanner.close();
		
		/**
		 * Aquí creo el bucle anidado con for
		 */
			

		for (int contador = 0; contador < altura; contador++) {
	           for (int filas = 0; filas <= contador;  filas++)
	               System.out.print(numero);
	           numero+=1;
	           System.out.println();
		}
		
		
		
		

	}

	}

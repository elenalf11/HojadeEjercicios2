package main;
import java.util.Scanner;

/**
 * @author elena
 */

public class Actividad5 {
	
	/**
	 * Este es mi método main
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * Aquí declaro las variables
		 */
		
		System.out.println("Dime tres números y te diré cual es el máximo de los tres: ");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		int numero3 = scanner.nextInt();
		scanner.close();
		
		/**
		 * Aquí empiezo las condiciones lógicas
		 */
		
		
		/**
		 * Si numero 1 es mayor a numero 3, entonces,...
		 */
		if (numero1 > numero3) {
			
			/**
			 * Si numero 1 tambien es mayor que 2, entonces el número máximo es el numero 1
			 */
			if (numero1 > numero2) {
				System.out.println("El número máximo es el número: " + numero1);
			}
		}
		
		/**
		 * Si numero 2 es mayor a numero 3, entonces,...
		 */
		
		if (numero2 > numero3) {
			/**
			 * Si numero 2 también es mayor a numero 1, entonces el número máximo es el numero 2
			 */
			if (numero2 > numero1) {
				System.out.println("El número máximo es el número: " + numero2);
			}
		}
		
		/**
		 * Si número 3 es mayor a numero 1, entonces,...
		 */
		
		if (numero3 > numero1) {
			
			/**
			 * Si numero 3 también es mayor a numero 2, entonces el número máximo es el número 3
			 */
			if (numero3 > numero2) {
				System.out.println("El número máximo es el número: " + numero3);
			}
		}
		

	}

}

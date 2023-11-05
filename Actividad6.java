package main;
import java.util.Scanner;

/**
 * @author elena
 */

public class Actividad6 {
	
	/**
	 * Este es mi método main
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		/**
		 * Aquí declaro las variables
		 */
		
		System.out.println("Dime tres números y te diré si están en orden: ");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		int numero3 = scanner.nextInt();
		scanner.close();
		
		/**
		 * Aquí empiezo las condiciones lógicas
		 */
		
		/**
		 * Si numero 1 es mayor a numero 2, entonces,...
		 */
		
		if (numero1 > numero2) {
			
			/**
			 * Si numero 2 también es mayor a numero 3, entonces los números están colocados de manera decreciente
			 */
			if (numero2 > numero3) {
				System.out.println("Los números están colocados de manera decreciente");
			}
		}
		
		/**
		 * Si número 1 es menor a numero 2, entonces,...
		 */
		
		if (numero1 < numero2) {
			
			/**
			 * Si también numero 2 es menor a numero 3, entonces los números están colocados de manera creciente
			 */
			if (numero2 < numero3) {
				System.out.println("Los números están colocados de manera creciente");
			}
		}
		
		/**
		 * Si numero 1 es mayor a numero 2, entonces,...
		 */
		
		if (numero1 > numero2) {
			
			/**
			 * Si numero 2 también es menor a numero 3, entonces los números no están colocados en ningún orden
			 */
			if (numero2 < numero3) {
				System.out.println("Los números no están colocados en ningún orden ");
			}
		}
		
		/**
		 * Si número 1 es menor a numero 2, entonces,...
		 */
		if (numero1 < numero2) {
			
			/**
			 * Si numero 2 también es mayor que numero 3, entonces los números no están colocados en ningún orden
			 */
			if (numero2 > numero3) {
				System.out.println("Los números no están colocados en ningún orden");
			}
		}

	}

}

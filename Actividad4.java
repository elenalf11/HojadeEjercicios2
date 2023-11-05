package main;
import java.util.Scanner;

/**
 * @author elena
 */

public class Actividad4 {
/**
 * Este es mi método main
 * @param args
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		/**
		 * Aquí declaro las variables
		 */
		
		System.out.println ("Dime las medidas de tu triángulo (lado1, lado2, lado3): ");
		int lado1 = scanner.nextInt();
		int lado2 = scanner.nextInt();
		int lado3 = scanner.nextInt();
		scanner.close();
		
		/**
		 * Aquí inserto el bucle anidado
		 */
		
		
		/**
		 * Si lado 1 es igual a lado 2 entonces: 
		 */
		if (lado1 == lado2){
			
			/**
			 * Si también lado 1 es igual al lado 3, el triángulo es eqilátero
			 */
			 if (lado1 == lado3) {
				 System.out.println("Es un triángulo equilátero");
				
			}
			 
			 /**
			  * Si lado 1 es distinto a lado 3, entonces es un triángulo isósceles
			  */
			 else if (lado1 != lado3 ) {
				 System.out.println("Es un triángulo isósceles");
			 }
			 	
			
		}
		/**
		 * Si los lados 1 y dos son diferentes y los lados 1 y 3 también son diferentes y los lados 2 y 3 son diferentes, es un triángulo escaleno
		 */
		if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("Es un triángulo escaleno");
			
		}
		/**
		 * Si el lado 2 es igual al lado 3 es un triángulo isósceles
		 */
		if (lado2 == lado3) {
			System.out.println("Es un triángulo isósceles");
		}
		
		

	}

}

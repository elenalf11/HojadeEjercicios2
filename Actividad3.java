package main;
import java.util.Scanner;

/**
 * @author elena
 */

public class Actividad3 {
	
	/**
	 * Este es mi método main
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * Aquí declaro el atributo scanner
		 */
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Voy a copiar las tablas de multiplicar del 1 al 10:");
		
		/**
		 * Aquí declaro las variables
		 */
		int num = scanner.nextInt();
		int num_hor = 1;
		int num_ver = 1;
		int tabla_1 = 1;
		scanner.close();
		
		/**
		 * Aquí creo los bucles anidados con for y while
		 */
		
		for (int linea = 1; linea < num; linea++) {
		
			while (num_hor <= 10) {
			
				System.out.print(num_hor + "  ");
				num_hor++;
				
				while (tabla_1 <= 10) {
					
					System.out.print(tabla_1 + "  ");
					tabla_1++;
				}
			
			} 
		
			
		
			while (num_ver <= 10) {
			
				System.out.println(num_ver + "   ");
				num_ver++;
				
				while (tabla_1 <= 10) {
					System.out.println(tabla_1 + "  ");
					tabla_1++;
				
				}
	
			}
		
			
		}
		
		
		
		
		

	}

}

package arrays;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ArrayBiMedia {
	
	static int numeros[][] = new int[5][5];

	static Scanner sc = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.##");

	public static void main(String[] args) {

		

		llenarArray();
		calcularMedia();

	}

	/**
	 * 
	 */
	private static void llenarArray() {
		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Introduce el valor de la columna: " + (i + 1) + " fila: " + (j + 1));
				numeros[i][j] = sc.nextInt();

			}

		}
	}

	/**
	 * 
	 * @param numeros
	 * @param i
	 * @param media
	 */
	private static void calcularMedia() {
		
		for (int i = 0; i < numeros.length; i++) {

			float media=0;
			
			for (int j = 0; j < numeros[i].length; j++) {
				
				media+=numeros[i][j];

			}
			
			media = media / numeros[i].length;
			
			
			
			System.err.println("La media de la columna: " + (i + 1) + " es: " + df.format(media));

		}
		
		
	}

}

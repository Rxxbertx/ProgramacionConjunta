package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopiarArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Crea un programa en el que definas un array de enteros con los siguientes
		 * números: 3, 10, 5, 7, 14, 20, 83
		 */

		int[] numeros1 = { 3, 10, 5, 7, 14, 20, 83 };
		int posicionInicio, posicionFin;

		System.out.println("La longitud maxima de este array es de: " + numeros1.length);

		System.out.println("Dime la posicion inicial");
		posicionInicio = sc.nextInt();

		System.out.println("Dime la posicion final");
		posicionFin = sc.nextInt();

		int[] numeros2 = Arrays.copyOfRange(numeros1, posicionInicio, posicionFin);
		
		System.out.println(Arrays.toString(numeros2));

	}

}

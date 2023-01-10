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

		/*
		 * Pedirás al usuario la posición inicial y la posición final y copiarás esos
		 * elementos en otro array. Visualiza por pantalla el resultado con el método
		 * correspondiente de la clase Arrays.
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

		/*
		 * Haz una copia exacta del primer array en otro tercer array y visualiza el
		 * resultado de comparas el primero con el segundo y el primero con el tercero
		 */

		int[] numeros3 = numeros1.clone();

		System.out.println("Los arrays 1 y 2 son iguales?: " + numeros1.equals(numeros2));
		System.out.println("Los arrays 1 y 3 son iguales?: " + numeros1.equals(numeros3));

		/*
		 * Pide un número al usuario y rellena todos los elementos del tercer array con
		 * ese número.
		 */

		System.out.println("CON QUE NUMEROS QUIERES RELLENAR EL ARRAY 3?");

		Arrays.fill(numeros3, sc.nextInt());

		System.out.println(Arrays.toString(numeros3));

	}

}

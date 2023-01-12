package arrays;

import java.util.Arrays;

import java.util.Scanner;

public class CopiarArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String [] coches = {"renault", "volvo", "seat", "mercedes", "volkswagen"};
		
		for(String i: coches) {

            System.out.println(i);

        }
		
		// TODO Auto-generated method stub

		/*
		 * Crea un programa en el que definas un array de enteros con los siguientes
		 * números: 3, 10, 5, 7, 14, 20, 83.
		 */

		int[] enteros1 = { 3, 10, 5, 7, 14, 20, 83 };

		/*
		 * - Pedirás al usuario la posición inicial y la posición final y copiarás esos
		 * elementos en otro array. Visualiza por pantalla el resultado con el método
		 * correspondiente de la clase Arrays.
		 */

		int posInicial = 0;

		int posFinal = enteros1.length;

		System.out.println("La posición inicial es " + posInicial);
		System.out.println("La posición final es " + posFinal);

		int[] enteros2 = Arrays.copyOfRange(enteros1, posInicial, posFinal);

		// System.out.println(enteros1.toString()); Da la dirección de memoria
		System.out.println(Arrays.toString(enteros1));

		/*
		 * - Haz una copia exacta del primer array en otro tercer array y visualiza el
		 * resultado de comparas el primero con el segundo y el primero con el tercero.
		 */

		int[] enteros3 = new int[enteros1.length];

		for (int i = 0; i < enteros1.length; i++) {

			enteros3[i] = enteros1[i];
		}

		System.out.println(Arrays.toString(enteros3));

		System.out.println("¿El array " + Arrays.toString(enteros1) + " y el array " + Arrays.toString(enteros2)
				+ " son iguales? " + Arrays.equals(enteros1, enteros2)); // Comparamos solo el contenido

		System.out.println("¿El array " + Arrays.toString(enteros1) + " y el array " + Arrays.toString(enteros2)
				+ " son iguales? " + enteros1.equals(enteros2)); // Comparamos el contenido y el puntero

		System.out.println("¿El array " + Arrays.toString(enteros1) + " y el array " + Arrays.toString(enteros3)
				+ " son iguales? " + Arrays.equals(enteros1, enteros3)); // Comparamos solo el contenido

		System.out.println("¿El array " + Arrays.toString(enteros1) + " y el array " + Arrays.toString(enteros3)
				+ " son iguales? " + enteros1.equals(enteros3)); // Comparamos el contenido y el puntero

		/*
		 * - Pide un número al usuario y rellena todos los elementos del tercer array
		 * con ese número.
		 */

		System.out.println("Dime un número:");

		int num = sc.nextInt();

		Arrays.fill(enteros3, num);

		System.out.println("El nuevo array " + Arrays.toString(enteros3));

		sc.close();
	}

}

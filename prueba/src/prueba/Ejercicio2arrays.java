package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PeppaPig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		 * 1- 2- Crea una clase ArrayPrimos que defina un array de 10 números enteros
		 * inicializados a 0 y luego en un bucle solicite al usuario que introduzca cada
		 * elemento. Luego crea otro bucle que compruebe que números son primos, los
		 * números primos los copiará en otro array de enteros llamado primos
		 */

		int[] array1 = new int[10];

		System.out.println(Arrays.toString(array1));

		creaArray(sc, array1);

		System.out.println("El array que has creado es: " + Arrays.toString(array1));
		int numArray = 0;
		for (int i = 0; i < array1.length; i++) {
			if (arrayPrimo(array1, i)) {
				numArray++;

			}

		}

		System.out.println("El nuevo array tiene extensión de " + numArray);

		int[] array2 = new int[numArray];

		for (int i = 0, i2 = 0; i < array1.length; i++) {
			if (arrayPrimo(array1, i)) {
				array2[i2] = array1[i];
				i2++;
			}

		}
		System.out.println("El nuevo array es: " + Arrays.toString(array2));

		// int[] array2 = new int[primo];

	}

	/**
	 * @param i
	 * @param array1
	 * @return
	 */
	private static boolean arrayPrimo(int[] array1, int i) {

		boolean primo = false;

		for (int num = array1[i]; num <= array1[i]; num++) {
			int x = 1;
			int cont = 0;

			while (x <= num) {
				if (num % x == 0) {
					cont++;
				}
				x++;
			}
			if (cont == 2) {

				primo = true;

			} else {
				primo = false;
			}

		}
		return primo;
	}

	/**
	 * @param sc
	 * @param array1
	 */
	private static void creaArray(Scanner sc, int[] array1) {
		for (int i = 0; i < array1.length; i++) {

			System.out.println("Dime el número de la posición " + i);

			int num = sc.nextInt();

			array1[i] = num;
		}

	}

}

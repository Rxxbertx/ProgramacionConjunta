package prueba;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contNeg = 0, contPos = 0, contCeros = 0;

		int primo = 0;

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

		System.out.println("El nuevo array es: " + Arrays.toString(array1));

		arrayPrimo(primo, array1);
		
		int[] array2 = new int[primo];
		
		

	}

	/**
	 * @param primo
	 * @param array1
	 */
	private static void arrayPrimo(int primo, int[] array1) {
		int array2;

		for (int i = 0; i < array1.length; i++) {

			for (int num = array1[i]; num <= array1.length; num++) {
				int x = 1;
				int cont = 0;

				while (x <= num) {
					if (num % x == 0) {
						cont++;
					}
					x++;
				}

				if (cont == 2) {

					primo++;
					array2=num;
					System.out.println(num + "PRIMO");

				}else {
					System.out.println(num + "NO PRIMO");
				}

			}

		}
		
		
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

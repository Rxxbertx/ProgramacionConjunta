package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contNeg = 0, contPos = 0, contCeros = 0;

		Scanner sc = new Scanner(System.in);

		/*
		 * 1- Crea una clase ArrayCuenta que defina un array de 10 números enteros
		 * inicializados a 0 y luego en un bucle solicite al usuario que introduzca cada
		 * elemento. Luego crea otro bucle que contabilice el total de números
		 * positivos, negativos y 0.
		 */

		int[] array1 = new int[10];

		System.out.println(Arrays.toString(array1));

		creaArray(sc, array1);

		System.out.println("El nuevo array es: " + Arrays.toString(array1));

		arrayCuenta(contNeg, contPos, contCeros, array1);

	}

	/**
	 * @param contNeg		para contar los números negativos del array
	 * @param contPos		para contar los números positivos del array
	 * @param contCeros		para contar los ceros del array
	 * @param array1		el array que hayamos creado
	 */
	private static void arrayCuenta(int contNeg, int contPos, int contCeros, int[] array1) {
		
		
		for (int i = 0; i < array1.length; i++) {

			if (array1[i] < 0) {
				contNeg++;
			} else if (array1[i] > 0) {
				contPos++;

			} else {
				contCeros++;
			}
		}

		System.out.println("Hay " + contNeg + " números negativos, " + contPos + " números positivos y " + contCeros
				+ " ceros en el array " + Arrays.toString(array1));
	}

	/**
	 * @param sc		para introducir los números de los que va a estar compuesto el array
	 * @param array1	para que se vayan almacenando los valores en el array con una longitud predeterminada
	 */
	private static void creaArray(Scanner sc, int[] array1) {
		for (int i = 0; i < array1.length; i++) {

			System.out.println("Dime el número de la posición " + i);

			int num = sc.nextInt();

			array1[i] = num;
		}
	}

}

package arrays;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3- Crea una clase ArrayRandom que defina un array de 10 números enteros
		 * inicializados a 0. Crea un bucle que inicialice los valores del array usando
		 * números aleatorios de 0 a 25. Luego crea otro bucle que si encuentra el
		 * número 15 en algún elemento salga del bucle y muestre la posición en la que
		 * está.
		 */

		int[] array1 = new int[10];

		arrayRandom(array1);

		System.out.println("El array que has creado es: " + Arrays.toString(array1));

	}

	/**
	 * @param array1 array que se va a generar con números aleatorios
	 */
	private static void arrayRandom(int[] array1) {
		for (int i = 0; i < array1.length; i++) {

			array1[i] = (int) (Math.random() * 25);

			if (array1[i] == 15) {
				System.out.println(
						"El número 15 está en la posición " + i + " lo que en la realidad es la posición " + (i + 1));
				i = array1.length;
			}
		}
	}

}
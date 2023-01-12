package arrays;

import java.util.Arrays;
import java.util.Random;


public class ArrayRandom {

	public static void main(String[] args) {

		/*
		 * 3- Crea una clase ArrayRandom que defina un array de 10 números enteros
		 * inicializados a 0. Crea un bucle que inicialice los valores del array usando
		 * números aleatorios de 0 a 25. Luego crea otro bucle que si encuentra el
		 * número 15 en algún elemento salga del bucle y muestre la posición en la que
		 * está.
		 */

		int[] numeros = llenarArray();

		comprobarNumero15(numeros);
		
		
		
		
		
		

	}

	/**
	 * @param numeros
	 */
	private static void comprobarNumero15(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 15) {

				System.out.println("El numero 15 esta en la posicion: " + (i+1));

				break;
				
			} else if (i == numeros.length - 1) {
				
				System.out.println("No hemos encontrado ningun numero 15");
			}
		}
		
		System.out.println(Arrays.toString(numeros));
	}

	/**
	 * @return
	 */
	private static int[] llenarArray() {
		Random random = new Random();

		int[] numeros = new int[10];
		Arrays.fill(numeros, 0);

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = random.nextInt(26);

		}
		return numeros;
	}

}

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrimos {

	public static void main(String[] args) {

		/*
		 * 2- Crea una clase ArrayPrimos que defina un array de 10 números enteros
		 * inicializados a 0 y luego en un bucle solicite al usuario que introduzca cada
		 * elemento. Luego crea otro bucle que compruebe que números son primos, los
		 * números primos los copiará en otro array de enteros llamado primos.
		 */

		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		

		añadirNumerosArray(sc, numeros);

	}
	
	
	
	
	

	private static void añadirNumerosArray(Scanner sc, int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Introduce un numero (" + (i + 1) + "/" + (numeros.length) + ")");
			numeros[i] = sc.nextInt();
			System.out.println();

		}

		crearArrayDePrimos(numeros);

	}

	private static void crearArrayDePrimos(int[] numeros) {

		int contadorPrimos = 0;

		int[] tempArray = new int[numeros.length];

		for (int i = 0; i < numeros.length; i++) {

			if (comprobarPrimo(numeros[i])) {

				tempArray[i] = numeros[i];
				contadorPrimos++;

			}

		}

		Arrays.sort(tempArray);

		int[] primos = Arrays.copyOfRange(tempArray, 10 - contadorPrimos, 10);

		System.err.println(Arrays.toString(primos));

	}

	private static boolean comprobarPrimo(int numero) {

		boolean esPrimo = false;

		for (int i = 2; i <= numero; i++) {

			if (numero % i == 0) {

				if (numero == i) {

					esPrimo = true;

				} else {
					return false;
				}

			}

		}

		return esPrimo;

	}
}

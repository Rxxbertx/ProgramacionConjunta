package arrays;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayBaraja {

	public static Random random = new Random();
	protected static int[] baraja = new int[10];
	static int[] nuevoIndex = new int[10];

	public static void main(String[] args) {

		/*
		 * Crea una clase ArrayBarajar que defina un array de 10 números enteros
		 * inicializados a 0 y luego en un bucle solicite al usuario que introduzca cada
		 * elemento. En un bucle muestra en pantalla todos los elementos en una sola
		 * línea. Luego crea otro bucle para barajar los elementos usando el método
		 * Random con los índices (debes obtener dos índices), de tal forma que
		 * intercambies el contenido del array para ese índice con el otro.
		 */

		pedirNumerosAlUsuario();

		generarNuevosIndices();

		aplicarIndicesNuevos();

	}

	/**
	 * Rellenamos el array con numeros introducidos por el usuario
	 */

	private static void pedirNumerosAlUsuario() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < baraja.length; i++) {

			System.out.println("Introduce la carta " + (i + 1) + "/" + baraja.length);

			baraja[i] = sc.nextInt();

		}

		System.err.println("Tu baraja es: " + Arrays.toString(baraja));
	}

	/**
	 * Rellenamos el array con numeros aleatorios entre uno y diez que correspondera
	 * a posiciones del array de baraja. Evitamos la repeticion de posiciones
	 */

	private static void generarNuevosIndices() {

		boolean indiceRepetido;

		for (int i = 0; i < nuevoIndex.length; i++) {

			indiceRepetido = false;

			while (!indiceRepetido) {

				nuevoIndex[i] = random.nextInt(10);

				for (int j = 0; ((j < nuevoIndex.length) && (!indiceRepetido)); j++) {

					if (nuevoIndex[i] == nuevoIndex[j] && i != j)

						indiceRepetido = true;

				}

				if (!indiceRepetido) {

					indiceRepetido = true;

				} else {

					indiceRepetido = false;

				}

			}

		}
	}

	/**
	 * Aplicamos un nuevo valor a la posicion i de la baraja, guardando previamente
	 * el valor de la baraja para aplicarlo al valor que ha modificado anteriormente
	 * el valor de la baraja i. La posicion de la baraja a modificar correspondra a
	 * una posicion del array, que guardara numeros aleatorios (posiciones)
	 */

	private static void aplicarIndicesNuevos() {

		for (int i = 0; i < baraja.length; i++) {// 0-9

			int j = baraja[i];// baraja[0]=50 baraja[1]=100

			baraja[i] = baraja[nuevoIndex[i]]; // baraja[0] baraja[1] nuevoIndex[0]----1

			baraja[nuevoIndex[i]] = j;

		}

		System.out.println("Tu baraja ahora es: " + Arrays.toString(baraja));
	}

}

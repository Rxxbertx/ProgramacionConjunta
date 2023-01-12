package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCuentas {

	public static void main(String[] args) {

		/*
		 * 1- Crea una clase ArrayCuenta que defina un array de 10 números enteros
		 * inicializados a 0 y luego en un bucle solicite al usuario que introduzca cada
		 * elemento. Luego crea otro bucle que contabilice el total de números
		 * positivos, negativos y 0.
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		Arrays.fill(numeros, 0);
		int numerosPositivos = 0, numerosNegativos = 0, numerosCero = 0;

		añadirNumerosArray(sc, numeros, numerosCero, numerosNegativos, numerosPositivos);

	}
	
	
	

	/**
	 * Este metodo lo que hace es 
	 * @param sc
	 * @param numeros
	 * @param numerosPositivos
	 * @param numerosNegativos
	 * @param numerosCero
	 */
	private static void añadirNumerosArray(Scanner sc, int[] numeros, int numerosCero, int numerosNegativos,
			int numerosPositivos) {
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Introduce un numero (" + (i + 1) + "/" + (numeros.length) + ")");
			numeros[i] = sc.nextInt();
			System.out.println();

		}

		contadorNumeros(numerosPositivos, numerosNegativos, numerosCero, numeros);
	}

	/**
	 * @param numerosPositivos
	 * @param numerosNegativos
	 * @param numerosCero
	 * @param numeros
	 */
	private static void contadorNumeros(int numerosPositivos, int numerosNegativos, int numerosCero, int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > 0) {

				numerosPositivos++;

			} else if (numeros[i] == 0) {

				numerosCero++;

			} else {

				numerosNegativos++;

			}

		}

		System.out.println("Numeros Cero: " + numerosCero);
		System.out.println("Numeros Negativos: " + numerosNegativos);
		System.out.println("Numeros Positivos: " + numerosPositivos);
	}

}

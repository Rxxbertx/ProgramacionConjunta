package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMenorMayor {

	static int[] numeros;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Crea un programa que, a partir de un vector de números enteros, halle y
		 * muestre el valor más alto que contiene (su máximo) y el valor más bajo que
		 * contiene (su mínimo). El programa debe pedir el número de elementos que
		 * tendrá el vector y los valores de cada uno de esos elementos.
		 */

		crearArray_AñadirContenido(sc);

		sacarMaximoMinimo();

	}

	/**
	 * En este metodo lo que hacemos es ordenar el array y en ese caso en la primera
	 * posicion estara el numero mas pequeño y en la ultima el mayor
	 */

	private static void sacarMaximoMinimo() {

		Arrays.sort(numeros);
		System.out.println("El numero minimo es " + numeros[0]);
		System.out.println("El numero mayor es " + numeros[numeros.length-1]);

	}

	/**
	 * En este metodo creamos el array de una determinada longitud, y el usuario
	 * define un valor por cada posicion
	 * 
	 * @param sc objeto scanner para permitir entradas del usuario
	 */

	private static void crearArray_AñadirContenido(Scanner sc) {
		System.out.println("Determina el valor del array");
		numeros = new int[sc.nextInt()];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Determina el valor (" + (i + 1) + "/" + numeros.length+")");
			numeros[i] = sc.nextInt();
		}
	}

}

package arrays;

import java.util.Scanner;

public class ArrayBiMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una clase que se llame ArrayBiMedia que defina un array bidimensional de
		 * 5x5 números enteros inicializados a 0. Deberás solicitar al usuario que
		 * introduzca cada elemento. Después se mostrará el resultado de la media de
		 * cada fila
		 */

		int[][] cubo = new int[5][5];
		Scanner sc = new Scanner(System.in);

		for (int posFila = 0; posFila < cubo.length; posFila++) {
			System.out.println("Vamos a introducir los datos de la fila " + (posFila + 1));
			for (int posCol = 0; posCol < cubo[posFila].length; posCol++) {
				System.out.print("Número " + (posCol + 1) + ":");
				int numero = sc.nextInt();
				cubo[posFila][posCol] = numero;

			}

		}
		for (int posFila = 0; posFila < cubo.length; posFila++) {
			int suma = 0;
			for (int posCol = 0; posCol < cubo[posFila].length; posCol++) {

				suma += cubo[posFila][posCol];

			}
			double media = suma / cubo.length;
			System.err.println("La media de la fila  " + (posFila + 1) + "es:" + media);

		}

	}
}

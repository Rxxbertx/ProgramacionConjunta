package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		 * 4- Crea una clase ArrayBarajar que defina un array de 10 números enteros
		 * inicializados a 0 y luego en un bucle solicite al usuario que introduzca cada
		 * elemento. En un bucle muestra en pantalla todos los elementos en una sola
		 * línea. Luego crea otro bucle para barajar los elementos usando el método
		 * Random con los índices (debes obtener dos índices), de tal forma que
		 * intercambies el contenido del array para ese índice con el otro. Los índices
		 * son del 0 al 10 con el math. Que se repita 5 veces.
		 */

		// Declaramos e inicializamos un array a 0
		int[] baraja = new int[10];

		crearArray(sc, baraja);

		System.out.println(Arrays.toString(baraja));

		int indice1;
		int indice2;
		int cont = 0;

		while (cont <= 5) {
			indice1 = (int) (Math.random() * 10);
			indice2 = (int) (Math.random() * 10);
			System.out.println("Indice 1: " + indice1 + " Indice 2: " + indice2);
			for (int i = 0; i < baraja.length; i++) {
				int temp1=baraja[indice1];
				System.out.println(temp1);
				int temp2=baraja[indice2];
				System.out.println(temp2);

				baraja[indice1] = temp2;//4   7
				baraja[indice2] = temp1;
			}
			cont++;
			System.out.println("El nuevo array es " + Arrays.toString(baraja));
		}

	}

	/**
	 * @param sc
	 * @param baraja
	 */
	private static void crearArray(Scanner sc, int[] baraja) {
		for (int i = 0; i < baraja.length; i++) {

			System.out.println("Dime el número para la posición " + (i + 1));

			baraja[i] = sc.nextInt();

		}
	}

}

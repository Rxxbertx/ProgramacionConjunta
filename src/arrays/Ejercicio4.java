package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 0;

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
		
		//Creamos el array pidiendo al usuario que introduzca cada una de las posiciones del array

		crearArray(sc, baraja);

		System.out.println(Arrays.toString(baraja));
	
		barajar(baraja, cont);

		System.out.println("La baraja final tras haber barajado es: " + Arrays.toString(baraja));

	}

	/**
	 * Método para barajar la baraja con dos índices que se sacarán 5 veces de forma aleatoria
	 * @param baraja array de cartas que se va a barajar
	 * @param cont   contador para barajar 5 veces con dos índicen aleatorios
	 */
	private static void barajar(int[] baraja, int cont) {

		while (cont <= 5) {
			int indice1 = (int) (Math.random() * 10);
			int indice2 = (int) (Math.random() * 10);
			System.out.println("Se va a intercambiar la posición " + indice1 + " por la posición " + indice2);
			int carta1 = baraja[indice1];
			int carta2 = baraja[indice2];

			baraja[indice1] = carta2;// 4 7

			baraja[indice2] = carta1;

			cont++;
			System.out.println("El nuevo array es " + Arrays.toString(baraja));
		}
	}

	/**
	 * Método para crear el array baraja
	 * @param sc     Scanner para introducir las cartas de la baraja
	 * @param baraja Baraja ya conformada con todos los elementos que ha introducido
	 *               el usuario
	 */
	private static void crearArray(Scanner sc, int[] baraja) {
		for (int i = 0; i < baraja.length; i++) {

			System.out.println("Dime el número para la posición " + (i + 1));

			baraja[i] = sc.nextInt();

		}
	}

}
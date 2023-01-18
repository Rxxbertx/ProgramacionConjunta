package arrays;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 6- Crea un programa para calcular la letra de un DNI. Se le pedirá al usuario
		 * un DNI sin letra, el programa calculará la letra que corresponde y se
		 * mostrará el DNI completo. Para calcular la letra, cogeremos el resto de
		 * dividir el dni entre 23. Haz un método donde según el resto de la división
		 * (posición del elemento del array) busque en un array de caracteres la letra.
		 * Esta es la tabla de caracteres:
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		// Inicializamos el array dni con las letras que puede darse a dni dependiendo
		// del resto que dé al dividir el número del dni entre 23

		char[] dni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		int numDni = dameDNI(sc);

		System.out.println("El dni queda como sigue: " + numDni + "-" + dni[numDni % 23]);

		sc.close();

	}

	/**
	 * @param sc
	 * @return
	 */
	private static int dameDNI(Scanner sc) {
		System.out.println("Introduce por favor tu número de dni sin la letra");

		int numDni = sc.nextInt();
		return numDni;
	}

}

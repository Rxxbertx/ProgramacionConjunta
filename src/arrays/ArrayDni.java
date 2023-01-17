package arrays;

import java.util.Scanner;

public class ArrayDni {

	public static void main(String[] args) {

		final String[] letraDni = { "T", "R", "W", "A", "G", "M", "Y", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };
		Scanner sc = new Scanner(System.in);

		/*
		 * 6- Crea un programa para calcular la letra de un DNI. Se le pedirá al usuario
		 * un DNI sin letra, el programa calculará la letra que corresponde y se
		 * mostrará el DNI completo. Para calcular la letra, cogeremos el resto de
		 * dividir el dni entre 23. Haz un método donde según el resto de la división
		 * (posición del elemento del array) busque en un array de caracteres la letra.
		 * Esta es la tabla de caracteres:
		 */

		mostrarDNI(letraDni, sc);

	}

	private static void mostrarDNI(final String[] letraDni, Scanner sc) {
		
		String dniCompleto = dniCompleto(escribirDniSinLetra(sc), letraDni);
		System.out.println(dniCompleto);
	}

	private static int escribirDniSinLetra(Scanner sc) {
		System.out.println("Escribe el DNI sin la letra");
		return sc.nextInt();
		
	}

	private static String dniCompleto(int dni, String[] letraDni) {

		int posicionArray = dni % 23;

		return (letraDni[posicionArray]+"-" + dni);

	}

}

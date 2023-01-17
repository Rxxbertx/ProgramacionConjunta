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

	/**
	 * Mostramos el dni con su letra y numeros
	 * 
	 * @param letraDni array de caracteres donde cada posicion es una letra
	 * @param sc       objeto scanner necesario para otros metodos
	 */
	private static void mostrarDNI(final String[] letraDni, Scanner sc) {

		String dniCompleto = dniCompleto(escribirDniSinLetra(sc), letraDni);
		System.out.println(dniCompleto);
	}

	/**
	 * Pedimos al usuario que introduzca su dni sin la letra
	 * 
	 * @param sc objeto scanner
	 * @return devuelve el dni del usuario
	 */

	private static int escribirDniSinLetra(Scanner sc) {
		System.out.println("Escribe el DNI sin la letra");
		return sc.nextInt();

	}

	/**
	 * Podemos determinar la letra del dni y cogemos el resto de la division del dni
	 * entre 23 y ese valor sera la letra correspondiente en el array de caracteres
	 * 
	 * @param dni Dni sin letra del usuario
	 * @param letraDni letra del dni del usuario
	 * @return string del dni completo con letra y numeros
	 */

	private static String dniCompleto(int dni, String[] letraDni) {

		int posicionArray = dni % 23;

		return (letraDni[posicionArray] + "-" + dni);

	}

}

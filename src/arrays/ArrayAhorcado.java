package arrays;

import java.util.Scanner;

public class ArrayAhorcado {

	static char[] palabraSecreta;
	static char[] mostrarPalabraSecreta;
	static Scanner sc = new Scanner(System.in);
	static char[][] pantalla = new char[5][5];
	static String letrasProbadas = "";
	static int vidas = 9;

	public static void main(String[] args) {

		escribirPalabraInicial();

		char[][] pantalla = pantalla();
		mostrarPantalla(pantalla);

		System.out.println("Vamos a empezar el juego, dime una letra");
		String letra = sc.next();
//F
		if (!comprobarLetra(letra)) {
			dibujarFallo();
		}

	}

	private static boolean comprobarLetra(String letra) {

		boolean acierto = false;

		if (letra.contains(letrasProbadas)) {

			System.out.println("Introduciste una letra probada anteriormente");
			return true;

		} else {
			letrasProbadas += letra;

			for (int i = 0; i < palabraSecreta.length; i++) {

				if (letra.charAt(0) == palabraSecreta[i]) {

					mostrarPalabraSecreta[i] = letra.charAt(0);
					acierto = true;
				}

				System.out.print(mostrarPalabraSecreta[i]);

			}

		}
		return acierto;

	}

	/**
	 * @param acierto
	 */
	private static void dibujarFallo() {
		vidas--;
		switch (vidas) {
		case 8:

			for (int i = 0; i < 4; i++) {

				pantalla[4][i] = '-';

			}

			break;
		case 7:

			boolean primeraFila = true;
			for (int i = 0; i < 4; i++) {

				for (int j = 0; j < 1; j++) {

					if (primeraFila) {
						primeraFila = false;
						pantalla[0][1] = '-';

					} else {
						pantalla[i][j] = '|';
					}

				}

			}

			break;
		case 6:

			for (int i = 2; i <= 3; i++) {
				pantalla[0][i] = '-';
			}

			break;
		case 5:

			pantalla[1][3] = 'º';

			break;
		case 4:

			pantalla[2][3] = '#';

			break;
		case 3:

			pantalla[1][2] = '<';

			break;
		case 2:

			pantalla[1][4] = '>';

			break;
		case 1:

			pantalla[3][2] = '|';

			break;

		case 0:

			pantalla[3][4] = '|';

			break;

		default:
			break;
		}

	}

	/**
	 * @return
	 */
	private static char[][] pantalla() {

		for (int i = 0; i < pantalla.length; i++)
			for (int j = 0; j < pantalla.length; j++)
				pantalla[i][j] = ' ';
		return pantalla;
	}

	/**
	 * @param pantalla
	 */
	private static void mostrarPantalla(char[][] pantalla) {
		System.out.print("╔");

		for (int i = 0; i < pantalla.length; i++) {
			System.out.print("═");
		}
		System.out.print("╗");
		System.out.println();

		for (int i = 0; i < pantalla.length; i++) {

			System.out.print("║");

			for (int j = 0; j < pantalla.length; j++) {
				System.out.print(pantalla[i][j]);

			}
			System.out.print("║");
			System.out.println();

		}
		System.out.print("╚");
		for (int i = 0; i < pantalla.length; i++) {
			System.out.print("═");
		}
		System.out.println("╝");
	}

	/**
	 *
	 */
	private static void escribirPalabraInicial() {
		System.out.println("Introduce la palabra inicial");
		String palabra = sc.next();

		palabraSecreta = new char[palabra.length()];
		mostrarPalabraSecreta = new char[palabra.length()];

		for (int i = 0; i < palabra.length(); i++) {
			palabraSecreta[i] = palabra.charAt(i);
			mostrarPalabraSecreta[i] = '_';
		}
	}

}

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class JuegoAhorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * - Definimos un array de caracteres con el identificador palabraSecreta e
		 * inicializado a la palabra a adivinar.
		 */

		char[] palabraSecreta = { 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'a' };

		char[] palabra = new char[palabraSecreta.length];

		/*
		 * - Definimos una matriz de caracteres 5x5 con el identificador pantalla.
		 */

		char[][] pantalla = new char[5][5];

		/*
		 * - Define un método estático inicializaJuego, que no devuelva nada y tenga
		 * como parámetros el vector palabra y la matriz pantalla. En este método se
		 * inicializará el array palabra almacenando en cada elemento a ‘_’. Y el array
		 * pantalla con el carácter ‘0’.
		 */

		inicializaJuego(pantalla, palabra);

		/*
		 * - Define otro método estático mostrar, que no devuelva nada y tenga como
		 * parámetros el vector palabra y la matriz pantalla. En este método se
		 * visualizará primero el vector palabra y luego la matriz pantalla. Utiliza
		 * bucles for para ello.
		 */

		mostrar(palabraSecreta, palabra, pantalla);

		/*
		 * - Haz otro método estático buscarLetra que busque la letra en el array
		 * palabraSecreta y devuelva la posición donde se encuentra si no se encuentra
		 * devolverá -1. Este método tiene una variable local posición inicializada a
		 * –1.
		 */
		Scanner sc = new Scanner(System.in);

		char letra = sc.next().charAt(0);

		for (int i = 0; i < palabra.length; i++) {
			int cont = 0;
			while (palabra[i] != palabraSecreta[i] || cont >= 9) {
				System.out.print("Dime una letra:");

				letra = sc.next().charAt(0);

				if (buscarLetra(palabraSecreta, letra, palabra) == true) {

					// System.out.println(Arrays.toString(palabra));

					for (char fila : palabra) {
						System.out.print(fila);
						System.out.print(' ');
					}
					System.out.println();

				} else {
					
					cont++;
					System.out.println("Contador: " + cont);
					switch (cont) {
					case 1:
						for (int x = 0; x < 3; x++) {
							pantalla[4][x] = '@';

						}
						mostrar(palabraSecreta, palabra, pantalla);
						break;
					case 2:
						for (int z = 0; z < 4; z++) {
							pantalla[z][1] = '@';
						}
						mostrar(palabraSecreta, palabra, pantalla);
						break;
					case 3:
						pantalla[0][2] = '@';
						pantalla[0][3] = '@';
						mostrar(palabraSecreta, palabra, pantalla);
						break;
					case 4:
						pantalla[1][3] = '@';
						mostrar(palabraSecreta, palabra, pantalla);
						break;
					case 5:
						pantalla[2][3] = 'X';
						mostrar(palabraSecreta, palabra, pantalla);
						break;
					case 6:
						pantalla[1][2] = '/';
						mostrar(palabraSecreta, palabra, pantalla);
						break;
					case 7:
						pantalla[1][4] = '/';
						mostrar(palabraSecreta, palabra, pantalla);
						break;
					case 8:
						pantalla[3][2] = '/';
						mostrar(palabraSecreta, palabra, pantalla);
						break;
					case 9:
						pantalla[3][4] = '/';
						mostrar(palabraSecreta, palabra, pantalla);
						System.out.println("You're death!");
						break;

						
					}

					

				}

			}
		}

	}

	/**
	 * @param palabraSecreta
	 * @param sc
	 */
	private static boolean buscarLetra(char[] palabraSecreta, char letra, char[] palabra) {
		// int posicion = -1;
		boolean acierto = false;

		for (int i = 0; i < palabraSecreta.length; i++) {
			if (letra == palabraSecreta[i]) {
				// posicion = i;
				palabra[i] = letra;
				acierto = true;
			}
		}

		return acierto;
	}

	/**
	 * @param palabraSecreta
	 * @param palabra
	 * @param pantalla
	 */
	private static void mostrar(char[] palabraSecreta, char[] palabra, char[][] pantalla) {
		for (int i = 0; i < palabraSecreta.length; i++) {
			if (i == palabraSecreta.length - 1) {
				System.out.print(palabra[i] + "\n");
			} else {
				System.out.print(palabra[i] + " ");
			}
		}

		for (int posFila = 0; posFila < pantalla.length; posFila++) {

			for (int posCol = 0; posCol < pantalla[posFila].length; posCol++) {

			}
			System.out.println(Arrays.toString(pantalla[posFila]));
		}
	}

	/**
	 * @param palabraSecreta
	 * @param pantalla
	 */
	private static void inicializaJuego(char[][] pantalla, char[] palabra) {

		for (int i = 0; i < palabra.length; i++) {
			palabra[i] = '_';
		}

		for (int posFila = 0; posFila < pantalla.length; posFila++) {

			for (int posCol = 0; posCol < pantalla[posFila].length; posCol++) {
				pantalla[posFila][posCol] = '0';

			}
		}
	}

}

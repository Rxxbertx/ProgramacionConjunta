package arrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Declaramos las variables que vamos a utilizar

		double carta;

		double sumaJugador = 0;

		double sumaOrdenador = 0;

		int opcion = 0;
		
		double [] baraja = {1,2,3,4,5,6,7,0.5,0.5,0.5};

		carta = cartaAleatoria(baraja);

		sumaJugador += turnoJugador(carta);

		System.out.println("La suma de tus cartas hasta ahora es " + sumaJugador);

		System.out.println("¿Quieres destapar una carta?");
		System.out.println("1. Si");
		System.out.println("0. No");

		Scanner sc = new Scanner(System.in);

		opcion = sc.nextInt();

		// Mientras tanto la sumaJugador como la sumaOrdenador sean menores que 7.5 se
		// mantienen en el bucle

		while (sumaJugador < 7.5 && sumaOrdenador < 7.5) {

			// Mientras haya seleccionado la opción 1 y la sumaJugador sea menor que 7.5 el
			// jugador sigue jugando

			while (opcion == 1 && sumaJugador < 7.5) {

				// Se saca una carta de forma aleatoria

				carta = cartaAleatoria(baraja);

				sumaJugador += turnoJugador(carta);

				System.out.println("La suma de tus cartas hasta ahora es " + sumaJugador);

				if (sumaJugador >= 7.5) {
					System.out.println("Has perdido ☹️");
				} else {

					System.out.println("¿Quieres destapar una carta?");
					System.out.println("1. Si");
					System.out.println("0. No");

					opcion = sc.nextInt();

				}

				// Si sumaJugador es menor que 7.5 juega el ordenador y evalua si ha ganado el
				// jugador o si hay que seguir jugando
			}
			if (sumaJugador < 7.5) {
				sumaOrdenador = turnoOrdenador(sumaJugador, sumaOrdenador);

				if (sumaOrdenador >= 7.5 && sumaJugador < 7.5) {
					System.out.println("El ordenador lleva " + sumaOrdenador);
					System.out.println("¡Has ganado! 🤩");
					opcion = 0;
				} else {
					System.out.println("El ordenador lleva " + sumaOrdenador);
					System.out.println("Es tu turno");
					opcion = 1;
				}
			}

		}
		System.out.println("Fin del juego");
		sc.close();

	}

	/**
	 * Método cartaAleatoria para que me de cartas aleatorias (al jugador)
	 * 
	 * @param baraja double array: Array en el que se alojan las cartas que pueden salir
	 * @return carta: Valor que ha obtenido
	 */
	private static double cartaAleatoria(double baraja[]) {
		double carta;
		
		
		carta=baraja[(int)Math.floor(Math.random() * 10)];

		turnoJugador(carta);

		System.out.println(
				"La carta que he obtenido es: " + queCarta(carta) + " y vale " + turnoJugador(carta) + " puntos");
		return carta;
	}

	/**
	 * Método queCarta para nombrar a las cartas que no se llaman por el número
	 * 
	 * @param carta double: Valor que indica el número que ha salido de forma
	 *              aleatoria
	 * 
	 * @return cartaEspecial String: Cadena que especifica la carta que es en caso
	 *         de que no sea un número
	 * 
	 */

	private static String queCarta(double carta) {
		String cartaEspecial;
		switch ((int) carta) {
		case 1:
			cartaEspecial = "as";
			break;
		case 8:
			cartaEspecial = "sota";
			break;
		case 9:
			cartaEspecial = "caballo";
			break;
		case 10:
			cartaEspecial = "rey";
			break;
		default:

			cartaEspecial = String.valueOf(carta);
		}
		return cartaEspecial;

	}

	/**
	 * Método turnoOrdenador en el que juega el ordenador sacando cartas de forma
	 * aleatoria hasta que llega al menos a igualar lo que lleva el jugador
	 * 
	 * @param sumaJugador   double: Valor que indica la cantidad de puntos que lleva
	 *                      el jugador
	 * 
	 * @param sumaOrdenador double: Valor que indica la cantidad de puntos que lleva
	 *                      el ordenador
	 * 
	 * @return sumaOrdenador: Puntos que ha conseguido el ordenador con las cartas
	 *         que ha sacado de forma aleatoria hasta al menos igualar la puntuación
	 *         del jugador
	 * 
	 */

	private static double turnoOrdenador(double sumaJugador, double sumaOrdenador) {
		while (sumaOrdenador < sumaJugador) {
			double valor;
			double carta = Math.floor(Math.random() * (11 - 1) + 1);
			if (carta <= 7) {
				valor = carta;
			} else {
				valor = 0.5;
			}
			System.out
					.println("El ordenador ha obtenido la carta " + queCarta(carta) + " que vale " + valor + " puntos");
			sumaOrdenador += valor;
		}
		return sumaOrdenador;

	}

	/**
	 * Método turnoJugador en el que establece los valores dependiendo de la carta
	 * que saque
	 * 
	 * @param carta double: Valor que se saca de modo aleatorio
	 * 
	 * @return valor: Lo que vale la carta
	 * 
	 */

	private static double turnoJugador(double carta) {
		double valor;
		if (carta <= 7) {
			valor = carta;
		} else {
			valor = 0.5;
		}
		return valor;

	}

}

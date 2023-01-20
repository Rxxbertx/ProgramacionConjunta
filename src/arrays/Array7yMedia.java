package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array7yMedia {

	static final float[] CARTAS = { 0, 1, 2, 3, 4, 5, 6, 7, 0.5f, 0.5f, 0.5f };
	static final Random CARTA_ALEATORIA = new Random();

	public static void main(String[] args) {

		iniciarJuego();

	}

	/**
	 * Este metodo es la ejecuccion del turno del usuario y del turno del pc, si el
	 * turno del usaurio supera 7.5 no tiene sentido iniciar el turno del pc porque
	 * el usuario ha perdido
	 */

	private static void iniciarJuego() {

		float SumaUsuario = turnoUsuario();
		if (SumaUsuario <= 7.5) {
			turnoPC(SumaUsuario);
		}
	}

	/**
	 * El turno del PC, intentara ganarte siempre, si sus cartas llegan a ser
	 * iguales o mayores a las tuyas (empate si son iguales, te gana si ha sacado
	 * mas que tu sin pasarse de 7,5, y pierde si ha superado 7.5)
	 * 
	 * @param sumaUsuario es la suma del usuario, para compararla con la del pc
	 */

	private static void turnoPC(float sumaUsuario) {

		double SumaCartas = 0;

		int turnoPc = 1;

		while (turnoPc == 1) {

			SumaCartas += CartaAleatorio();
			System.out.println("SUMA TOTAL= " + SumaCartas + "\n");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (SumaCartas >= sumaUsuario) {
				turnoPc = 0;

				if (SumaCartas == sumaUsuario) {
					System.err.println("EMPATE");
				} else if (SumaCartas > 7.5) {
					System.err.println("HAS GANADO AL PC");
				} else {
					System.err.println("TE HA GANADO EL PC, BOT");
				}
			}
		}
	}

	/**
	 * Turno del usuario es muy parecido al turno del pc, con la diferencia de
	 * pedirle si quiere destapar carta o no para que comience el turno del pc si no
	 * se ha pasado de 7.5
	 * 
	 * @return devulve el valor de la suma de las cartas totales que ha destapado
	 */

	private static float turnoUsuario() {

		Scanner sc = new Scanner(System.in);

		int suTurno = 1;
		float SumaCartas = 0;

		while (suTurno == 1) {

			System.out.println("Quieres Destapar carta? (0)NO (1)SI");
			int destaparCarta = sc.nextInt();

			if (destaparCarta == 1) {

				SumaCartas += CartaAleatorio();
				System.out.println("SUMA TOTAL= " + SumaCartas + "\n");

				if (SumaCartas > 7.5) {
					System.out.println("HAS PERDIDO");
					suTurno = 0;
				}

			} else {
				if (destaparCarta == 0) {
					System.out.println("Turno del PC");
					suTurno = 0;

				}
			}
		}
		return SumaCartas;

	}

	/**
	 * Metodo para sacar una carta aleatoria de nuestro array que tiene un orden
	 * definido en el cual tambien se encuentra su valor
	 * 
	 * @return carta aleatoria
	 */

	static float CartaAleatorio() {

		return CARTAS[CARTA_ALEATORIA.nextInt(1, 11)];

	}

}

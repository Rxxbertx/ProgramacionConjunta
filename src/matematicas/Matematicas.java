package matematicas;

import java.util.Scanner;

public class Matematicas {

	/**
	 * @param sc
	 */
	private static int serMayor(int numero1, int numero2) {

		int mayor = 0;

		if (numero1 > numero2) {
			mayor = numero1;
		} else {
			mayor = numero2;
		}
		return mayor;
	}

	/**
	 * @param sc
	 */
	private static boolean serPar(int numero) {
		System.out.println("Dime un número");
		boolean par = false;
		if (numero % 2 == 0) {
			par = true;

		}
		return par;
	}

	/**
	 * @param sc
	 */
	private static boolean serPositivo(int numero) {
		System.out.println("Dime un número");
		boolean positivo = false;
		if (numero > 0) {
			positivo = true;
		}
		return positivo;
	}

}

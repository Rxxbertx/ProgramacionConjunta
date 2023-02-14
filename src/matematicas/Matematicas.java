/**
 * 
 */
package matematicas;

/**
 * @author dam1t05
 *
 */
public class Matematicas {

	/**
	 * Recibe un numero para su comprobacion de si es negativo o positivo
	 * 
	 * @param numero numero a recibir
	 * @return si es positivo devuelve verdadero
	 */

	public static boolean serPositivo(int numero) {
		if (numero >= 0)
			return true;
		else {
			return false;
		}
	}

	/**
	 * Recibe un numero que si al dividirlo entre dos su resto es 0 entonces sera
	 * par
	 * 
	 * @param numero numero a comprobar
	 * @return devuelve verdadero si es par
	 */

	public static boolean serPar(int numero) {

		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Recibe dos numeros y se decide cual es mayor entre ellos dos
	 * 
	 * @param numero  numero recibido
	 * @param numero2 numero recibido
	 * @return devuelve el numero mayor
	 */

	public static int serMayor(int numero, int numero2) {
		if (numero > numero2) {
			return numero;
		} else if (numero < numero2) {
			return numero;
		} else {
			System.out.println("son iguales");
			return 0;
		}
	}

}

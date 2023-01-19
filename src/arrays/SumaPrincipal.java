package arrays;

public class SumaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una clase que se llame SumaPrincipal , esta clase la ejecutaremos desde
		 * cmd y le pasaremos números enteros separados por blancos como parámetros (el
		 * número de enteros puede ser variable) . El programa sumará estos números y
		 * mostrará la suma por pantalla . Ten en cuenta que los números se van a
		 * almacenar en un array de String con lo cual tendrás que convertir de String a
		 * entero, como muestra el siguiente ejemplo: Integer.parseInt(cadena) O con
		 * Integer.valueOf(cadena)
		 */

		System.out.println("La suma de los números introducidos es: " + sumaModulo(args));

	}

	/**
	 * @param args
	 */
	private static int sumaModulo(String[] args) {
		int suma = 0;

		for (int i = 0; i < args.length; i++) {

			suma += Integer.parseInt(args[i]);

		}
		return suma;
	}

}

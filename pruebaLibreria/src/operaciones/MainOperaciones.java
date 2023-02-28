package operaciones;

import java.util.Scanner;

public class MainOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En el programa principal llamaremos a la función pedirEntero() dos veces para
		 * que el usuario meta el primer número y el segundo, la llamada se repetirá
		 * mientras el número sea negativo. ➢ Crea un objeto de la clase Operaciones y
		 * muestra el resultado de la suma y de la división. ➢ Ejecuta la aplicación
		 * para los valores 9 y 0 ¿qué ocurre?, fíjate en qué línea se ha producido la
		 * excepción. ➢ Pon un try..catch en el código donde se llama al método
		 * dividir() y captura la excepción producida informando
		 * "No se puede dividir entre cero". Vuelve a ejecutar y observa el resultado.
		 */
		Scanner sc = new Scanner(System.in);

		Operaciones operaciones = new Operaciones(Operaciones.getNumero1(), Operaciones.getNumero2());

		operaciones.pedirEntero1(sc);
		operaciones.pedirEntero2(sc);

		System.out.println("La suma de " + operaciones.getNumero1() + " y " + operaciones.getNumero2() + " es: "
				+ operaciones.sumar());
		boolean introducido = true;
		do {

			try {
				operaciones.dividir();
				introducido = true;

			} catch (ArithmeticException ex) {
				System.out.println("El segundo número no puede ser 0, por favor introduzca otro número");
				operaciones.pedirEntero2(sc);
				introducido = false;
			}
		} while (!introducido);

		System.out.println("La división de " + operaciones.getNumero1() + " entre " + operaciones.getNumero2() + " es: "
				+ operaciones.dividir());

	}

}

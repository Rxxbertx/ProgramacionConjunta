package excepciones;

import java.util.Scanner;

public class OperacionesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operaciones operaciones = new Operaciones();

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer número");

		operaciones.setNumero1(pedirEntero(sc));
		System.out.println("Dime el segundo número");
		operaciones.setNumero2(pedirEntero(sc));

		System.err.println("La suma es: " + operaciones.sumar(operaciones.getNumero1(), operaciones.getNumero2()));
		try {
			System.err.println("La división es: " + operaciones.dividir(operaciones.getNumero1(), operaciones.getNumero2()));

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se puede realizar la operación");
		}

		

	}

	/**
	 * @param sc
	 */
	private static int pedirEntero(Scanner sc) {
		int numero = sc.nextInt();
		while (numero < 0) {
			System.out.println("Este número es negativo, prueba otro número");
			numero = sc.nextInt();
		}
		return numero;
	}

}

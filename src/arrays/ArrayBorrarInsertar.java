package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBorrarInsertar {

	static String[] modulos = new String[2];

	public static void main(String[] args) {

		modulos[0] = "ED";
		modulos[1] = "PR";

		System.out.println(Arrays.toString(modulos));

		menu();

	}

	private static void menu() {

		Scanner sc = new Scanner(System.in);
		boolean salir = false;

		while (!salir) {

			System.out.println("BORRAR EN EL ARRAY (1)");
			System.out.println("INSERTAR EN EL ARRAY (2)");
			System.out.println("SALIR (3)");

			var resp = sc.nextInt();

			switch (resp) {
			case 1:

				borrar();
				break;

			case 2:

				insertar();
				break;

			case 3:

				salir = true;
				break;

			default:

				System.out.println("Selecciona una opcion correcta");
				break;

			}

			System.out.println("\n" + Arrays.toString(modulos) + "\n");

		}

	}

	private static void insertar() {

		String modulosTemp;
		Scanner sc = new Scanner(System.in);

		System.out.println("Que modulo deseas insertar?");
		var resp = sc.next();

		modulosTemp = Arrays.toString(modulos);

		if (modulosTemp.contains(resp)) {

			System.err.println("Error existe");

		} else {

			String[] modulosNuevos = Arrays.copyOf(modulos, modulos.length + 1);
			modulosNuevos[modulos.length] = resp.toUpperCase();

			recrearArray(modulosNuevos);

		}

	}

	/**
	 * @param modulosTemp
	 */

	private static void borrar() {

		Scanner sc = new Scanner(System.in);
		String[] moduloTemp = new String[modulos.length - 1];
		boolean pararRepeticion = false;

		System.err.println("Que modulo deseas BORRAR?");
		var resp = sc.next();

		Arrays.sort(modulos);
		int index = Arrays.binarySearch(modulos, resp.toUpperCase());

		if (index >= 0) {

			for (int i = 0; (i < modulos.length && !pararRepeticion); i++) { // 5 ---0-4 //4 0--3

				if (index == i) {

					if (index == modulos.length - 1) {
					} else {

						pararRepeticion = true;

						for (int j = i; j < modulos.length - 1; j++) {

							moduloTemp[j] = modulos[j + 1];

						}
					}

				} else {
					moduloTemp[i] = modulos[i];
				}

			}

			recrearArray(moduloTemp);
			
		} else {
			System.out.println("No existe el modulo introducido");
		}

	}

	private static void recrearArray(String[] modulosTemp) {
		modulos = new String[modulosTemp.length];

		for (int i = 0; i < modulosTemp.length; i++) {
			modulos[i] = modulosTemp[i];
		}
	}

}

package programaEmpleado;

import java.util.Arrays;
import java.util.Scanner;

public class TrabajadorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el objeto
		Trabajador[] trabajador = new Trabajador[10];

		Scanner sc = new Scanner(System.in);

		menu(trabajador, sc);

		System.out.println("Me pica el culo");

		/*
		 *
		 * o Insertar, eliminar y modificar un empleado. Para eliminar y modificar se
		 * pedirá al usuario el dni del empleado. o Mostrar el número de hombres y
		 * mujeres que hay en la empresa. o Mostrar la edad media de los empleados.
		 * Ademas calcular la edad media de hombres y mujeres que hay en la empresa. o
		 * Mostrar el nombre del empleado más joven y del más viejo.
		 */

	}

	/**
	 * @param trabajador
	 * @param sc
	 */
	private static void menu(Trabajador[] trabajador, Scanner sc) {
		int opcion;

		do {
			System.out.println("Elige una opción:");
			System.out.println("1. Insertar un trabajador");
			System.out.println("2. Eliminar un trabajador");
			System.out.println("3. Modificar un trabajador");
			System.out.println("4. SALIR");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				insertar(sc, trabajador);
				break;
			case 2:
				eliminar(trabajador, sc);
				break;
			case 3:
				// modificar();
				break;
			case 4:
				ver(trabajador);
				break;
			case 5:
				opcion = 5;
				break;

			}
		} while (opcion != 5);
	}

	private static void ver(Trabajador[] trabajador) {
		// TODO Auto-generated method stub
		for (int i = 0; i < Trabajador.idTrabajador; i++) {
			System.out.println("Dni: " + trabajador[i].getDni());
			System.out.println("Nombre: " + trabajador[i].getNombre());
		}

	}

	private static void eliminar(Trabajador[] trabajador, Scanner sc) {
		// TODO Auto-generated method stub
		String dni;
		System.out.println("Dime el dni que deseas eliminar");
		dni = sc.next();
		for (int i = 0; i < Trabajador.idTrabajador; i++) {
			if (trabajador[i].getDni().equals(dni)) {
				trabajador[i] = null;
				System.out.println(Arrays.toString(trabajador));

				for (int j = (i + 1); j < Trabajador.idTrabajador; j++) {
					if (trabajador[j] != null) {
						trabajador[i] = trabajador[j];
						i++;

					}

				}
				trabajador[Trabajador.idTrabajador] = null;
				Trabajador.idTrabajador--;
				System.out.println(Arrays.toString(trabajador));
			}
		}

	}

	private static void insertar(Scanner sc, Trabajador[] trabajador) {
		// TODO Auto-generated method stub
		System.out.println("Dime los datos del trabajador que quieres introducir en el siguiente orden:");
		System.out.println("Dni, nombre, edad, puesto y sexo");

		trabajador[Trabajador.idTrabajador] = new Trabajador(sc.next(), sc.next());
		System.out.println(Arrays.toString(trabajador));

	}

}

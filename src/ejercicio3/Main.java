package ejercicio3;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		menu();

	}

	/**
	 * Representacion visual de las opciones del programa y sus correspondientes
	 * acciones
	 */

	private static void menu() {

		boolean salir = false;

		do {
			System.out.println(
					"1. Insertar contacto\n2. Modificar contacto\n3. Eliminar contacto\n4. Buscar contacto por apellidos\n5. Mostrar todos los contactos\n6. Salir");
			System.out.print("----- Elige opción:");

			switch (sc.nextInt()) {
			case 1:

				insertar();

				break;
			case 2:

				modificar();

				break;
			case 3:

				borrar();

				break;
			case 4:

				buscar();

				break;
			case 5:

				mostrar();

				break;
			case 6:
				salir = true;
				break;

			default:
				break;
			}

		} while (!salir);

	}

	/**
	 * metodo para hacer referencia al metodo de visualizacion de Contactos
	 */

	private static void mostrar() {

		Contacto.mostrarTodos();

	}

	/**
	 * Metodo en el cual solicitamos el apellido a buscar que sera tratado por el
	 * metodo buscar de contacto
	 */

	private static void buscar() {

		System.out.println("Introduce el apellido1 a buscar");

		Contacto.buscar(sc.next());

	}

	/**
	 * Metodo para solicitar al usuario un id a buscar para la identificacion
	 * inequivoca del Contacto que sera borrado en el metodo borrar de @see
	 * {@link contacto.java}
	 */

	private static void borrar() {

		Contacto.mostrarTodos();
		System.out.println("Que contacto quieres borrar?");
		int resp = sc.nextInt();
		boolean found = false;

		for (int i = 0; i < Contacto.contactos.length & Contacto.contactos[i] != null & !found; i++) {
			if (Contacto.contactos[i].getId() == resp) {
				found = true;
				Contacto.borrar(i);
			}
		}
	}

	/**
	 * Metodo para solicitar al usuario el contacto a modificar
	 */
	private static void modificar() {

		Contacto.mostrarTodos();
		System.out.println("Que contacto quieres modificar?");

		try {
			Contacto.contactos[sc.nextInt()].modificar();
		} catch (Exception e) {
			System.out.println("Has introducido un contacto erroneo");
		}
	}

	/**
	 * Metodo en el cual se solicita en una linea todos los datos del contacto para
	 * su creacion y inserccion
	 *
	 * e.j: roberto joao tiron CalleLuisAlberdi 1234 m@m.com
	 */

	private static void insertar() {
		System.out.println("Introduce nombre apellido1 apellido2 direccion telefono email");
		sc.nextLine();
		Contacto contacto = new Contacto(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next());
		System.out.println(contacto.toString());
		Contacto.insertar(contacto);
	}

}

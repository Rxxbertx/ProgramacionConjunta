/**
 * Clase Ejecutable Ejercicio 3. Se guardan los datos de los contactos permitiendo insertar, modificar, eliminar, buscar y 
 * mostrar todos los contactos creados
 * 
 *
 * @author María
 * @version 13/02/2023
 * 
 */
package ejercicioArrayObjeto;

import java.util.Scanner;

public class ContactoPpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Objeto

		Contacto contactos[] = new Contacto[100];

		Scanner sc = new Scanner(System.in);

		System.out.println("Elige la opción que desees realizar");
		System.out.println("1. Insertar contacto.");
		System.out.println("2. Modificar contacto.");
		System.out.println("3. Eliminar contacto.");
		System.out.println("4. Buscar contacto por apellidos.");
		System.out.println("5. Mostrar todos los contactos.");
		System.out.println("6. Salir");

		int opcion = sc.nextInt();

		eligeOpcion(sc, opcion, contactos);

	}

	/**
	 * Método buscarContacto con el que se busca un contacto por el apellido1
	 * proporcionado por el usuario y se imprimirán todos los contactos con ese
	 * apellido1
	 * 
	 * @param contactos array en el que se almacenarán los contactos
	 * @param sc        permite introducir al usuario el primer apellido a buscar
	 */
	private static void buscarContacto(Contacto[] contactos, Scanner sc) {
		int cont = 0;
		System.out.println("Dime el primer apellido del contacto que quieres buscar");
		String busqueda = sc.next();
		for (int i = 0; i < contactos.length & contactos[i] != null; i++) {

			if (contactos[i].getApellido1().equals(busqueda)) {
				System.out.println(Contacto.identificador + contactos[i].getNombre() + contactos[i].getApellido1()
						+ contactos[i].getApellido2() + contactos[i].getDireccion() + contactos[i].getTelefono()
						+ contactos[i].getEmail());
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("No existe ningún contacto con el apellido " + busqueda);
		}
	}

	/**
	 * Método borrarContacto con el que se pueden eliminar contactos individualmente
	 * y se arrastran los posteriores arrays una posición anterior para que el array
	 * borrado (ahora nulo) quede en última posición
	 * 
	 * @param contactos array en el que se almacenarán los contactos
	 * @param sc        permite al usuario introductir el número de identificador a
	 *                  eliminar
	 */
	private static void borrarContacto(Contacto[] contactos, Scanner sc) {
		visualizarContactos(contactos);

		System.out.println("Escriba el número de identificador del contacto que desea eliminar");
		int numIdentificador = sc.nextInt();
		for (int i = 0; i < contactos.length & contactos[i] != null; i++) {
			if (i == numIdentificador) {
				while (contactos[i + 1] != null) {
					contactos[i] = contactos[i + 1];
					System.out.println("Hola");
					i++;
				}
				contactos[i] = contactos[i + 1];

			}

		}
		visualizarContactos(contactos);
	}

	/**
	 * Método modificarContacto con el cual se puede modificar algún contacto creado
	 * previamente
	 * 
	 * @param contactos array en el que se almacenarán los contactos
	 * @param sc        permite introducir al usuario el identificador a modificar
	 */
	private static void modificarContacto(Contacto[] contactos, Scanner sc) {
		visualizarContactos(contactos);

		System.out.println("Escriba el número de identificador del contacto que desea modificar");
		int numIdentificador = sc.nextInt();
		for (int i = 0; i < contactos.length & contactos[i] != null; i++) {
			if (i == numIdentificador) {
				System.out.println("Modifique los datos del contacto con identificador " + numIdentificador);
				contactos[i] = new Contacto(Contacto.identificador, sc.next(), sc.next(), sc.next(), sc.next(),
						sc.next(), sc.next());
				System.out.println(contactos[i].getNombre() + contactos[i].getApellido1() + contactos[i].getApellido2()
						+ contactos[i].getDireccion() + contactos[i].getTelefono() + contactos[i].getEmail());

			}

		}
	}

	/**
	 * Método para visualizar todos los contactos
	 * 
	 * @param contactos array en el que se almacenarán los contactos
	 */
	private static void visualizarContactos(Contacto[] contactos) {
		int i = 0;
		while (contactos[i] != null) {
			System.out.println(contactos[i].getNombre() + contactos[i].getApellido1() + contactos[i].getApellido2()
					+ contactos[i].getDireccion() + contactos[i].getTelefono() + contactos[i].getEmail());
			i++;
		}

	}

	/**
	 * Método crearContacto con el que se crearán nuevos contactos en la agenda
	 * 
	 * @param contactos array en el que se almacenarán los contactos
	 * @param sc        permite introducir al usuario los datos de los contactos a
	 *                  crear
	 */
	private static void crearContacto(Contacto[] contactos, Scanner sc) {

		contactos[Contacto.identificador] = new Contacto(Contacto.identificador, sc.next(), sc.next(), sc.next(),
				sc.next(), sc.next(), sc.next());

		System.out
				.println("El contacto que acabas de crear, cuyo identificador es " + Contacto.identificador + " es: ");
		System.out.println(contactos[Contacto.identificador].getNombre()
				+ contactos[Contacto.identificador].getApellido1() + contactos[Contacto.identificador].getApellido2()
				+ contactos[Contacto.identificador].getDireccion() + contactos[Contacto.identificador].getTelefono()
				+ contactos[Contacto.identificador].getEmail());

	}

	/**
	 * Método eligeOpcion con el que hay que elegir la opción que se desea hacer de
	 * todas las ofrecidas
	 * 
	 * @param sc        permite al usuario introducir la opción que se desea
	 *                  realizar del menú
	 * @param opcion    entero solicitado por pantalla para elegir qué se hará a
	 *                  continuación
	 * @param contactos array en el que se almacenarán los contactos
	 */
	private static void eligeOpcion(Scanner sc, int opcion, Contacto[] contactos) {
		while (opcion != 6 && opcion < 6) {

			switch (opcion) {
			case 1:
				crearContacto(contactos, sc);
				Contacto.identificador++;
				System.out.println("¿Qué deseas hacer a continuación?");
				opcion = sc.nextInt();
				break;
			case 2:
				modificarContacto(contactos, sc);
				System.out.println("¿Qué deseas hacer a continuación?");
				opcion = sc.nextInt();
				break;
			case 3:
				borrarContacto(contactos, sc);
				System.out.println("¿Qué deseas hacer a continuación?");
				opcion = sc.nextInt();
				break;
			case 4:
				buscarContacto(contactos, sc);
				System.out.println("¿Qué deseas hacer a continuación?");
				opcion = sc.nextInt();
				break;
			case 5:
				visualizarContactos(contactos);
				System.out.println("¿Qué deseas hacer a continuación?");
				opcion = sc.nextInt();
				break;
			case 6:

				break;

			}
		}
		System.out.println("Gracias por consultar nuestra agenda");
	}

}

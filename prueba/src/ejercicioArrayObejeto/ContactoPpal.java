package ejercicioArrayObejeto;

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

		// Método para borrar contacto

		

	}

	/**
	 * @param contactos
	 * @param sc
	 */
	private static void borrarContacto(Contacto[] contactos, Scanner sc) {
		visualizarContactos(contactos);

		System.out.println("Escriba el número de identificador del contacto que desea modificar");
		int numIdentificador = sc.nextInt();
		for (int i = 0; i < contactos.length & contactos[i] != null; i++) {
			if (i == numIdentificador) {
				while (contactos[i] != null) {
					contactos[i] = contactos[i + 1];

				}

			}

		}
	}

	/**
	 * Método modificarContacto con el cual se puede modificar algún contacto creado
	 * previamente
	 * 
	 * @param contactos
	 * @param sc
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
	 * @param contactos
	 * @param sc
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
	 * @param sc
	 * @param opcion
	 */
	private static void eligeOpcion(Scanner sc, int opcion, Contacto[] contactos) {
		while (opcion != 6) {

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

				System.out.println("¿Qué deseas hacer a continuación?");
				opcion = sc.nextInt();
				break;
			case 5:

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

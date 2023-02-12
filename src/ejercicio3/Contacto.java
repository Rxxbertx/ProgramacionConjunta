package ejercicio3;

import java.util.Scanner;

public class Contacto {

	static Contacto[] contactos = new Contacto[100];
	static Scanner sc = new Scanner(System.in);
	private static int identificador = 0;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private int telefono;
	private String email;
	private int id;

	/**
	 * Constructor sin parametros
	 */

	public Contacto() {

	}

	/**
	 * Constructor con parametros, contamos con un id para identificar de forma
	 * unequivoca al usuario
	 * 
	 * @param nombre    String sirve para identificar al usuario
	 * @param apellido1 String sirve para identificar al usuario
	 * @param apellido2 String sirve para identificar al usuario
	 * @param direccion String sirve para identificar al usuario
	 * @param telefono  int sirve para identificar al usuario
	 * @param email     String sirve para identificar al usuario
	 */

	public Contacto(String nombre, String apellido1, String apellido2, String direccion, int telefono, String email) {

		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.id = identificador;
		identificador++;

	}

	/**
	 * Insertamos un contacto en el array cuando encontramos un espacio vacio .
	 * 
	 * @param contacto Objeto Contacto
	 */

	static void insertar(Contacto contacto) {

		if (identificador < 100) {

			boolean encontrado = false;

			for (int i = 0; i < contactos.length & !encontrado; i++) {

				if (contactos[i] == null) {
					contactos[i] = contacto;
					encontrado = true;
				}
			}

		} else {
			System.out.println("No puedes añadir mas de 100 contactos ERROR 203");

		}
	}

	/**
	 * Este metodo sirve para modificar al Contacto
	 */
	void modificar() {

		System.out.println("Una vez acabes de modificar, escribe n para salir");
		boolean salir = false;

		while (!salir) {

			System.out.println(toString());

			switch (sc.next().toLowerCase()) {
			case "nombre":
				System.out.println("Introduce el nuevo nombre");
				nombre = sc.next();
				break;

			case "apellido1":
				System.out.println("Introduce el nuevo apellido");
				apellido1 = sc.next();
				break;
			case "apellido2":
				System.out.println("Introduce el nuevo apellido");
				apellido2 = sc.next();
				break;
			case "direccion":
				System.out.println("Introduce la nueva direccion");
				direccion = sc.next();
				break;
			case "email":
				System.out.println("Introduce el nuevo email");
				email = sc.next();
				break;
			case "telefono":
				System.out.println("Introduce el nuevo telefono");
				telefono = sc.nextInt();
				break;

			case "n":

				System.out.println("Salio del modo edicion\n");
				salir = true;
				break;

			default:
				System.out.println("Introduce el nombre de lo que desees modificar");
				break;
			}

		}

	}

	/**
	 * Este metodo sirve para borrar al contacto, recibimos un entero el cual es la
	 * posicion del contacto a borrar dentro del array, una vez que hayamos borrado
	 * el contacto lo que haremos sera almacenar todos los objetos una posicion
	 * antes al encontrar el valor null, despues ponemos a null el ultimo valor, ya
	 * que sino tendremos siempre un valor repetido
	 * 
	 * @param k entero posicion a borrar
	 */

	static void borrar(int k) {

		contactos[k] = null;

		int j = 0;

		for (int i = 0; i < contactos.length; i++) {

			if (contactos[i] == null) {
				continue;
			} else {
				contactos[j++] = contactos[i];
			}

		}
		contactos[j] = null;

	}

	/**
	 * Buscamos dentro del array los contactos por su Apellido1
	 * 
	 * @param apellido Cadena del apellido a buscar
	 */

	static void buscar(String apellido) {

		int fnd = 0;

		for (int i = 0; i < contactos.length & contactos[i] != null; i++) {

			if (apellido.equalsIgnoreCase(contactos[i].apellido1)) {
				fnd = 1;
				System.out.println(contactos[i].toString());

			}

		}
		if (fnd == 0) {
			System.out.println("No se ha encontrado ninguna correspondecia");
		}

	}

	/**
	 * Metodo para la representacion visual del objeto
	 */

	@Override
	public String toString() {
		return "----------------------------\n" + "NOMBRE: " + nombre + "\nAPELLIDO 1: " + apellido1 + "\nAPELLIDO 2: "
				+ apellido2 + "\nEMAIL: " + email + "\nTELEFONO: " + telefono + "\nDIRECCION: " + direccion + "\nID: "
				+ id + "\n----------------------------\n";

	}

	/**
	 * Metodo para la representacion visual de los objetos
	 */

	public static void mostrarTodos() {
		for (int i = 0; i < contactos.length & contactos[i] != null; i++) {
			System.out.println(contactos[i].toString());
		}
	}

	/**
	 * Devuelve el id del Contacto
	 * 
	 * @return entero Id
	 */

	public int getId() {
		return id;
	}

}

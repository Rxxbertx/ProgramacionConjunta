package ejercicio3CONjoption;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacto {

	static List<Contacto> agenda = new ArrayList<Contacto>();
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

	}

	/**
	 * Insertamos un contacto en el array cuando encontramos un espacio vacio .
	 * 
	 * @param contacto Objeto Contacto
	 */

	static void insertar(Contacto contacto) {

		agenda.add(contacto);
		identificador++;
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

		agenda.remove(k);
		

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

	public static String mostrarTodos() {

		String nombre = "";

		for (int i = 0; i < agenda.size(); i++) {
			nombre += (agenda.get(i).toString());
		}
		
		if (identificador==0) {
			return "NO HAY CONTACTOS";
		}

		return nombre;
	}

	/**
	 * Devuelve el id del Contacto
	 * 
	 * @return entero Id
	 */

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

}

package ejercicio3CONjoption;

import java.util.Scanner;

import javax.swing.JOptionPane;

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

		JOptionPane.showMessageDialog(null, "BIENVENID@ AL PROGRAMA");
		String valores[] = { "Insertar contacto", "Eliminar contacto", "Mostrar todos los contactos", "Salir" };

		boolean salir = false;

		do {

			String resp = (String) JOptionPane.showInputDialog(null, "ELIGE", "CONTACTO V1.312",
					JOptionPane.QUESTION_MESSAGE, null, valores, valores[3]);
			if (resp == null) {
				resp = "";
				salir = true;
			}

			switch (resp) {
			case "Insertar contacto":

				insertar();

				break;
			case "Eliminar contacto":

				borrar();

				break;
			case "Mostrar todos los contactos":

				mostrar();

				break;
			case "Salir":

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

		JOptionPane.showMessageDialog(null, Contacto.mostrarTodos(), "AGENDA", JOptionPane.INFORMATION_MESSAGE);

	}

	/**
	 * Metodo para solicitar al usuario un id a buscar para la identificacion
	 * inequivoca del Contacto que sera borrado en el metodo borrar de @see
	 * {@link contacto.java}
	 */

	private static void borrar() {

		JOptionPane.showMessageDialog(null, Contacto.mostrarTodos(), "AGENDA", JOptionPane.INFORMATION_MESSAGE);

		String resp = JOptionPane.showInputDialog(null, "CONTACTO A BORRAR", "AGENDA", JOptionPane.QUESTION_MESSAGE);

		int resp1 = Integer.parseInt(resp);
		boolean found = false;

		for (int i = 0; i < Contacto.agenda.size(); i++) {
			if (resp1== Contacto.agenda.get(i).getId()) {
				found = true;
				Contacto.borrar(i);
			}
		}
		
		if (!found) {
			JOptionPane.showMessageDialog(null, "ERROR", "AGENDA", JOptionPane.INFORMATION_MESSAGE);

		}
	}

	/**
	 * Metodo en el cual se solicita en una linea todos los datos del contacto para
	 * su creacion y inserccion
	 *
	 * e.j: roberto joao tiron CalleLuisAlberdi 1234 m@m.com
	 */

	private static void insertar() {

		try {
			Contacto contacto = new Contacto(
					JOptionPane.showInputDialog(null, "Introduce nombre", "Contactos V1.35",
							JOptionPane.QUESTION_MESSAGE),
					JOptionPane.showInputDialog(null, "Introduce apellido", "Contactos V1.35",
							JOptionPane.QUESTION_MESSAGE),
					JOptionPane.showInputDialog(null, "Introduce apellido2", "Contactos V1.35",
							JOptionPane.QUESTION_MESSAGE),
					JOptionPane.showInputDialog(null, "Introduce direccion", "Contactos V1.35",
							JOptionPane.QUESTION_MESSAGE),
					Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce telefono", "Contactos V1.35",
							JOptionPane.QUESTION_MESSAGE)),
					JOptionPane.showInputDialog(null, "Introduce email", "Contactos V1.35",
							JOptionPane.QUESTION_MESSAGE));

			if (contacto.getApellido1().equals("") || contacto.getTelefono() <= 0 || contacto.getApellido2().equals("")
					|| contacto.getDireccion().equals("") || contacto.getEmail().equals("")
					|| contacto.getNombre().equals("")) {

				throw new NullPointerException();

			}

			System.out.println(contacto.toString());
			Contacto.insertar(contacto);

		} catch (NullPointerException E) {
			JOptionPane.showMessageDialog(null, "ERORR", "ERROR", JOptionPane.WARNING_MESSAGE);
		}

	}

}

/*
 * @version 08/03/2023
 * @author María Choza
 */

package cuadrosDialogo;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainContactoList {
	Scanner sc = new Scanner(System.in);
	static List<Contacto> agenda = new ArrayList<Contacto>();
	static String opciones[] = { "ALTA", "BAJA", "CONSULTAR", "SALIR" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Contacto[] persona = new Contacto[100];

		menu();

	}

	/*
	 * Método baja para eliminar los contactos de la agenda
	 * 
	 */

	private static void baja() {
		// TODO Auto-generated method stub
		int j = 0;

		String respuesta = JOptionPane.showInputDialog("Introduce el nombre del contacto que deseas eliminar");
		String[] opciones = { "Si", "No", "Cancelar" };

		for (int i = 0; i < agenda.size(); i++) {
			if (respuesta.equalsIgnoreCase(agenda.get(i).nombre)) {
				JOptionPane.showOptionDialog(null, "Eliminar contacto", "Quieres eliminar a " + agenda.get(i).nombre, i,
						i, null, opciones, opciones);
				for (int l = 0; l < opciones.length; l++) {
					if (opciones[l].equalsIgnoreCase("si")) {
						JOptionPane.showMessageDialog(null, "Contacto eliminado");
						agenda.remove(i);
					}
				}

			} else {

			}

		}
	}

	private static void alta() {

		agenda.add(pedirDatosContacto());

		try {
			JOptionPane.showMessageDialog(null, "El contacto ha sido dado de alta", "Alta de Contacto",
					JOptionPane.INFORMATION_MESSAGE, null);
		} catch (HeadlessException error) {
			System.out.println("Se ha producido un error de compatibilidad");
		}

	}

	/**
	 * Método menú donde se escogerá lo que se quiera hacer dentro de unas opciones
	 * predefinidas
	 */
	private static int menu() {
		String opc;
		int opcion;

		do {
			opc = (String) JOptionPane.showInputDialog(null, "AGENDA", "Elige una opcion", JOptionPane.QUESTION_MESSAGE,
					null, opciones, opciones[0]);
			if (opc == null) {
				JOptionPane.showMessageDialog(null, "Escoge la opción SALIR para abandonar el programa", "ERROR",
						JOptionPane.WARNING_MESSAGE, null);
				opc = "";

			}
			if (opc == "ALTA") {
				opcion = 1;
			} else if (opc == "BAJA") {
				opcion = 2;
			} else if (opc == "CONSULTA") {
				opcion = 3;
			} else {
				opcion = 4;
			}
			switch (opcion) {
			case 1:
				alta();
				break;
			case 2:
				baja();
				break;
			case 3:
				if (agenda.size() == 0) {
					JOptionPane.showMessageDialog(null, "No existe ningún contacto en la lista", " Consultar Agenda",
							JOptionPane.ERROR_MESSAGE, null);
				} else {
					JOptionPane.showMessageDialog(null, mostrarTodos(), "Consultar Agenda",
							JOptionPane.INFORMATION_MESSAGE, null);
				}
				break;
			case 4:
				break;
			}

		} while (opcion != 4);

		return opcion;
	}

	public static String mostrarTodos() {
		String lista = "";
		for (int i = 0; i < agenda.size(); i++) {
			try {
				lista += agenda.get(i).mostrarContacto();
			} catch (Exception e) {
				e.getMessage();
			}
		}
		return lista;
	}

	public static Contacto pedirDatosContacto() {
		Contacto contacto = new Contacto();
		try {
			contacto.nombre = JOptionPane.showInputDialog("Introduce el nombre del contacto");
		} catch (NullPointerException error) {
			System.out.println("La respuesta es null");
		}
		try {
			contacto.telefono = JOptionPane.showInputDialog("Introduce el numero de teléfono del contacto");
		} catch (NullPointerException error) {
			System.out.println("El telefono es null");
		}

		return contacto;
	}

}
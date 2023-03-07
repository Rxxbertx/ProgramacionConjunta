/*
 * @version 01/03/2023
 * @author María Choza
 */

package cuadrosDialogo;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MainContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contacto[] persona = new Contacto[100];
		do {
			menu(persona);

		} while (menu(persona) != 4);

	}

	/*
	 * Método consulta para consultar los contactos que haya en la agenda
	 * 
	 */

	private static void consulta(Contacto[] persona) {
		// TODO Auto-generated method stub

		if (Contacto.numContactos != 0) {

			String cadena = "";

			for (int i = 0; i < Contacto.numContactos; i++) {
				cadena += persona[i].getNombre() + " " + persona[i].getTelefono() + "\n";
			}
			JOptionPane.showMessageDialog(null, cadena, "Consultar Agenda", JOptionPane.INFORMATION_MESSAGE);

		} else {

			JOptionPane.showMessageDialog(null, "No existe ningún contacto en la lista", "Consultar Agenda",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	/*
	 * Método baja para eliminar los contactos de la agenda
	 * 
	 */

	private static void baja(Contacto[] persona) {
		// TODO Auto-generated method stub

		String nombre = JOptionPane.showInputDialog(null, "Nombre del contacto:", "Borrar contacto",
				JOptionPane.QUESTION_MESSAGE);
		String[] valores = { "Sí", "No", "Cancelar" };
		int opcion = JOptionPane.showOptionDialog(null, "¿Quieres eliminar de la agenda a " + nombre + "?",
				"Eliminar contacto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, valores,
				valores[0]);
		if (opcion == 0) {

			for (int i = 0; i < Contacto.numContactos; i++) {

				if (persona[i].getNombre().equalsIgnoreCase(nombre) && persona[i] != null) {
					persona[i] = null;

					for (int j = (i + 1); j < persona.length; j++) {
						if (persona[j] != null) {
							persona[i] = persona[j];
							i++;
						}
					}
					persona[i] = null;
				}
			}
			Contacto.numContactos--;
		}
	}

	private static void alta(Contacto[] persona) {
		// TODO Auto-generated method stub

		String nombre = JOptionPane.showInputDialog(null, "Nombre del contacto", "Entrada",
				JOptionPane.QUESTION_MESSAGE);
		String telefono = JOptionPane.showInputDialog(null, "Teléfono del contacto", "Entrada",
				JOptionPane.QUESTION_MESSAGE);

		persona[Contacto.numContactos] = new Contacto(nombre, telefono);

		JOptionPane.showMessageDialog(null, "El contacto " + nombre + " se ha dado de alta", "Alta contacto",
				JOptionPane.INFORMATION_MESSAGE);

	}

	/**
	 * Método menú donde se escogerá lo que se quiera hacer dentro de unas opciones predefinidas
	 */
	private static int menu(Contacto[] persona) {
		int opcion;
		String[] agenda = { "ALTA", "BAJA", "CONSULTA", "SALIR" };

		String opc = (String) JOptionPane.showInputDialog(null, // parentComponent
				"Elige una opción:", // Texto del mensaje
				"AGENDA", // Título
				JOptionPane.QUESTION_MESSAGE, // Icono
				null, // Parámetro no utilizado
				agenda, // Vector de valores
				agenda[0]); // Valor a mostrar por defecto
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
			alta(persona);
			break;
		case 2:
			baja(persona);
			break;
		case 3:
			consulta(persona);
			break;
		case 4:
			break;
		}
		return opcion;
	}

}

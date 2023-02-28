package cuadrosDialogo;

import javax.swing.JOptionPane;

public class MainContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contacto[] persona = new Contacto[10];
		do {
			menu(persona);

		} while (agenda() != 4);

	}

	private static void consulta(Contacto[] persona) {
		// TODO Auto-generated method stub

		for (int i = 0; i < persona.length; i++) {
			try {
				System.out.println("Nombre: " + persona[i].getNombre() + " Telefono: " + persona[i].getTelefono());

			} catch (NullPointerException e) {
				i = persona.length;
			}

		}

	}

	private static void baja() {
		// TODO Auto-generated method stub

	}

	private static void alta(Contacto[] persona) {
		// TODO Auto-generated method stub

		String nombre = JOptionPane.showInputDialog(null, "Nombre del contacto", "Entrada",
				JOptionPane.QUESTION_MESSAGE);
		String telefono = JOptionPane.showInputDialog(null, "Teléfono del contacto", "Emtrada",
				JOptionPane.QUESTION_MESSAGE);
		persona[Contacto.numContactos] = new Contacto(nombre, telefono);
	}

	private static void menu(Contacto[] persona) {
		// TODO Auto-generated method stub

		switch (agenda()) {
		case 1:
			alta(persona);
			break;
		case 2:
			baja();
			break;
		case 3:
			consulta(persona);
			break;
		case 4:
			break;
		}
	}

	/**
	 * 
	 */
	private static int agenda() {
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
		return opcion;
	}

}

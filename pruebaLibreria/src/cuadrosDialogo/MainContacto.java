package cuadrosDialogo;

import java.util.Arrays;

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

		try {
			String cadena ="";

				for (int i = 0; i < Contacto.numContactos; i++) {
					 cadena  += persona[i].getNombre() + " " + persona[i].getTelefono() + "\n";
				}
				JOptionPane.showMessageDialog(null, 
						cadena, 
						"Consultar Agenda",
						JOptionPane.INFORMATION_MESSAGE);
			

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "No existe ningún contacto en la lista", "Consultar Agenda",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private static void baja(Contacto[] persona) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog(null, "Nombre del contacto:", "Borrar contacto",
				JOptionPane.QUESTION_MESSAGE);
		String[] valores = { "Sí", "No", "Cancelar" };
		int opcion = JOptionPane.showOptionDialog(null, "¿Quieres eliminar de la agenda a " + nombre + "?",
				"Eliminar contacto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, valores,
				valores[0]);
		if (opcion == 0) {
			int cont=0;

			for (int i = 0; i < Contacto.numContactos; i++) {
				System.out.println(persona[i].getNombre());
				System.out.println(nombre);
				if (persona[i].getNombre().equalsIgnoreCase(nombre)) {
					for(int j=i;j<Contacto.numContactos;j++) {
						persona[j].setNombre(persona[j+1].getNombre());
						persona[j].setTelefono(persona[j+1].getTelefono());
						
					}
					Contacto.numContactos--;
					cont++;
					
				}
				
			}if(cont==0) {
				System.out.println("El contacto " + nombre + " no existe en la agenda");
			}else {
				System.out.println("El contacto ya se ha borrado de la agenda");
			}
			persona[Contacto.numContactos+1].setNombre(null);
			persona[Contacto.numContactos+1].setTelefono(null);
		}

	}

	private static void alta(Contacto[] persona) {
		// TODO Auto-generated method stub

		String nombre = JOptionPane.showInputDialog(null, "Nombre del contacto", "Entrada",
				JOptionPane.QUESTION_MESSAGE);
		String telefono = JOptionPane.showInputDialog(null, "Teléfono del contacto", "Entrada",
				JOptionPane.QUESTION_MESSAGE);
		System.out.println(Contacto.numContactos);

		persona[Contacto.numContactos] = new Contacto(nombre, telefono);
		System.out.println(Arrays.toString(persona));

		System.out.println(Contacto.numContactos);
		JOptionPane.showMessageDialog(null, "El contacto " + nombre + " se ha dado de alta", "Alta contacto",
				JOptionPane.INFORMATION_MESSAGE);

	}

	private static void menu(Contacto[] persona) {
		// TODO Auto-generated method stub

		switch (agenda()) {
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

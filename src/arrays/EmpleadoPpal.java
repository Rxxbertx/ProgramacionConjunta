package arrays;

import java.util.Scanner;

public class EmpleadoPpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleados[] = new Empleado[5];

		int numEmpleado = 4;

		Scanner sc = new Scanner(System.in);

		empleados[0] = new Empleado("71542687E", "Maria", 30, "programador", "mujer");

		empleados[1] = new Empleado("202020u", "Sara", 20, "analista", "mujer");

		empleados[2] = new Empleado("71542687E", "Maria", 90, "programador", "hombre");

		empleados[3] = new Empleado("123", "Lorena", 15, "analista", "mujer");

		System.out.println(empleados[0].getNombre());

		System.out.println(empleados[0].getEdad());

		// Método para crear empleado

		numEmpleado = (crearEmpleado(empleados, sc, numEmpleado));

		// Método para modificar empleado

		modificarEmpleado(empleados, sc, numEmpleado);

		// Método para eliminar empleado

		numEmpleado = eliminarEmpleado(empleados, sc, numEmpleado);

		// Método para saber cuantas mujeres y hombres hay

		cuentaPorSexo(empleados, numEmpleado);

		// Método para calcular la edad media de los empleados

		edadMedia(empleados, numEmpleado);

		// Método para calcular la edad media de los empleados según el sexo

		edadMediaHombresMujeres(empleados, numEmpleado);

		// Empleado más jóven y más viejo

		masJovenViejo(empleados, numEmpleado);

		sc.close();

	}

	/**
	 * @param empleados
	 * @param numEmpleado
	 */
	private static void masJovenViejo(Empleado[] empleados, int numEmpleado) {
		int edadJoven = 100;
		String nombreJoven = "";
		int edadMayor = 0;
		String nombreMayor = "";

		for (int p = 0; p < numEmpleado; p++) {

			if (empleados[p].getEdad() < edadJoven && empleados[p].getEdad() != 0) {
				edadJoven = empleados[p].getEdad();
				nombreJoven = empleados[p].getNombre();
			} else if (empleados[p].getEdad() > edadMayor) {
				edadMayor = empleados[p].getEdad();
				nombreMayor = empleados[p].getNombre();
			}

		}
		System.err.println("El nombre de la persona más jóven es: " + nombreJoven
				+ " y el nombre de la persona más mayor es: " + nombreMayor);
	}

	/**
	 * @param empleados
	 * @param numEmpleado
	 */
	private static void edadMediaHombresMujeres(Empleado[] empleados, int numEmpleado) {
		int sumaMujer = 0;
		int contdMujer = 0;
		int contHombre = 0;
		int sumaHombre = 0;

		for (int o = 0; o < numEmpleado; o++) {

			try {
				if (empleados[o].getSexo().equalsIgnoreCase("mujer")) {
					sumaMujer += empleados[o].getEdad();
					contdMujer++;
				} else {
					sumaHombre += empleados[o].getEdad();
					contHombre++;
				}
			} catch (Exception e) {

			}

		}

		System.out.println("La edad media de las mujeres es " + sumaMujer / contdMujer + " años.");
		System.out.println("La edad media de los hombres es " + sumaHombre / contHombre + " años");
	}

	/**
	 * @param empleados
	 * @param numEmpleado
	 */
	private static void edadMedia(Empleado[] empleados, int numEmpleado) {
		int suma = 0;

		for (int n = 0; n < numEmpleado; n++) {
			suma += empleados[n].getEdad();
		}

		System.out.println("La edad media de los empleados es: " + suma / numEmpleado + " años");
	}

	/**
	 * @param empleados
	 * @param numEmpleado
	 */
	private static void cuentaPorSexo(Empleado[] empleados, int numEmpleado) {
		int contMujer = 0;
		int contHombre = 0;
		for (int m = 0; m < numEmpleado; m++) {

			try {
				if (empleados[m].getSexo().equalsIgnoreCase("mujer")) {
					contMujer++;

				} else if (empleados[m].getSexo().equalsIgnoreCase("hombre")) {
					contHombre++;
				}
			} catch (Exception e) {

			}

		}
		System.out.println("Hay " + contMujer + " mujeres y " + contHombre + " hombres");
	}

	/**
	 * @param empleados
	 * @param sc
	 * @return 
	 */
	private static int eliminarEmpleado(Empleado[] empleados, Scanner sc, int numEmpleado) {
		System.out.print("Dime el número de DNI del empleado que quieres eliminar: ");
		String dni = sc.next();

		for (int i = 0; i < numEmpleado; i++) {

			if (dni.equalsIgnoreCase(empleados[i].getDni())) {

				System.out.println("El empleado con dni " + empleados[i].getDni() + " ha sido borrado");
				empleados[i].setDni(null);
				empleados[i].setEdad(0);
				empleados[i].setNombre(null);
				empleados[i].setPuesto(null);
				empleados[i].setSexo(null);

				numEmpleado--;

			} else if (i == numEmpleado - 1) {
				System.out.println("El dni introducido no pertenece a ningún empleado por lo que no podrá borrarse");
			}

		}
		System.out.println("Ha salido de la eliminación de empleado");
		return numEmpleado;
	}

	/**
	 * @param empleados
	 * @param sc
	 */
	private static void modificarEmpleado(Empleado[] empleados, Scanner sc, int numEmpleado) {
		System.out.print("Dime el número de DNI del empleado que quieres modificar: ");
		String dni = sc.next();
		for (int k = 0; k < numEmpleado; k++) {
			int modificar = 1;
			if (dni.equalsIgnoreCase(empleados[k].getDni())) {

				while (modificar != 0) {
					System.out.println("¿Qué quieres modificar?");
					System.out.println("1.DNI 2.Nombre 3.Edad 4.Puesto 5.Sexo 0.SALIR");
					modificar = sc.nextInt();

					for (int l = 0; l < 5; l++) {

						switch (modificar) {
						case 1:
							System.out.print("Dime el nuevo dni: ");
							empleados[k].setDni(sc.next());
							System.out.println("¿Qué quieres modificar?");
							System.out.println("1.DNI 2.Nombre 3.Edad 4.Puesto 5.Sexo 0.SALIR");
							modificar = sc.nextInt();
							break;
						case 2:
							System.out.println("Dime el nuevo nombre: ");
							empleados[k].setNombre(sc.next());
							System.out.println("¿Qué quieres modificar?");
							System.out.println("1.DNI 2.Nombre 3.Edad 4.Puesto 5.Sexo 0.SALIR");
							modificar = sc.nextInt();
							break;
						case 3:
							System.out.println("Dime la nueva edad: ");
							empleados[k].setEdad(sc.nextInt());
							System.out.println("¿Qué quieres modificar?");
							System.out.println("1.DNI 2.Nombre 3.Edad 4.Puesto 5.Sexo 0.SALIR");
							modificar = sc.nextInt();
							break;
						case 4:
							System.out.println("Dime el nuevo oficio: ");
							empleados[k].setPuesto(sc.next());
							System.out.println("¿Qué quieres modificar?");
							System.out.println("1.DNI 2.Nombre 3.Edad 4.Puesto 5.Sexo 0.SALIR");
							modificar = sc.nextInt();
							break;
						case 5:
							System.out.println("Dime el nuevo sexo: ");
							empleados[k].setSexo(sc.next());
							System.out.println("¿Qué quieres modificar?");
							System.out.println("1.DNI 2.Nombre 3.Edad 4.Puesto 5.Sexo 0.SALIR");
							modificar = sc.nextInt();
							break;
						case 0:

							k = empleados.length;
							break;

						}

					}
					System.out.println("Ha salido de la modificación del empleado");

				}

			} else if (k == (numEmpleado - 1)) {
				System.out.println("El dni introducido no existe en la base de datos de empleados");
			}
		}
	}

	/**
	 * @param empleados
	 * @param sc
	 */
	private static int crearEmpleado(Empleado[] empleados, Scanner sc, int numEmpleado) {
		int nuevoEmpleado = 0;
		do {
			System.out.println("Selecciona a continuación la opción que desees realizar");
			System.out.println("1. CREAR nuevo empleado 2. SALIR");

			nuevoEmpleado = sc.nextInt();

			switch (nuevoEmpleado) {
			case 1:
				int i = 0;
				System.out.println("Dime (en este orden) el dni, nombre, edad, puesto y sexo del empleado.");

				empleados[i] = new Empleado(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next());
				System.out.println("El empleado que acabas de crear es: " + empleados[i].getDni() + ", "
						+ empleados[i].getNombre() + ", " + empleados[i].getEdad() + ", " + empleados[i].getPuesto()
						+ ", " + empleados[i].getSexo());

				i++;
				numEmpleado++;
				break;
			case 2:
				nuevoEmpleado = 2;
				break;
			}
		} while (nuevoEmpleado != 2);

		return numEmpleado;
	}

}

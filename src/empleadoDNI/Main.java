package empleadoDNI;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Empleado empleado = new Empleado("nombre", "dni", "puesto", "M", 32);
		Empleado.insertar(empleado);
		Empleado empleado1 = new Empleado("nombre1", "dni1", "puesto1", "M", 42);
		Empleado.insertar(empleado1);
		Empleado empleado2 = new Empleado("nombre2", "dni2", "puesto2", "M", 62);
		Empleado.insertar(empleado2);
		Empleado empleado3 = new Empleado("nombre3", "dni3", "puesto3", "f", 72);
		Empleado.insertar(empleado3);
		Empleado empleado4 = new Empleado("nombre4", "dni4", "puesto4", "f", 32);
		Empleado.insertar(empleado4);
		Empleado empleado5 = new Empleado("nombre5", "dni5", "puesto5", "f", 82);
		Empleado.insertar(empleado5);
		Empleado empleado6 = new Empleado("nombre6", "dni6", "puesto6", "M", 31);
		Empleado.insertar(empleado6);
		Empleado empleado7 = new Empleado("nombre7", "dni7", "puesto7", "M", 35);
		Empleado.insertar(empleado7);
		Empleado empleado8 = new Empleado("nombre8", "dni8", "puesto8", "f", 39);
		Empleado.insertar(empleado8);
		Empleado empleado9 = new Empleado("nombre9", "dni9", "puesto9", "f", 37);
		Empleado.insertar(empleado9);
		Empleado empleado10 = new Empleado("nombre10", "dni10", "puesto10", "M", 30);
		Empleado.insertar(empleado10);

		ejecucion();

	}

	private static void ejecucion() {

		boolean ejecucion = true;

		while (ejecucion) {
			System.out.println("Que deseas hacer?");

			System.out.println(
					"1 crear empleado \n2 modificar empleado \n3 eliminar empleado\n4 hombre y mujeres en la empresa \n5 edad media \n6 empleado mas joven \n7 ver empleados");

			switch (sc.nextInt()) {

			case 1:

				crearEmpleado();

				break;
			case 2:

				modificarEmpleado();

				break;
			case 3:

				eliminarEmpleado();

				break;
			case 4:

				sexoEmpleados();

				break;
			case 5:

				edadEmpleados();

				break;
			case 6:

				jovenEmpleado();

				break;
			case 7:

				visualizarEmpleados();

				break;

			default:

				ejecucion = false;

				break;
			}
		}
	}

	private static void visualizarEmpleados() {
		
		for (int i = 0; i < Empleado.empleado.length; i++) {
			System.out.println(Empleado.empleado[i].toString());
		}
	}

	private static void jovenEmpleado() {

		int edadMinima = Empleado.empleado[0].getEdad();
		int edadMaxima = Empleado.empleado[0].getEdad();
		String nombreJoven = Empleado.empleado[0].getNombre();
		String nombreMayor = Empleado.empleado[0].getNombre();
		String dniJoven = Empleado.empleado[0].getDni();
		String dniMayor = Empleado.empleado[0].getDni();

		for (int i = 0; i < Empleado.empleado.length; i++) {

			if (Empleado.empleado[i].getEdad() < edadMinima) {
				edadMinima = Empleado.empleado[i].getEdad();
				nombreJoven = Empleado.empleado[i].getNombre();
				dniJoven = Empleado.empleado[i].getDni();

			} else if (Empleado.empleado[i].getEdad() > edadMaxima) {

				edadMaxima = Empleado.empleado[i].getEdad();
				nombreMayor = Empleado.empleado[i].getNombre();
				dniMayor = Empleado.empleado[i].getDni();

			}

		}

		System.out.println("El empleado mas joven es: " + nombreJoven + " con DNI: " + dniJoven + " y edad: "
				+ edadMinima + " " + "\nEl empleado mas mayor es: " + nombreMayor + " con DNI: " + dniMayor
				+ " y edad: " + edadMaxima);

	}

	private static void edadEmpleados() {

		int edadMediaMujeres = 0;
		int edadMediaHombres = 0;
		int mujeres = 0;
		int hombres = 0;

		for (int i = 0; i < Empleado.empleado.length; i++) {
			if (Empleado.empleado[i].getSexo().equalsIgnoreCase("f")) {

				edadMediaMujeres += Empleado.empleado[i].getEdad();
				mujeres++;

			} else if (Empleado.empleado[i].getSexo().equalsIgnoreCase("m")) {

				edadMediaHombres += Empleado.empleado[i].getEdad();
				hombres++;

			}

		}

		System.out.println("La edad media es: " + (edadMediaMujeres + edadMediaHombres) / (mujeres + hombres) + " "
				+ "La edad media en Mujeres es: " + (edadMediaMujeres / mujeres) + " " + "La edad media en Hombres es: "
				+ (edadMediaHombres / hombres));

	}

	private static void sexoEmpleados() {

		int femenino = 0;
		int masculino = 0;
		for (int i = 0; i < Empleado.empleado.length; i++) {
			String sexo = Empleado.empleado[i].getSexo();
			if (sexo.equalsIgnoreCase("f")) {

				femenino++;

			} else {

				masculino++;
			}
			;
		}

		System.err.println("Mujeres: " + femenino + " Hombres: " + masculino);

	}

	private static void eliminarEmpleado() {

		System.err.println("Introduce el DNI del usuario a eliminar");
		var dni = sc.next();

		int i = Empleado.existe(dni);

		if (i != -1) {

			Empleado.eliminar(i);

		} else {
			System.err.println("no existe ese empleado");
		}

	}

	private static void modificarEmpleado() {

		System.err.println("Introduce el DNI del usuario a modificar");
		var dni = sc.next();

		int i = Empleado.existe(dni);

		if (i != -1) {

			System.out.println("¿que valor quieres modificar?");

			switch (sc.next().toLowerCase()) {
			case "nombre":

				System.out.println("introduce el nuevo nombre");
				Empleado.empleado[i].setNombre(sc.next());

				break;
			case "puesto":
				sc.nextLine();
				System.out.println("introduce el nuevo puesto");
				Empleado.empleado[i].setPuesto(sc.nextLine());

				break;
			case "dni":

				System.out.println("introduce el nuevo dni");
				Empleado.empleado[i].setDni(sc.next());

				break;
			case "sexo":

				System.out.println("introduce el nuevo sexo");
				Empleado.empleado[i].setSexo(sc.next());

				break;

			case "edad":

				System.out.println("introduce la nueva edad");
				Empleado.empleado[i].setEdad(sc.nextInt());

				break;

			default:
				break;
			}

		} else {

			System.err.println("No existe ese empleado");

		}

	}

	private static void crearEmpleado() {

		System.out.println("Introduce el nombre del empleado");

		var nombre = sc.next();

		System.out.println("Introduce el dni del empleado");

		var dni = sc.next();

		System.out.println("Introduce el puesto del empleado");

		sc.nextLine();
		var puesto = sc.nextLine();

		System.out.println("Introduce el sexo del empleado (M/F)");

		var sexo = sc.next();

		System.out.println("Introduce la edad del empleado");

		var edad = sc.nextInt() ;

		Empleado empleado = new Empleado(nombre, dni, puesto, sexo, edad);
		Empleado.insertar(empleado);

	}

}

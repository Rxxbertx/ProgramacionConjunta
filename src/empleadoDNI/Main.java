package empleadoDNI;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		
		ejecucion();
		
		

	}

	private static void ejecucion() {
		
		boolean ejecucion=true;
		
		while (ejecucion) {
			System.out.println("Que deseas hacer?");

			System.out.println(
					"1 crear empleado / 2 modificar empleado / 3 eliminar empleado\n4 hombre y mujeres en la empresa /5 edad media /6 empleado mas joven ");

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

			default:
				
				ejecucion=false;
				
				break;
			}
		}
	}

	private static void jovenEmpleado() {
		
		int edadMinima=Empleado.empleado[0].getEdad();
		int edadMaxima=Empleado.empleado[0].getEdad();
		String nombreJoven=Empleado.empleado[0].getNombre();
		String nombreMayor=Empleado.empleado[0].getNombre();
		String dniJoven=Empleado.empleado[0].getDni();
		String dniMayor=Empleado.empleado[0].getDni();

		for (int i = 0; i < Empleado.empleado.length; i++) {
			
			if (Empleado.empleado[i].getEdad()<edadMinima) {
				edadMinima=Empleado.empleado[i].getEdad();
				nombreJoven=Empleado.empleado[i].getNombre();
				dniJoven=Empleado.empleado[i].getDni();
				
			}else if(Empleado.empleado[i].getEdad()>edadMaxima){
				
				edadMaxima=Empleado.empleado[i].getEdad();
				nombreMayor=Empleado.empleado[i].getNombre();
				dniMayor=Empleado.empleado[i].getDni();
				
			}
	
			}
		
		System.out.println("El empleado mas joven es: "+nombreJoven+ " con DNI: "+dniJoven+" y edad: "+edadMinima+" "
				+ "\nEl empleado mas mayor es: "+nombreMayor+" con DNI: "+dniMayor+" y edad: "+edadMaxima);
		
		
		
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

		System.out.println("La edad media es: " + (edadMediaMujeres+edadMediaHombres) / (mujeres + hombres) + " "
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

		System.out.println("Mujeres: " + femenino + " Hombres: " + masculino);

	}

	private static void eliminarEmpleado() {

		System.out.println("Introduce el DNI del usuario a eliminar");
		var dni = sc.next();

		int i = Empleado.existe(dni);

		if (i != -1) {

			Empleado.eliminar(i);

		} else {
			System.out.println("no existe ese empleado");
		}

	}

	private static void modificarEmpleado() {

		System.out.println("Introduce el DNI del usuario a modificar");
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

			System.out.println("No existe ese empleado");

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

		var edad = sc.nextInt();

		Empleado empleado = new Empleado(nombre, dni, puesto, sexo, 0);
		Empleado.insertar(empleado);

	}

}

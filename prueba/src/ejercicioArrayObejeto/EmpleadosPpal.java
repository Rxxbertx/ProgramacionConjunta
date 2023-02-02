package ejercicioArrayObejeto;

import java.util.Arrays;
import java.util.Scanner;

public class EmpleadosPpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 0;
		int numEmpleado = 0;

		// Método para crear empleado

		Scanner sc = new Scanner(System.in);

		Empleados[] empleados;

		empleados = new Empleados[5];
		
	/*	empleados[0] = new Empleados("71542687E", "Maria", 20, "programador", "mujer");
		
		System.out.println("El empleado nº " + numEmpleado + " que acabas de crear, es el siguiente: "
				+ Arrays.toString(empleados));
		cont++;
		numEmpleado++;*/
		
		

		for (int i = 0; i < empleados.length; i++) {
			if (i == 0) {
				System.out.print("Dime el dni del empleado: ");
				empleados[cont].setDni(sc.next());
			} else if (i == 1) {
				System.out.print("Dime el nombre del empleado: ");
				empleados[cont].setNombre(sc.next());
			} else if (i == 2) {
				System.out.print("Dime la edad del empleado: ");
				empleados[cont].setEdad(sc.nextInt());
			} else if (i == 3) {
				System.out.print("Dime el puesto del empleado: ");
				empleados[cont].setPuesto(sc.next());
			} else {
				System.out.println("Dime el sexo del empleado: ");
				System.out.println("1. Mujer 2. Hombre");
				int sexo = sc.nextInt();

				switch (sexo) {
				case 1:
					empleados[cont].setSexo("Mujer");
					System.out.println(empleados[cont].getSexo());
					break;
				case 2:
					empleados[cont].setSexo("Hombre");
					System.out.println(empleados[cont].getSexo());
					break;

				}

			}

		}
		System.out.println("El empleado nº " + numEmpleado + " que acabas de crear, es el siguiente: "
				+ empleados[cont].toString());

		cont++;
		numEmpleado++;

		// Método para eliminar empleado

		for (int j = 0; j < numEmpleado; j++) {
			System.out.print("Dime el número de DNI del empleado que quieres eliminar: ");
			if (sc.next() == empleados[j].getDni()) {
				for (int i = 0; i < 5; i++) {
					System.out.println("El empleado con dni " + empleados[j].getDni() + " ha sido borrado");
					empleados[j].setDni(null);
					empleados[j].setEdad(0);
					empleados[j].setNombre(null);
					empleados[j].setPuesto(null);
					empleados[j].setSexo(null);

				}
			}
			System.err.println("Este empleado no existe");

		}

		// Método para modificar empleado

		for (int k = 0; k < empleados.length; k++) {
			System.out.print("Dime el número de DNI del empleado que quieres eliminar: ");
			if (sc.next() == empleados[k].getDni()) {
				System.out.println("¿Qué quieres modificar?");
				System.out.println("1.DNI 2.Nombre 3.Edad 4.Puesto 5.Sexo 0.SALIR");
				int modificar = sc.nextInt();
				while (modificar != 0) {

					for (int l = 0; l < 5; l++) {

						switch (modificar) {
						case 1:
							System.out.print("Dime el nuevo dni: ");
							empleados[k].setDni(sc.next());
							break;
						case 2:
							System.out.println("Dime el nuevo nombre: ");
							empleados[k].setNombre(sc.next());
							break;
						case 3:
							System.out.println("Dime la nueva edad: ");
							empleados[k].setEdad(sc.nextInt());
							break;
						case 4:
							System.out.println("Dime el nuevo oficio: ");
							empleados[k].setPuesto(sc.next());
							break;
						case 5:
							System.out.println("Dime el nuevo sexo: ");
							empleados[k].setSexo(sc.next());
							break;
						case 0:
							System.out.println("Ha salido de la modificación del empleado");

						}
					}

					System.out.println("¿Qué quieres modificar?");
					System.out.println("1.DNI 2.Nombre 3.Edad 4.Puesto 5.Sexo 0.SALIR");
					modificar = sc.nextInt();

				}
			}

		}

		// Método para saber cuantas mujeres y hombres hay
		int contMujer = 0;
		int contHombre = 0;
		for (int m = 0; m < empleados.length; m++) {

			if (empleados[m].getSexo().equalsIgnoreCase("mujer")) {
				contMujer++;

			}
		}
		System.out.println("Hay " + contMujer + " mujeres y " + (numEmpleado - contMujer) + " hombres");

		// Método para calcular la edad media de los empleados

		int suma = 0;

		for (int n = 0; n < empleados.length; n++) {
			suma += empleados[n].getEdad();
		}

		System.out.println("La edad media de los empleados es: " + suma / numEmpleado);

		// Método para calcular la edad media de los empleados según el sexo

		int sumaMujer = 0;
		int contdMujer = 0;
		int sumaHombre = 0;

		for (int o = 0; o < empleados.length; o++) {

			if (empleados[o].getSexo().equalsIgnoreCase("mujer")) {
				sumaMujer += empleados[o].getEdad();
				contdMujer++;
			} else {
				sumaHombre += empleados[o].getEdad();
				contHombre++;
			}

		}

		System.out.println("La edad media de las mujeres es " + sumaMujer / contdMujer + " años.");
		System.out.println("La edad media de los hombres es " + sumaHombre / contHombre + " años");

		// Empleado más jóven y más viejo
		int edadJoven = 0;
		String nombreJoven = "";
		int edadMayor = 0;
		String nombreMayor = "";

		for (int p = 0; p < empleados.length; p++) {
			if (empleados[p].getEdad() < edadJoven) {
				edadJoven = empleados[p].getEdad();
				nombreJoven = empleados[p].getNombre();
			} else if (empleados[p].getEdad() > edadMayor) {
				edadMayor = empleados[p].getEdad();
				nombreMayor = empleados[p].getNombre();
			}

		}
		System.out.println("El nombre de la persona más jóven es: " + nombreJoven
				+ " y el nombre de la persona más mayor es: " + nombreMayor);

		sc.close();

	}

}

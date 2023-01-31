package arrays;

import java.util.Scanner;

public class EmpleadoPpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado[] empleados;

		int cont = 0;

		Scanner sc = new Scanner(System.in);

		empleados = new Empleado[5];

		empleados[0] = new Empleado("71542687E", "Maria", 20, "programador", "mujer");

		System.out.println(empleados[0].getNombre());

		System.out.println(empleados[0].getEdad());
		
		for (int i=0;i<empleados.length;i++) {
			if (i==0) {
				System.out.print("Dime el dni del empleado: ");
				empleados[cont].setDni(sc.next());
			} else if (i==1){
				System.out.print("Dime el nombre del empleado: ");
				empleados[cont].setNombre(sc.next());
			}else if (i==2) {
				System.out.print("Dime la edad del empleado: ");
				empleados[cont].setEdad(sc.nextInt());
			}else if (i==3) {
				System.out.print("Dime el puesto del empleado: ");
				empleados[cont].setPuesto(sc.next());
			}else {
				System.out.println("Dime el sexo del empleado: ");
				System.out.println("1. Mujer 2. Hombre");
				/*Switch (int sexo){
					case 1:
					 	empleados[cont].setSexo(sc.next());

						S*/
				}
			}
		}

	}



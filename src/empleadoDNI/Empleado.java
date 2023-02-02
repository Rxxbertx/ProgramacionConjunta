package empleadoDNI;

import java.util.Arrays;
import java.util.Iterator;

public class Empleado {

	static Empleado[] empleado = new Empleado[1];

	String dni;
	String nombre;
	String puesto;
	char sexo;
	static int empleadosID = 0;

	public Empleado(String dni, String nombre, String puesto, char sexo) {

		this.dni = dni;
		this.nombre = nombre;
		this.puesto = puesto;
		this.sexo = sexo;

	};

	static public void insertar(Empleado empleado1) {

		empleado[empleadosID] = empleado1;
		empleadosID++;

		Empleado[] temp = empleado.clone();

		empleado = Arrays.copyOf(temp, empleado.length);

		for (int i = 0; i < temp.length; i++) {

			empleado[i] = temp[i];

		}

		empleado[empleado.length - 1] = empleado1;

		for (int i = 0; i < empleado.length; i++) {
			System.out.println(empleado[i]);
		}

	}

	static public void eliminar() {

	}

	public void modificar() {

	}

	public void determinarSexo() {

	}

}

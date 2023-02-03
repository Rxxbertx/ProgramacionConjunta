package empleadoDNI;

import java.util.Arrays;

public class Empleado {

	static Empleado[] empleado = new Empleado[0];

	String dni;
	String nombre;
	String puesto;
	String sexo;
	int edad;
	static int empleadosID = 0;

	public Empleado(String nombre, String dni, String puesto, String sexo, int edad) {

		this.dni = dni;
		this.nombre = nombre;
		this.puesto = puesto;
		this.sexo = sexo;
		this.edad = edad;

	};

	static public void insertar(Empleado empleado1) {

		Empleado[] temp = empleado.clone();// 49

		empleado = Arrays.copyOf(temp, empleado.length + 1);// 50

		for (int i = 0; i < temp.length; i++) {// 49

			empleado[i] = temp[i];

		}

		empleado[empleadosID] = empleado1;// 50
		empleadosID++;// 51

		// empleado[empleado.length - 1] = empleado1;
		System.out.println();

	}

	static public void eliminar(int empleadoEliminar) {

		empleado[empleadoEliminar] = null;

		int j = -1;

		for (int i = 0; i < empleado.length; i++) {

			if (empleado[i] == null) {
				continue;
			}
			empleado[++j] = empleado[i];

		}

		Empleado temp[] = empleado.clone();
		empleado = Arrays.copyOf(temp, j);
		empleadosID--;

	}

	static public int existe(String dni) {

		for (int i = 0; i < empleado.length; i++) {

			if (empleado[i].dni.equalsIgnoreCase(dni)) {
				return i;
			}

		}
		return -1;

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}

package arrays;

public class Empleado {

	// Atributos

	private String dni;
	private String nombre;
	private int edad;
	private String puesto;
	private String sexo;

	// Constructor por defecto

	public Empleado() {

	}

	// Constructor

	public Empleado(String dni, String nombre, int edad, String puesto, String sexo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.puesto = puesto;
		this.sexo = sexo;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected String getPuesto() {
		return puesto;
	}

	protected void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	protected String getSexo() {
		return sexo;
	}

	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	public static void numeroEmpleado () {
		
		int empleado =0;
		empleado++;
		
		
	}

}

package ejercicioCastingObjetos;

public class Empleados {
	
	//Atributos
	
	private String nombre;
	private String apellidos;
	private double sueldoBase;
	private String dni;
	
	//Constructor por defecto
	
	public Empleados() {
		
	}

	//Constructor con parámetros
	
	public Empleados(String nombre, String apellidos, double sueldoBase, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
		this.dni = dni;
	}
	
	//Getters and setters

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected double getSueldoBase() {
		return sueldoBase;
	}

	protected void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}
	
	//Método información que devuelve el nombre y el apellido del empleado
	
	public String informacion() {
		return "Nombre: " + nombre + " Apellidos: " + apellidos;
	}
	
	
	

}

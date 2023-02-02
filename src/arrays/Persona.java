package arrays;

public class Persona {

	//Atributos
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	//Constructor por defecto
	
	public Persona() {
		super();
	}

	//Constructor con parámetros
	
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	//Getters y setters
	
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

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}
	
	//visualizador de los datos
	
	public void datosPersona() {
		
		System.out.println("Nombre: " + nombre + " Apellidos: " + apellidos + " Edad: " + edad);
	}

	

	
	
	
}

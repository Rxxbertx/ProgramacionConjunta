package programaEmpleado;

public class Trabajador {
	
	
	//Atributos trabajadores
	private String dni;
	private String nombre;
	private int edad;
	private String puesto;
	private String sexo;
	 static int idTrabajador;
	
	//Constructor con parametros
	
	public Trabajador(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		
		idTrabajador++;
	}
	
	//Getters and setters

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


	
	
	
	

}
	

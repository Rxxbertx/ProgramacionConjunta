package ejercicioArrayObejeto;

public class Contacto {

	// Atributos

	static int identificador = 0;
	private String nombre;
	String apellido1;
	String apellido2;
	String direccion;
	String telefono;
	String email;

	// Constructor por defecto

	public Contacto() {
		super();
		identificador++;

	}

	// Constructor con parámetros

	public Contacto(int identificador, String nombre, String apellido1, String apellido2, String direccion,
			String telefono, String email) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		identificador++;
	}
	
	//Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	

	
	
}

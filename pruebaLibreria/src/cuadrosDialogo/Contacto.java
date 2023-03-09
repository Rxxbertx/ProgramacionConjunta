package cuadrosDialogo;

public class Contacto {

	// Atributos
	 String nombre;
	 String telefono;
	static int numContactos = 0;
	
	//Constructor por defecto
	
	public Contacto() {
		super();
	}
	

	// Constructor con parámetros

	public Contacto(String nombre, String telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		numContactos++;
	}

	// Getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String mostrarContacto() throws Exception {

		return "Nombre: " + nombre + "\nTeléfono: " + telefono + "\n--------------------";

	}

}

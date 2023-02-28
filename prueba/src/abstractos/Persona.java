package abstractos;

public abstract class Persona {

	//Atributos
	public static String nombre;
	
	//Constructor por defecto
	
	public Persona() {
		super();
	}
	
	//Constructor con parámetros

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//Métodos getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Método normal
	
	public static String dameNombre() {
		return nombre;
	}
	
	//Método abstracto
	
	public abstract String dameDescripcion();
	
	
	
	
	
}

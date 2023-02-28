package abstractos;

public class Empleado extends Persona{

	//Atributos
	public int id;
	public String descripcion;
	
	//Constructor por defecto 
	
	public Empleado() {
		super();
	}
	
	//Constructor con parámetros
	public Empleado(String nombre, int id) {
		super(nombre);
		this.id=id;
	}
	
	//Getters y setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//Método abstracto
	
	public String dameDescripcion() {
		return descripcion;
	}
	
	//Sobreescribo el método dameNombre para que me de también el id
	
	@Override
	public static String dameNombre() {
		return super.dameNombre();
	}
	
	
	
	
	
	
	
	
	
	
}

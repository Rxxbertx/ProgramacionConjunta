package poliformismo;

public class Persona {

	private String nombre;
	

	private String apellidos;
	private int edad;
	
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	
	public void DatosPersona() {
		System.out.println("Nombre: "+nombre+" edad: "+edad);
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
}

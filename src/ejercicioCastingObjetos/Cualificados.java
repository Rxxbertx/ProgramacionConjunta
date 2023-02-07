package ejercicioCastingObjetos;

public class Cualificados extends Empleados {

	// Atributos

	private String titulacion;
	private double plus;
	private String departamento;

	// Constructor por defecto

	public Cualificados() {

	}

	// Constructor con parámteros

	public Cualificados(String nombre, String apellidos,
			double sueldoBase, String dni, String titulacion, double plus, String departamento) {
		super(nombre, apellidos, sueldoBase, dni);
		this.titulacion = titulacion;
		this.plus = plus;
		this.departamento = departamento;
	}
	
	public String informacion() {
	
		return super.informacion() + " Titulación: " + titulacion + " Departamento: " + departamento;
	}

}

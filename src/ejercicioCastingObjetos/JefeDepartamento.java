package ejercicioCastingObjetos;

public class JefeDepartamento extends Cualificados {

	// Atributos

	private int totalTrabajadoresACargo;
	private int proyectos;
	private double bonificacion;

	// Constructor por defecto

	public JefeDepartamento() {

	}

	// Constructor con parámetros

	public JefeDepartamento(String nombre, String apellidos,
			double sueldoBase, String dni, String titulacion, double plus, String departamento, int totalTrabajadoresACargo, int proyectos, double bonificacion) {
		super(nombre, apellidos, sueldoBase, dni, titulacion, plus, departamento);
		this.totalTrabajadoresACargo = totalTrabajadoresACargo;
		this.proyectos = proyectos;
		this.bonificacion = bonificacion;
	}

	// Getters y setters

	protected int getTotalTrabajadoresACargo() {
		return totalTrabajadoresACargo;
	}

	protected void setTotalTrabajadoresACargo(int totalTrabajadoresACargo) {
		this.totalTrabajadoresACargo = totalTrabajadoresACargo;
	}

	protected int getProyectos() {
		return proyectos;
	}

	protected void setProyectos(int proyectos) {
		this.proyectos = proyectos;
	}

	protected double getBonificacion() {
		return bonificacion;
	}

	protected void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}

	// Método información

	public String informacion() {
		
		return super.informacion() + " Es jefe";
	}

}

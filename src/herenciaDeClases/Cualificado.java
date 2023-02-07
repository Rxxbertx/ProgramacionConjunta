package herenciaDeClases;

public class Cualificado extends Empleado {

	private String Titulacion;
	private float Plus;
	private String Departamento;

	public Cualificado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cualificado(String nombre, String apellido, String dni, float sueldoBase, String titulacion, float plus,
			String departamento) {
		
		super(nombre, apellido, dni, sueldoBase);
		Titulacion = titulacion;
		Plus = plus;
		Departamento = departamento;
	}
	
	public String informacion() {
		return super.informacion()+" Titulacion: "+Titulacion+ "Departamento: "+Departamento;
	}

}

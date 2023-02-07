package herenciaDeClases;

public class JefeDepartamento extends Cualificado {

	private int TotalTrabajadoresACargo;
	private int Proyectos;
	private float Plus;

	public JefeDepartamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JefeDepartamento(String nombre, String apellido, String dni, float sueldoBase, String titulacion, float plus,
			String departamento, int totalTrabajadoresACargo, int proyectos) {
		
		super(nombre, apellido, dni, sueldoBase, departamento, plus, departamento);
		TotalTrabajadoresACargo = totalTrabajadoresACargo;
		Proyectos = proyectos;
		Plus = plus;
	}
	
	public String informacion() {
		return super.informacion()+" (JEFE)";
		}

}

package arrays;

public class Profesor extends Persona {

	//Atributos específicos de Profesor
	
	private String idProfesor;
	private static String departamento ="informática";
	
	//Constructor por defecto
	
	public Profesor() {
		
	}
	
	//Constructor con parámetros que hereda de la clase Persona

	public Profesor(String nombre, String apellidos, int edad, String idProfesor, String departamento) {
		super(nombre, apellidos, edad);
		this.idProfesor = idProfesor;
		this.departamento = departamento;
	}

	//Getters y setters
	
	protected String getIdProfesor() {
		return idProfesor;
	}

	protected void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}

	protected static String getDepartamento() {
		return departamento;
	}

	protected void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	
	//Visualizar los datos del profesor
	//Ponemos Override para que coja lo que tiene en persona, también pondremos el super porque sino solo imprimirá lo de profesor y queremos ambos
	
	@Override
	public void datosPersona() {
		super.datosPersona();
		System.out.println("idProfesor: " + idProfesor + " Departamento: " + departamento);
	}
	
	
	
}

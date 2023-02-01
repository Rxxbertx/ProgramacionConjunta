package poliformismo;

public class Profesor extends Persona {

	private int idProfesor;
	static int id=0;
	private String departamento = "informatica";

	public Profesor(String nombre,String apellidos, int edad) {
		super(nombre, apellidos, edad);
		this.idProfesor=id++;
	}

	@Override
	public void DatosPersona() {
		super.DatosPersona();
		System.out.println("El profesor "+super.getNombre()+" pertenece al departamento " + departamento);
	}

}

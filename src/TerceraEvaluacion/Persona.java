package TerceraEvaluacion;

import java.time.LocalDate;


public class Persona {

	String name;
	String apellido;
	LocalDate fecha;
	
	public Persona(String name, String apellido, LocalDate localDate) {
		
		this.name=name;
		this.apellido=apellido;
		this.fecha=localDate;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	
	
}

package herenciaDeClases;

import java.text.NumberFormat;

public class Empleado {

	private String nombre;
	private String apellido;
	private String dni;
	private float SueldoBase;
	NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
	
	
	
	public Empleado() {
		
	};
	
	public Empleado(String nombre, String apellido, String dni, float sueldoBase) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		SueldoBase = sueldoBase;
	}
	
	public String informacion() {
		
		formatoImporte.setMinimumFractionDigits(0);
		return "Empleado: "+nombre+ " Apellido: "+apellido+" Dni: "+dni+" Sueldo: "+formatoImporte.format(SueldoBase);
	}
	
	
	
}

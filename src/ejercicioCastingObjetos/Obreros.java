package ejercicioCastingObjetos;

public class Obreros extends Empleados{

	//Atributos
	
	private String destinoTrabajo;
	private int horasExtras;
	private double precioHorasExtras;
	
	//Constructor por defecto
	
	public Obreros() {
		
	}
	
	//Constructor con parámetros

	public Obreros(String nombre, String apellidos, double sueldoBase, String dni, String destinoTrabajo, int horasExtras, double precioHorasExtras) {
		super(nombre, apellidos, sueldoBase, dni);
		this.destinoTrabajo = destinoTrabajo;
		this.horasExtras = horasExtras;
		this.precioHorasExtras = precioHorasExtras;
	}
	
	public String informacion() {
		
		return super.informacion() + " Trabaja en la obra de " + destinoTrabajo;
	}
	

	
	
	
}

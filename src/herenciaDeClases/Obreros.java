package herenciaDeClases;

public class Obreros extends Empleado {

	private String DestinoTrabajo;
	private int HorasExtra;
	private float PreciosHoraExtra;

	public Obreros(String nombre, String apellido, String dni, float sueldoBase, String destinoTrabajo,
			int horasExtra, float preciosHoraExtra) {
		
		super(nombre, apellido, dni, sueldoBase);
		DestinoTrabajo = destinoTrabajo;
		HorasExtra = horasExtra;
		PreciosHoraExtra = preciosHoraExtra;
	}

	public Obreros() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String informacion() {
		return super.informacion()+" OBRA: "+DestinoTrabajo;
	}

}

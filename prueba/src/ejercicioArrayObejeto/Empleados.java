package ejercicioArrayObejeto;

public class Empleados {
	

		// Atributos

		private String dni;
		private String nombre;
		private int edad;
		private String puesto;
		private String sexo;
		private int empleado =0;

		// Constructor por defecto

		public Empleados() {
			

		}

		// Constructor

		public Empleados(String dni, String nombre, int edad, String puesto, String sexo) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.edad = edad;
			this.puesto = puesto;
			this.sexo = sexo;
		}

		protected String getDni() {
			return dni;
		}

		protected void setDni(String dni) {
			this.dni = dni;
		}

		protected String getNombre() {
			return nombre;
		}

		protected void setNombre(String nombre) {
			this.nombre = nombre;
		}

		protected int getEdad() {
			return edad;
		}

		protected void setEdad(int edad) {
			this.edad = edad;
		}

		protected String getPuesto() {
			return puesto;
		}

		protected void setPuesto(String puesto) {
			this.puesto = puesto;
		}

		protected String getSexo() {
			return sexo;
		}

		protected void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		
		public static void numeroEmpleado (int empleado) {
			
			empleado++;
			
			
		

	}

}

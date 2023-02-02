package empleadoDNI;

public class Main {

	public static void main(String[] args) {

		Empleado uno=new Empleado("10000", "20000", "3", 'H');
		Empleado dos=new Empleado("11111", "21111", "3", 'F');
		
		Empleado.insertar(uno);
		Empleado.insertar(dos);
		
		
	}

}

package herenciaDeClases;

public class Main {

	public static void main(String[] args) {
		
		Empleado[] empleados = new Empleado[10];
		empleados[0] = new Empleado("RAMIREZ","Pepe","Y021F",1056.89f);
		empleados[1] = new Obreros("Domingo","Pepe","Y021F",1056f,"BANGOK",5,12.5f);
		empleados[2] = new Cualificado("JOAO","Pepe","Y021F",1056f,"PROGRAMER",150f,"MARKETING");
		empleados[3] = new JefeDepartamento("Domingo","Pepe","Y021F",1056f,"PROGRAMER",150f,"MARKETING", 12, 2);
		empleados[4] = new Obreros("EDUARDO","Pepe","Y021F",1056f,"BANGOK",5,12.5f);
		empleados[5] = new Obreros("MARIA","Pepe","Y021F",1056f,"BADAJOZ",5,13.5f);
		empleados[6] = new Cualificado("ALEXIS","Pepe","Y021F",1056f,"PROGRAMER",150f,"MARKETING");
		empleados[7] = new JefeDepartamento("Domingo","Pepe","Y021F",1056f,"PROGRAMER",150f,"MARKETING", 12, 2);
		empleados[8] = new Empleado("EMP1","Pepe","Y021F",1056f);
		empleados[9] = new Empleado("EMP2","Pepe","Y021F",1056f);
		
		
		for (int j = 0; j < empleados.length; j++) {
			
			System.out.printf(empleados[j].informacion()+"\n") ;
			
			if (empleados[j] instanceof Cualificado) {
			System.out.println("\nCual es tu especializacion?\n");
			}
		}
		
		
		
		

	}

}

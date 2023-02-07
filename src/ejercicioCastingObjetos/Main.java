package ejercicioCastingObjetos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados [] empleados = new Empleados[10];
		empleados [0] = new Empleados("Maria", "Cabanna", 25000, "75489625L");
		empleados [1] = new Cualificados("Sara", "Cuca", 30000, "45489625I", "ingeniera informática", 200.49, "informática");
		empleados [2] = new JefeDepartamento("Marta", "Menendez", 60000, "35489625U", "ingeniera industrial", 200.49, "informática", 20, 4, 200);
		empleados [3] = new Obreros("Laura", "Fernandez", 14000, "25489625N", "proyecto nube", 10, 24.50);
		empleados [4] = new Empleados("Jimena", "Gutierrez", 10000, "15489625M");
		empleados [5] = new Cualificados("Valeria", "Salar", 18000, "85489625Q", "ingeniera civil", 200.49, "informática");
		empleados [6] = new JefeDepartamento("Lara", "Salao", 20000, "95489625S", "ingeniera agroalimentaria", 200.49, "informática", 20, 4, 200);
		empleados [7] = new Obreros("Eugenia", "Urumea", 22000, "55489625D", "proyecto nube", 10, 24.50);
		empleados [8] = new Empleados("Lucia", "Pluton", 24000, "65489625F");
		empleados [9] = new Cualificados("Carla", "Caserio", 23000, "075489625V", "ingeniera organizacional", 200.49, "informática");
		
		for(int i =0; i<10;i++) {
			
			System.out.println("Empleado " + i + ": " + empleados[i].informacion());
			
			if(empleados[i] instanceof Cualificados) {
				
				System.out.println("¿Cual es tu especialización?");
			
			}
		}
		
	}

}

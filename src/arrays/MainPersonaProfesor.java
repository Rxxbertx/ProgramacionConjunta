package arrays;

public class MainPersonaProfesor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vamos a probar el polimorfismo

		Persona persona0 = new Profesor(); // Vemos que lo permite porque la clase profesor es heredadad de persona

		//Vamos a crear el array donde vamos a introducir TODOS los datos de los profesores y las personas
		
		Persona personas [] = new Persona [5];
		
		personas[0] = new Profesor("PEPE", "ramirez", 32, "125463", "informática");
		personas[1] = new Persona("PERSONA", "mendez",120);
		personas[2] = new Profesor("PEPE2", "ramirez2", 32, "125478", Profesor.getDepartamento());
		personas[3] = new Persona("PERSONA2", "mendez2",120);
		personas[4] = new Persona("PERSONA3", "mendez3",120);
		
		personas[0].datosPersona();
		personas[1].datosPersona();
		personas[2].datosPersona();
		personas[3].datosPersona();
		personas[4].datosPersona();
		
	}

}

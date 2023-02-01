package poliformismo;

public class Main {

	public static void main(String[] args) {

		Persona personas[] = new Persona[5];

		personas[0] = new Profesor("PEPE", "ramirez", 32);
		personas[1] = new Persona("PERSONA", "mendez",120);
		personas[2] = new Profesor("PEPE2", "ramirez2", 32);
		personas[3] = new Persona("PERSONA2", "mendez2",120);
		personas[4] = new Persona("PERSONA3", "mendez3",120);
		
		personas[0].DatosPersona();
		personas[1].DatosPersona();
		personas[2].DatosPersona();
		personas[3].DatosPersona();
		personas[4].DatosPersona();

	}

}

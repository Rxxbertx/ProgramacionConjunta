package helloKitty;

public class Candy extends Food {

	// Atributos

	private int calories;

	// Constructor

	public Candy(String name, float weight, int calories) {
		super(name, weight);
		this.calories = calories;
	}

	public int getNutritionalValue() {
		int numero = (int) Math.random();

		return numero;
	}
	
	//Método toString heredado
	
	public static void toString (int calories) {
		System.out.println("Calorías: " + calories);
	}

}

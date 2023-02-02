package helloKitty;

public class Candy extends Food {

	// Atributos

	private int calories;

	// Constructor por defecto

	public Candy() {

	}

	// Constructor hacer el por defecto

	public Candy(String name, float weight, int calories) {
		super(name, weight);
		this.calories = calories;
	}

	@Override
	int getNutritionalValue() {
		int numero = (int) Math.random() * 100;

		return numero;
	}

	// Método toString heredado

	@Override
	public String toString() {

		return super.toString() + "Calorías: " + calories;
	}

}

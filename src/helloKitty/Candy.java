package helloKitty;

public class Candy extends Food {

	private int calories;

	public Candy(String nombre, float peso, int calories) {

		super(nombre, peso);
		this.calories = calories;

	}

	@Override
	int getNutrionalValue() {

		int numero = (int) Math.random() * 100;

		return numero;

	}

	public String toString() {

		return super.toString() + "Calorias: " + getCalories();

	}

	public int getCalories() {
		return calories;
	}

}

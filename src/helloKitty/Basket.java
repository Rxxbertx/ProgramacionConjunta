package helloKitty;

public class Basket {

	static Food[] food;

	public Basket() {

		food = new Food[50];

	}

	void addFood(Food comida) {

		food[Food.contador] = comida;
		Food.contador++;

	}

	float totalWeigth() {

		float weigth = 0;

		for (int i = 0; i < Food.contador; i++) {
			weigth += food[i].getWeigth();
		}

		return weigth;

	}

	public String toString() {

		String comida = "";

		for (int i = 0; i < Food.contador; i++) {
			comida += food[i].toString()+"\n";
		}

		return comida;

	}

}

package helloKitty;

public class Basket {

	Food[] food;

	public Basket() {

		this.food = new Food[50];

	}

	void addFood(Food food) {

		this.food[Food.contador] = food;
		Food.contador++;

	}

	float totalWeigth() {

		float weigth = 0;

		for (int i = 0; i < Food.contador; i++) {
			weigth = this.food[i].getWeigth();
		}

		return weigth;

	}

	public String toString() {

		String comida = "";

		for (int i = 0; i < Food.contador; i++) {
			comida = this.food[i].toString();
		}

		return comida;

	}

}

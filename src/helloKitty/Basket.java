package helloKitty;

import java.util.Scanner;

public class Basket {

	Scanner sc = new Scanner(System.in);
	
	static Food [] food;

	
	public Basket() {

		food = new Food [50];
	}

	void addFood(Food comida) {
		
		food[Food.contador] = comida;
		Food.contador++;
		
	}

	float totalWeight() {
		float weight = 0;
		for (int i = 0; i < Food.contador; i++) {
			weight += food[i].getWeight();
		}

		return weight;
	}

	public String toString() {
		String comida = "";

		for (int i = 0; i < Food.contador; i++) {
			comida += food[i].toString()+"\n";
		}

		return comida;
		}

	}



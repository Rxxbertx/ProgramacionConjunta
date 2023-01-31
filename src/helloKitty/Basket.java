package helloKitty;

import java.util.Scanner;

public class Basket {

	Scanner sc = new Scanner(System.in);
	
	static Food [] food;

	
	public Basket(String[] Food) {
		this.Food = Food;
	}

	public static void addFood(String[] Food, String food) {
		
		
		
	}

	public static float totalWeight() {
		float suma = 0;
		return suma;
	}

	public static void toString(String [] Food) {
		for (int i = 0; i < Food.length; i++) {
			System.out.print(Food[i]);
		}

	}

}

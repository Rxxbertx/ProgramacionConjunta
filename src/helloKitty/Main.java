package helloKitty;

import java.util.Scanner;

public class Main {

	static Basket cesta = new Basket();
	static Scanner sc = new Scanner(System.in);
	static Candy caramelo = new Candy("Chupa Chups", 100f, 200);
	static Fruit fruta = new Fruit("Manzana", 10f, "B");
	static Fruit fruta1 = new Fruit("Naranja", 50f, "B");

	public static void main(String[] args) {

		verProductos();

		añadirProducto();

		verCesta();

	}

	private static void verCesta() {

		System.err.println("Los elementos son: \n" + cesta.toString());

	}

	private static void añadirProducto() {
		boolean salir = false;

		while (!salir) {

			System.out.println("Que producto quieres añadir? (0 - para salir)");

			
			switch (sc.nextInt()) {
			case 1:

				cesta.addFood(fruta1);

				break;
			case 2:

				cesta.addFood(fruta);

				break;
			case 3:

				cesta.addFood(caramelo);

				break;

			default:
				salir=true;
				break;
			}
			
		}

		

		System.out.println("El peso total de la cesta es: " + cesta.totalWeigth()+"gr");
	}

	private static void verProductos() {
		System.out.println("PRODUCTOS");
		System.out.println(fruta1.toString() + "\n" + fruta.toString() + "\n" + caramelo.toString());
	}

}

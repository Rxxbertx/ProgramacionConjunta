package arrays;

import java.util.Scanner;

public class EjecucionFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		
		System.err.println("Elige 1 CUADRADO 2 TRIANGULO");

		boolean salir = false;

		while (!salir) {

			switch (sc.nextInt()) {
			case 1:

				cuadrado(sc);
				break;

			case 2:

				triangulo(sc);
				break;

			default:

				salir = true;

				break;
			}
			System.out.println();
			System.err.println("Elige 1 CUADRADO 2 TRIANGULO");

		}

	}

	private static void triangulo(Scanner sc) {

		String color;
		double base, altura;

		System.out.println("DIME COLOR");
		color = sc.next();
		System.out.println("DIME BASE");
		base = sc.nextDouble();
		System.out.println("DIME ALTURA");
		altura = sc.nextDouble();

		Triangulo triangulo = new Triangulo(color, base, altura);

		System.out.println("AREA: " + triangulo.calcularArea() + "cm2");
		System.out.println("COLOR: " + triangulo.getColor());

	}

	private static void cuadrado(Scanner sc) {

		String color;
		double lado;

		System.out.println("DIME COLOR");
		color = sc.next();
		System.out.println("DIME LADO");
		lado = sc.nextDouble();

		Cuadrado cuadrado = new Cuadrado(color, lado);

		System.out.println("AREA: " + cuadrado.calcularArea() + "cm2");
		System.out.println("COLOR: " + cuadrado.getColor());


	}

}

package abstractos;

import java.util.Scanner;

public class MainFigura {
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);


		System.out.println("Dime el color y el lado del cuadrado");
		
		Cuadrado cuadrado1 = new Cuadrado(sc.next(), sc.nextDouble());
		
		System.out.println("Dime el color, base y altura del triángulo");
		
		Triangulo triangulo1 = new Triangulo (sc.next(), sc.nextDouble(), sc.nextDouble());
		
		System.out.println("El cuadrado de color " + cuadrado1.getColor() + " tiene un área de: " + cuadrado1.calcularArea());
		
		System.out.println("El triángulo de color " + triangulo1.getColor() + " tiene un área de: " + triangulo1.calcularArea());

		sc.close();
	}

}

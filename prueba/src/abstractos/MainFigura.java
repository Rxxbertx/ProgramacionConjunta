package abstractos;

import java.util.Scanner;

public class MainFigura {
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);


		System.out.println("Dime el lado del cuadrado");
		
		Cuadrado cuadrado1 = new Cuadrado(sc.next(), sc.nextDouble());
		
		System.out.println("El cuadrado de color: " + cuadrado1.getColor() + " tiene un área de: " + cuadrado1.calcularArea());
		
	}

}

package excepcion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int repetir = 0;
		int num1 = 0;
		int num2 = 0;

		while (repetir < 2) {

			if (repetir == 0) {

				num1 = pedirEntero(sc);

				if (num1 < 0) {

				} else {
					repetir++;
				}
			} else if (repetir == 1) {

				num2 = pedirEntero(sc);
				if (num2 < 0) {

				} else {
					repetir++;
				}
			}
			

		}

		Operaciones operacion = new Operaciones(num1, num2);
		
		System.out.print("La suma es: ");
		System.out.println(operacion.suma());

		try {
			System.out.print("La division es: ");
			System.out.println(operacion.dividir());

		} catch (Exception e) {

			System.out.println("No se puede dividir entre 0");
		}

	}

	private static int pedirEntero(Scanner sc) {

		System.out.print("Dame un numero: ");
		return sc.nextInt();

	}

}

package operaciones;

import java.util.Scanner;

public class Operaciones {

	/*
	 * Crea una clase Operaciones con dos atributos enteros numero1 y numero2. Crea
	 * el constructor con todos los atributos como parámetros. Crea también un
	 * método sumar() que devuelva la suma y otro método dividir() que devuelva la
	 * división de los números. ➢
	 */

	// Atributos
	static int numero1;
	static int numero2;

	// Constructor con parametros
	public Operaciones(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// Método sumar

	public static int sumar() {
		return numero1 + numero2;
	}

	// Método dividir

	public static float dividir() {
		
		return numero1 / numero2;
	}

	// Getters and setters

	public static int getNumero1() {
		return numero1;
	}

	public static void setNumero1(int numero1) {
		Operaciones.numero1 = numero1;
	}

	public static int getNumero2() {
		return numero2;
	}

	public static void setNumero2(int numero2) {
		Operaciones.numero2 = numero2;
	}

	// Pedir número
	public static void pedirEntero1(Scanner sc) {
		// TODO Auto-generated method stub
		boolean introducido = true;

		do {
			try {
				System.out.println("Dime un número");
				numero1 = sc.nextInt();
				introducido=true;
			} catch (Exception e) {
				sc.next();// excepción para cuando se introduce una letra
				introducido = false;
			}
			
		} while (numero1<0||!introducido);
		

	}
	public static void pedirEntero2(Scanner sc) {
		// TODO Auto-generated method stub
		boolean introducido = true;

		
		do {
			try {
				System.out.println("Dime otro número");
				numero2 = sc.nextInt();
				introducido=true;
			}catch(Exception e) {
				sc.next();
				introducido=false;
			}
			
			Operaciones.setNumero2(numero2);
		} while (numero2 < 0||!introducido);

	}

}

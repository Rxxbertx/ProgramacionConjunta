package ejercicioArrayObejeto;

import cadenas.*;

public class MainCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String palabra="reconocer";
		Cadenas cadena= new Cadenas();
		
		
		
		if (cadena.esPalindromo(palabra)) {
			System.out.println("Es palíndromo");
		}
		else {
			System.out.println("No es palíndromo");
		}
		
	}

}

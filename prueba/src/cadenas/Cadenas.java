package cadenas;

public class Cadenas {
	
	public static boolean esPalindromo(String palabra) {

		String principiopalabra = "";
		String finalpalabra = "";
		boolean palindromo=false;

		for (int i = 0; i < palabra.length(); i++) {
			principiopalabra += palabra.charAt(i);
			finalpalabra += palabra.charAt((palabra.length() - 1) - i);

		}
		if (principiopalabra.equals(finalpalabra)) {
			System.out.println("Es palindromo");
			palindromo = true;
		}else {
			System.out.println("No es palindromo");

		}
		return palindromo;

	}

}

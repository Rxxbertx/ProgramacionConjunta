package excepciones;

public class Operaciones {

	//Atributos
	
	private int numero1;
	private int numero2;
	
	//Constructor por defecto
	
	public Operaciones() {
		
	}
	
	//Constructor con parámetros

	public Operaciones(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	/*
	 * Método sumar el cual devuelve la suma de ambos números
	 * 
	 * @param int numer01
	 * @param int numero2
	 * 
	 * @return int que devuelve la suma
	 */
	
	public static int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	/*
	 * Método dividir el cual devuelve la división de ambos números
	 * 
	 * @param int numer01
	 * @param int numero2
	 * 
	 * @return int que devuelve la división
	 */
	
	public static int dividir (int numero1, int numero2) {
		return numero1/numero2;
	}

	protected int getNumero1() {
		return numero1;
	}

	protected void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	protected int getNumero2() {
		return numero2;
	}

	protected void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
}

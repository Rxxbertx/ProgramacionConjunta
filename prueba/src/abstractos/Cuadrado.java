package abstractos;

public class Cuadrado extends Figura {

	// Atributo
	public double lado;

	// Constructor por defecto

	public Cuadrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructor con parámetros (metemos los que hereda)

	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	//Getters and setters
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	// Método de la clase padre abstracta

	public double calcularArea() {
		return lado * lado;
	}

}

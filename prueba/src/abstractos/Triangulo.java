package abstractos;

public class Triangulo extends Figura{

	//Atributos
	public double base;
	public double altura;
	public Triangulo() {
		super();
	}
	
	//Getters and setters
	
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base=base;
		this.altura=altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Método heredado de clase abstracta figura
	
	public double calcularArea() {
		return (base*altura)/2;
	}
	
	
	
	
}

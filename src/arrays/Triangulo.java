package arrays;

public class Triangulo extends Figuras{
	
	private double base;
	private double altura;
	
	public double calcularArea() {
		return (base*altura)/2;
	}
	
	public Triangulo (String color, double base, double altura) {
		this.base=base;
		this.altura=altura;
		
	}
	

}

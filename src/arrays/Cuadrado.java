package arrays;

public class Cuadrado extends Figuras{
	
	private double lado;
	
	public double calcularArea() {
		return lado*lado;
	}
	
	public Cuadrado (String color, double lado) {
		this.lado=lado;
		
	}
	

}

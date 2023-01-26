package clasesAbstractas;

public class Triangulo extends Figura {

	
	double base,altura;
	
	@Override
	double calcularArea() {
		// 
		return base*altura/2;
	}
	
	public Triangulo(double base, double altura, String color) {
		
		this.base=base;
		this.altura=altura;
		super.color=color;
	};

}

package clasesAbstractas;

public class Cuadrado extends Figura {

	double lado;

	@Override
	double calcularArea() {
		//
		return lado * lado;
	}

	public Cuadrado(double lado, String color) {

		this.lado = lado;
		super.color = color;
	}

}

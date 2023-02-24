package abstractos;

public abstract class Figura {

	//Atributos
	public String color;
	
	//Constructor por defecto
	
	public Figura() {
		super();
	}
	
	//Constructor con parámetros
	
	public Figura(String color) {
		super();
		this.color = color;
	}



	//Getters and setters
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}


	//Método calcular Área que utilizaremos en las clases que hereden (derivadas)

	public abstract double calcularArea();
	
}

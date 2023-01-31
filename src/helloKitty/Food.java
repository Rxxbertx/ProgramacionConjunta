package helloKitty;

public abstract class Food {
	
	protected String name;
	protected float weight;
	static int contador=0;
	
	//Constructor por defecto
	
	public Food () {
		
	}
	
	//Constructor
	
	public Food (String name, float weight) {
		super();
		this.name=name;
		this.weight=weight;
	}
	
	//Getter y setter

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected float getWeight() {
		return weight;
	}

	protected void setWeight(float weight) {
		this.weight = weight;
	}
	
	//Método público toString
	
	@Override
	public String toString() {
		
		return "Producto: " + name + "Peso: " + weight + " kg.";
	}
	
	
	//Método abstracto
	
	
	abstract int getNutritionalValue();
	
	
	

}

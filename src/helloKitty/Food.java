package helloKitty;

public abstract class Food {

	String name;
	float weigth;
	static int contador=0;

	public Food(String nombre, float peso) {

		name = nombre;
		weigth = peso;

	}

	public String toString() {

		return ( getName() + " Peso: " + getWeigth()+"gr ");
	}
	
	abstract int getNutrionalValue();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeigth() {
		return weigth;
	}

	public void setWeigth(float weigth) {
		this.weigth = weigth;
	}

}

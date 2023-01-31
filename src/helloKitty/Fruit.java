package helloKitty;

public class Fruit extends Food {

	private String vitamin;
	
	//Constructor 
	
	public Fruit(String vitamin, String name, float weight) {
		super(name, weight);
		this.vitamin=vitamin;
	}
	
	@Override
	int getNutritionalValue() {
		
		int numero = (int)Math.random();
		
		return numero;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "Vitamina: " + vitamin; 
	}

	
}

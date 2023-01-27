package helloKitty;

public class Fruit extends Food {

	private String vitamin;
	
	//Constructor 
	
	public Fruit(String vitamin, String name, float weight) {
		super(name, weight);
		this.vitamin=vitamin;
	}
	
	public int getNutritionalValue() {
		
		int numero = (int)Math.random();
		
		return numero;
		
	}
	
	public static void toString(String vitamin) {
		
		System.out.println("Vitamina: " + vitamin); 
	}

	
}

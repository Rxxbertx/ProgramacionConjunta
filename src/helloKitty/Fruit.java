package helloKitty;

public class Fruit extends Food {
	
	private String vitamin;

	public Fruit(String nombre, float peso, String vitamin) {
		
		super(nombre, peso);
		this.vitamin=vitamin;
		
		
	}

	@Override
	void getNutrionalValue() {
		// TODO Auto-generated method stub
		
	}

}

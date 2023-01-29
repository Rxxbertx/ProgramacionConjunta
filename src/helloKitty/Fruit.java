package helloKitty;

public class Fruit extends Food {
	
	private String vitamin;

	public Fruit(String nombre, float peso, String vitamin) {
		
		super(nombre, peso);
		this.vitamin=vitamin;
		
		
	}

	@Override
	int getNutrionalValue() {
		
		int numero = (int) Math.random()*100;

		return numero;
	}
	
	public String toString() {

		return super.toString()+"Vitamina: "+getVitamin();
		
	}

	public String getVitamin() {
		return vitamin;
	}


}

package abstractos;

public abstract class SerVivo {

	//Atributos
	
	private double tamaño;
	private double peso;
	
	//Getters y setters
	
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Método para implementar en  las clases derivadas(en las que heredan)
	
	protected abstract void desplazarse();
	
	
}

package lINKEDLIST;

public class Producto {

	private String marca;
	private double precio;
	private String nombre;
	
	public Producto(String marca, double precio, String nombre) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.nombre = nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public void mostratProducto() {
		
		System.err.println("Producto "+nombre+" de la marca "+marca+" y el precio "+precio);
		
		
	}
	
	
	
}

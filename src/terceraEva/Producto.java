package terceraEva;

public class Producto {
	
	private String nombre;
	private String marca;
	private double precio;
	
	
	
	
	public Producto(String nombre, String marca, double precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void mostrarProducto() {
		System.out.println("Producto " + nombre + " de la marca " + " vale " + precio + "€");
	}
	
	
	
	
	

}

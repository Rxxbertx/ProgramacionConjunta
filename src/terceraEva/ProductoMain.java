package terceraEva;

import java.util.LinkedList;
import java.util.ListIterator;

public class ProductoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto producto1, producto2, producto3, producto4;
		LinkedList misProductos = new LinkedList();
		
		producto1 = new Producto("Zumo", "Zumosol", 1.55);
		producto2 = new Producto("Cacao", "Colacao", 27.55);
		producto3 = new Producto("Refresco", "Cocacola", 2.55);
		producto4 = new Producto("Leche", "Asturiana", 1.29);
		
		misProductos.add(producto1);
		misProductos.add(producto2);
		misProductos.add(producto2);
		misProductos.add(producto4);
		misProductos.add(producto3);
		misProductos.addFirst(producto2);
		
		//Podemos añadir toda la lista
		
		misProductos.addAll(misProductos);
		
		
		
		//Recorrer
		ListIterator<Producto> lit = misProductos.listIterator();
		while(lit.hasNext()) {
			lit.next().mostrarProducto();
		}

	}

}

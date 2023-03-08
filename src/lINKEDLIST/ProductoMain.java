package lINKEDLIST;

import java.util.Iterator;
import java.util.LinkedList;

public class ProductoMain {

	public static void main(String[] args) {

		Producto producto1, producto2, producto3, producto4;
		LinkedList misProductos = new LinkedList();

		producto1 = new Producto("raton", 12.34, "jbl");
		producto2 = new Producto("pc", 123.34, "logi");
		producto3 = new Producto("teclado", 01234.3, "logi");
		producto4 = new Producto("pantalla", 12334234.23, "jbl");

		misProductos.add(producto1);
		misProductos.add(producto2);
		misProductos.add(producto2);
		misProductos.add(producto3);
		misProductos.add(null);
		misProductos.addFirst(producto4);

		misProductos.toString();

		// tambien sumamos toda la lista

		// misProductos.addAll(misProductos);

		// cambiar precio del ultim product

		((Producto) misProductos.getLast()).setPrecio(1000.32);

		
		
		
		
		
		
		
		
		
		
		
		
		
		Iterator<Producto> lit = misProductos.listIterator();
		while (lit.hasNext()) {
			lit.next().mostratProducto();

		}

		/*
		 * for (int i = 0; i < misProductos.size(); i++) {
		 * 
		 * if (misProductos.get(i)==null) {
		 * 
		 * }else { ((Producto) misProductos.get(i)).mostratProducto(); ; } }
		 */

	}

}

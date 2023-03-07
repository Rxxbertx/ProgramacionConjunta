package arrayList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import arrays.Persona;

public class EstructurasArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Declaramos dos variables de la interfaz List
		List<Persona> lista1;
		List<Persona> lista2;
		
		//Creación de dos instancias de la clase ArrayList
		lista1=new ArrayList<Persona>();
		lista2=new ArrayList<Persona>();
		
		//Crear objetos personas que luego añadiremos a la lista
		p1= new Persona ("Hernan", "Maria", LocalDate.of(2000, 12, 22));
		p2= new Persona ("Martinez", "Sara", LocalDate.of(2000, 12, 22));
		p3= new Persona ("Perez", "Paco", LocalDate.of(2000, 12, 22));
		p4= new Persona ("Sanz", "Luis", LocalDate.of(2000, 12, 22));
		p5= new Persona ("García", "Laura", LocalDate.of(2000, 12, 22));

		
		
		//Añadir las personas a la lista1
		lista1.add(p1);
		lista1.add(p3);
		lista1.add(p4);
		lista1.add(p5);
		
		//Añadir la persona p2 en la posición 1
		lista1.add(1,p2);
		
		//Mostrar los elementos de la lista con un foreach
		
		System.out.println("Las personas de la lista son (foreach)");
		for(Persona p:lista1) {
			System.out.println(p.getApellido);
		}
		
		//Mostrar los elementos de la lista con un for
		System.out.println("Las personas de la lista son (for)");
		for(int i = 0; i<lista1.size();i++) {
			System.out.println(lista1.get(i).getApellido());
		}

		//Recorrer la lista con un iterator
		System.out.println("Las personas de la lista son (iterator)");
		Iterator<Persona> it;
		it = lista1.iterator();
		persona p;
		
		//Mientras haya elementos
		while(it.hasNext()) {
			p=it.next();
			System.out.println();
			System.out.println(p.getApellido());
		}
		
		
	}

}

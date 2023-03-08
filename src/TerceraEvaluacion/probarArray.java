package TerceraEvaluacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class probarArray {

	public static void main(String[] args) {
		//Declaramos 2 varialbes de la interfaz list
		List<Persona> lista1;
		List<Persona> lista2;
		
		
		//Creacion de dos instancias de la clase ArrayList
		
		
		lista1= new ArrayList<Persona>();
		lista2 = new ArrayList<Persona>();
		
		
		//Crear objetos de personas que luego añadimos a la lista
		Persona p1,p2,p3,p4,p5;
		
		p1 =new Persona("Lopez","Alexis",LocalDate.of(1994, 05, 12));
		p2 =new Persona("Tiron","Joao",LocalDate.of(2003, 9, 18)); //Botberto
		p3 =new Persona("Garcia","Ivan",LocalDate.of(1993, 7, 16));
		p4 =new Persona("Martinez","Alberto",LocalDate.of(1995, 3, 28));
		p5 =new Persona("Acon","Diego",LocalDate.of(1980, 3, 3));
		
		// Añadir las personas a la lista1
		
		lista1.add(p1);
	
		lista1.add(p3);
		lista1.add(p4);
		lista1.add(p5);
		
		//Añadir a la persona p2 en la posicion 1
		
		lista1.add(1,p2);
		
		
		//Mostrar los elementos de la lista1 con un for
		System.out.println("Las personas de la lista con for");
		for (int i=0;i<lista1.size();i++) {
			System.out.println(lista1.get(i).getApellido());
		}
		
		//JMostrar los elementos de la lista1 con un iterator
		System.out.println("Las personas de la lista con un iterator");
		
		Iterator<Persona> it;
		it = lista1.iterator();
		Persona p;
		System.out.println();
		//CON UN FOR
//		for (int i=0;it.hasNext();i++) {
//			p=it.next();
//			System.out.println(p.getApellido());
//		}
		//CON UN WHILE
		while (it.hasNext()) {
			p=it.next();
			System.out.println(p.getApellido());
		}
		System.out.println();
		//Recorrer la lista con un listIterator desde el final al principio
		System.out.println("Las personas de la lista con un listIterator del final al principio");
		ListIterator<Persona> lit;
		lit = lista1.listIterator(lista1.size());
		
		while (lit.hasPrevious()) {
			p=lit.previous();
			System.out.println(p.getApellido());
		}
		
		//Reemplazar el elemento de la posición de la lista por otra
		
		lista1.set(2, new Persona("Ruiz","Benito",LocalDate.of(1964, 3, 25)));
		
		
		//Buscar el p4 
		int posicion;
		posicion=lista1.indexOf(p4);
		
		if (posicion==-1) {
			System.out.println("No lo ha encontrado");
		}
		else {
			System.out.println(lista1.get(posicion).getApellido());
		}
		//Buscar el p4 por el final
		
		posicion=lista1.lastIndexOf(p4);
		
		if (posicion==-1) {
			System.out.println("No lo ha encontrado");
		}
		else {
			System.out.println(lista1.get(posicion).getApellido());
		}
		
		
	}

}


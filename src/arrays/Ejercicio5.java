package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5- Crea un programa que, a partir de un vector de números enteros, halle y
		 * muestre el valor más alto que contiene (su máximo) y el valor más bajo que
		 * contiene (su mínimo). El programa debe pedir el número de elementos que
		 * tendrá el vector y los valores de cada uno de esos elementos.
		 */

		Scanner sc=new Scanner (System.in);
		
		System.out.println("Dime la longitud que quieres que tenga tu array");
		
		int longitud=sc.nextInt();
		
		int[] array1 = new int [longitud];
		
		crearArray(sc, array1);
		
		System.out.println("El array que has creado es " + Arrays.toString(array1));
		numMinMax(sc, array1);
		
	}

	/**
	 * @param sc
	 * @param array1
	 */
	private static void numMinMax(Scanner sc, int[] array1) {
		int numMin=array1[0];
		
		int numMax=array1[0];
		for(int i=0;i<array1.length;i++) {
			
			
			if(array1[i]<numMin) {
				numMin=array1[i];
			}else if(array1[i]>numMax) {
				numMax=array1[i];
			}
			
		}
		
		System.out.println("El número máximo del vector es: " + numMax + ". El número mínimo del vector es: " + numMin);
		
		sc.close();
	}

	/**
	 * @param sc
	 * @param array1
	 */
	private static void crearArray(Scanner sc, int[] array1) {
		for (int i=0;i<array1.length;i++) {
			
			System.out.println("Dime el número de la posición " + (i+1));
			
			array1 [i]=sc.nextInt();
			
		}
	}

}

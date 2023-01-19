package arrays;

public class ArrayBidiminesionalRecorrer {

	public static void main(String[] args) {
		
		int [][]numeros= {{23,45,11,2},{62,7},{1,2,3,4,5,6}};

		
		
		for (int j = 0; j < numeros.length; j++) {
			
			System.out.println("Los elementos de la fila "+(j+1));
			System.out.println();
			
			for (int j2 = 0; j2 < numeros[j].length; j2++) {
				System.out.println("\tColumna "+(j2+1)+" valor "+numeros[j][j2]);
			}
			System.out.println();
			
		}
	}

}

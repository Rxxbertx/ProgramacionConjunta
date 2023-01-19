package arrays;


public class ArraysUsandoCmd {
	
	static int sumaNumeros;
	

	public static void main(String[] args) {
		
		
		
		
		System.out.println("La suma de los numeros introducidos "+numerosString(args)+"es: "+sumaNumeros);

		
		
		
		
		
		
	}

	/**
	 * @param args
	 * @param sumaNumeros
	 * @return 
	 * @return
	 */
	 static String numerosString(String[] args) {
		
		sumaNumeros=0;
		String numeros="";
		
		for (int i = 0; i < args.length; i++) {
			sumaNumeros+=Integer.valueOf(args[i]);
			numeros+=(args[i]+" ");
		}
		return numeros;
		
	}

}

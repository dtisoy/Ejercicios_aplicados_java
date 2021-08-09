package ejercicios;


public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World Daniel");
		
		// int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
		
		int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
		/*System.out.println(sumaVectores(vectorEntrada));
		System.out.println("\n----------------");
		System.out.println(mean(vectorEntrada));*/
		//System.out.println("potencia"+Math.pow(2, 3));
		int[] vectorOrdenado = ordenamientoPersonalizado(vectorEntrada);
		
		for (int numero:vectorOrdenado) {
			System.out.println(numero);
		}
		
	
	}
	public static int sumaVectores(int[] vector) {
		int suma = 0;
		for (int i=0; i<vector.length; i++) {
			
			if (vector[i] % 2 == 0 && vector[i]>=0) {
				suma += vector[i];
			}
		}
		return suma;
		
	}
	
	public static double mean(int[] vector) {
		double suma = 0;
		//sum
		for (int i=0; i<vector.length; i++) {
			suma += vector[i];
		}
		double mean = suma/Double.valueOf(vector.length);
		return mean;
	
	}
	
	public static int[] ordenamientoPersonalizado(int[] vector)	{
		int[] ordenarVector1 = new int[vector.length/2];
		int[] ordenarVector2 = new int[vector.length/2];
		for (int i = 0; i<ordenarVector1.length; i++) {
			ordenarVector1[i]= vector[i];
			ordenarVector2[i]= vector[(vector.length-1)-i];
		}
		ordenarVector1 = ordenarMenorMayor(ordenarVector1);
		ordenarVector2 = ordenarMayorMenor(ordenarVector2);
		vector = sumarVectores(vector, ordenarVector1, ordenarVector2);
		
	    
	    return vector;
	}
	public static int[] ordenarMenorMayor(int[] vector) {
		for (int i = 0; i < vector.length-1; i++) {
	        for (int j = i+1; j < vector.length; j++) {
	            if(vector[i] > vector[j]){
	                int temporal = vector[i];
	                vector[i] = vector[j];
	                vector[j] = temporal;
	            }
	        }
	    }
		return vector;
	}
	public static int[] ordenarMayorMenor(int[] vector) {
		for (int i = 0; i < vector.length-1; i++) {
	        for (int j = i+1; j < vector.length; j++) {
	            if(vector[i] < vector[j]){
	                int temporal = vector[j];
	                vector[j] = vector[i];
	                vector[i] = temporal;
	            }
	        }
	    }
		return vector;
	}
	public static int[] sumarVectores(int[] vector, int[] vectorA, int[] vectorB) {
		int i;
		for (i=0; i<vectorA.length; i++) {
			vector[i] = vectorA[i];
		}
		for (int b=0; b<vectorB.length; b++) {
			vector[i] = vectorB[b];
			i++;
		}
		return vector; 
	}

}

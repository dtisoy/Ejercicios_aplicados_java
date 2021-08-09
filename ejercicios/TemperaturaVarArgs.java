package ejercicios;

public class TemperaturaVarArgs {

	public static void main(String[] args) {
		double[] temperaturas = {7.5, 8.2, 7.7, 11.3, 10.75};
		
		System.out.println("Enviando Array para formatear...");
		displayTemps(temperaturas);
		
		System.out.println("Enviando datos Individuales");
		displayTemps(7.5,2.0,4.9,3);
		displayTemps(10);
		displayTemps();
		
	}
	// para recibir argumentos individuales usar ...
	static void displayTemps(double... temperaturaIn) {
		System.out.println();
		System.out.println("*** TEMPERATURAS ***");
		System.out.println("Total de datos: " + temperaturaIn.length);
		
		// Mostrar datos
		for (int i=0; i<temperaturaIn.length; i++) {
			System.out.println(temperaturaIn[i]);
			
		
		}
		System.out.println();
	}

}

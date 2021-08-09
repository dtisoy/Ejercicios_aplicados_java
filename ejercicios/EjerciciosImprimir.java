package ejercicios;
import java.util.Calendar;
import java.util.Scanner;


public class EjerciciosImprimir {

	public static void main(String[] args) {
		 // imprimir con formato
        // %.2f  indica que es formato float o double y con 2 decimales
        // %n    indica un cambio de linea, es lo mismo que \n
		System.out.printf("El valor es %.2f \n", 12.3698);
		
		// Usando la librería Calendar
		Calendar cal = Calendar.getInstance();
		System.out.printf("El mes actual es: %TB \n", cal);
		
		// generar un formato de tablas
		String fmt = "%-30s %-20s %-20s \n";
		
		String users[][] = {{"Matemáticas","Navathe", "80.000"}, 
							{"Algoritmos","Cormen", "92.250"},
							{"Introducción al cálculo", "Rajib Mall", "7.500.00"}};
		
		// imprimir datos con formato
		System.out.printf(fmt, "Libros", "Autor", "Precio");
        System.out.printf(fmt, "-----", "------", "-----");
        for (int i = 0; i< users.length;i++) {
        	System.out.printf(fmt, users[i][0], users[i][1], users[i][2]);
        }
        
        // Entrada por teclado
        String s;
        Scanner texto = new Scanner(System.in);
        
        System.out.print("Introduzca texto: ");
        s = texto.nextLine();
        System.out.println(s);
        
        System.out.print("Enter your Age: ");
        int num = texto.nextInt();
        System.out.printf("You're %d years old", num);
        texto.close();
        
	}

}

package ejercicios;

import java.util.Scanner;

public class Equipo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int opc;
		String opciones[] = {"Verde", "Blanco", "Rojo", "Azul", "Salir"};
		
		do {
			for (int i = 1; i<=opciones.length; i++) {
				System.out.printf("%d. %s\n", i, opciones[i-1]);
			}
			System.out.print("\nSeleccione un color: ");
			opc = teclado.nextInt();
			
			switch(opc) {
			case 1:
			case 2:
				System.out.println("Es de Nacional");
				break;
			case 4: 
			case 3:
				System.out.println("Es de Medellín");
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Escojiste una opción incorrecta :'(");
				break;
			}
			System.out.println();
		}while(opc !=5);
		teclado.close();
	}

}

package intrototesting;

import java.util.Scanner;

public class Suma {
	
	public void obtenerValores() {
		Scanner teclado = new Scanner(System.in);
		obtenerValores(teclado);
		teclado.close();

	}
	
	public int obtenerValores(Scanner scanner) {
		System.out.println("Vamos a hacer una Suma.");
		System.out.println("Introduce el número 1:");
        String numero1 = scanner.nextLine();
		System.out.println("Introduce el número 2:");
        String numero2 = scanner.nextLine();
        
        Integer resultado = ejecutarOperacion(Integer.valueOf(numero1), Integer.valueOf(numero2));
        
		System.out.println("El resultado es: " + resultado);
		return resultado;
	}
	
	
	public Integer ejecutarOperacion(Integer numero1, Integer numero2) {
		return numero1 + numero2;
	}
	
}

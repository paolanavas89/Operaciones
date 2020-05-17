package intrototesting;

import java.util.Scanner;

public class Potencia {
	
	public void obtenerValores() {
		Scanner teclado = new Scanner(System.in);
		obtenerValores2(teclado);
		teclado.close();

	}
	
	public double obtenerValores2(Scanner scanner) {
		System.out.println("Vamos a hacer una Potencia.");
		System.out.println("Introduce el número 1:");
        String numero1 = scanner.nextLine();
		System.out.println("Introduce el número 2:");
        String numero2 = scanner.nextLine();
        
        double resultado = ejecutarPotencia(Integer.valueOf(numero1), Integer.valueOf(numero2));
        
		System.out.println("El resultado de "+numero1+" elevado a "+numero2+" es: " + resultado);
		return resultado;
	}
	
	
	public double ejecutarPotencia(Integer numero1, Integer numero2) {
		return  Math.pow(numero1,numero2);
	}
	
}

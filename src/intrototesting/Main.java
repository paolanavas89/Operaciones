package intrototesting;

import java.util.Scanner;

public class Main {

	private static final int NUM_REPETICIONES = 3;
	
	public static void main(String[] args) {
		Suma suma = new Suma();
		Potencia potencia= new Potencia();
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < NUM_REPETICIONES; i++) {
			suma.obtenerValores(teclado);
			potencia.obtenerValores2(teclado);
		}
        teclado.close();
	}	
}

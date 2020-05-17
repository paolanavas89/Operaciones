package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import intrototesting.Suma;

public class SumaTestAdvanced {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	
	
    @Test
    public void testOperacionSimulandoInput() {
    	Suma suma = new Suma();
    
    	String data = "1\n2\n3\n4\n";
    	System.setIn(new ByteArrayInputStream(data.getBytes()));
    	Scanner scanner = new Scanner(System.in);
        
    	assertEquals(3, suma.obtenerValores(scanner), "La suma debe ser 0");
        assertEquals(7, suma.obtenerValores(scanner), "La suma debe ser 5");
        //assertEquals(10, suma.ejecutarOperacion(2, 3), "La suma debe ser 5");
    }
	
	@Test
	public void testOperacionComprobandoOutput() {

		Suma suma = new Suma();
		
		String data = "1\n2\n";
    	System.setIn(new ByteArrayInputStream(data.getBytes()));
    	Scanner scanner = new Scanner(System.in);
    	
    	
		suma.obtenerValores(scanner);
		String expectedOutput = 
				"Vamos a hacer una Suma.\r\n" + 
				"Introduce el número 1:\r\n" + 
				"Introduce el número 2:\r\n" + 
				"El resultado es: 3\r\n";		

		assertEquals(expectedOutput, outContent.toString());
	}	

}

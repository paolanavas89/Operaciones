package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import intrototesting.Suma;

public class SumaTest {

    @Test
    public void testSuma() {
    	Suma suma = new Suma();
    
        assertEquals(0, suma.ejecutarOperacion(0, 0), "La suma debe ser 0");
        assertEquals(5, suma.ejecutarOperacion(2, 3), "La suma debe ser 5");
        //assertEquals(10, suma.ejecutarOperacion(2, 3), "La suma debe ser 5");

    }
    

}

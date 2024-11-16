
package ar.edu.unlp.objetos.uno.DEMO;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCajaDeAhorro {
    private CajaDeAhorro cajaDeAhorro;
    
    @BeforeEach
    void setUp ()
    {
        cajaDeAhorro = new CajaDeAhorro();
    }
    
    @Test
    void TestCajaDeAhorro()
    {
    	cajaDeAhorro.setSaldo(400);
        assertEquals(400, cajaDeAhorro.getSaldo());
        cajaDeAhorro.depositar(200);
        assertEquals(596, cajaDeAhorro.getSaldo());
        cajaDeAhorro.extraer(100);
        assertEquals(498,cajaDeAhorro.getSaldo());
    }
    
}

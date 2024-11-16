package ar.edu.unlp.objetos.uno.DEMO;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class TestEsfera {
  
        Esfera esfera;

	@BeforeEach
	public void setUp() {
		esfera = new Esfera("Madera","Rojo",2);
	}

	@Test
	public void testSuperficie() {
		assertEquals(50, esfera.getSuperficie());
	}


	@Test
	public void testVolumen() {
		assertEquals(34, esfera.getVolumen());
	}
        
        @Test
        public void testColor ()
        {
            assertEquals("Rojo",esfera.getColor());
        }
        
        @Test
        public void testMaterial ()
        {
            assertEquals("Madera",esfera.getMaterial());
        }
}

package ar.edu.unlp.objetos.uno.DEMO;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Usuario
 */
public class TestCilindro {
    
        Cilindro cilindro;

	@BeforeEach
	public void setUp() {
		cilindro = new Cilindro("Metal","Rojo",2,2);
	}

	@Test
	public void testSuperficie() {
		assertEquals(50, cilindro.getSuperficie());
	}


	@Test
	public void testVolumen() {
		assertEquals(25, cilindro.getVolumen());
	}
        
        @Test
        public void testColor ()
        {
            assertEquals("Rojo",cilindro.getColor());
        }
        
        @Test
        public void testMaterial ()
        {
            assertEquals("Metal",cilindro.getMaterial());
        }
}

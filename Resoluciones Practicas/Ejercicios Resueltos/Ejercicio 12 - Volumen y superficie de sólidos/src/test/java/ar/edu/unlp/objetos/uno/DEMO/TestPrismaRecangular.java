package ar.edu.unlp.objetos.uno.DEMO;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class TestPrismaRecangular {
    PrismaRectangular prisma;
    
    @BeforeEach
    public void setUp()
    {
        this.prisma = new PrismaRectangular("Madera", "Rojo", 2, 2, 2);
    }
    
    @Test
    public void TestVolumen ()
    {
        assertEquals(8,this.prisma.getVolumen());
    }
            
    @Test
    void testGetSuperficie() {
		assertEquals(24,this.prisma.getSuperficie());
    }
    
    
}

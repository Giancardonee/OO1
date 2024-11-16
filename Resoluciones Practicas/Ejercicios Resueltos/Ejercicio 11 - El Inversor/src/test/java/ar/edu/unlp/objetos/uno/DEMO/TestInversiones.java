package ar.edu.unlp.objetos.uno.DEMO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInversiones {
    private Inversor inversionista;
    private InversionEnAcciones acciones;
    private PlazoFijo plazoFijo;
    
    
    @BeforeEach
    void setUp(){
         inversionista = new Inversor("Gianca");
         acciones = new InversionEnAcciones("Apple", 10, 100.0);
         plazoFijo = new PlazoFijo(0.05, 1000);
    }
    
    @Test
     void TestCalcularValores () 
    {
       assertEquals(1000.0, acciones.getCosto());
       assertEquals(1050.0,plazoFijo.getCosto());
       
       inversionista.agregarInversion(acciones);
       assertEquals(1000.0,inversionista.valorActual());
       
       inversionista.agregarInversion(plazoFijo);
       assertEquals(2050.0, inversionista.valorActual());
    }
            
}

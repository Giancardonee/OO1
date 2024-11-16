package ar.edu.unlp.objetos.uno.DEMO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFactura {
    Usuario usuario;
    CuadroTarifario cuadroTarifario;    
    
    public TestFactura() {
        usuario = new Usuario("Gianca", "La Plata.");
        cuadroTarifario = new CuadroTarifario(100);
    }
    
    @Test
    public void TestEmitirFactura() {
        // usuario no posee consumos: Devuelve null 
        Factura factura = new Factura(cuadroTarifario);
        assertEquals(null, factura.emitirFactura(usuario));
           
        // factorPotencia = 0.8 ( límite ) NO DEBE APLICAR BONIFICACION 
        Consumo consumo1 = new Consumo(8.0, 6.0); 
        usuario.agregarConsumo(consumo1);
        Factura facturaEmitida = new Factura(cuadroTarifario).emitirFactura(usuario);
        assertEquals(0, facturaEmitida.getBonificacion(), 0.01);
        assertEquals(800, facturaEmitida.getMontoFinal(), 0.01);
        
        // factorPotencia = 0.6 NO DEBE APLICAR BONIFICACION 
        Consumo consumo2 = new Consumo(10.0, 10.0); 
        usuario.agregarConsumo(consumo2);
        Factura facturaEmitida2 = new Factura(cuadroTarifario).emitirFactura(usuario);
        assertEquals(0, facturaEmitida2.getBonificacion(), 0.01);
        assertEquals(1000, facturaEmitida2.getMontoFinal(), 0.01);
        
        // factorPotencia = 0.936 DEBE APLICAR BONIFICACION DE 100 
        Consumo consumo3 = new Consumo(100.0, 3.0); 
        usuario.agregarConsumo(consumo3);
        Factura facturaEmitida3 = new Factura(cuadroTarifario).emitirFactura(usuario);
        assertEquals(100, facturaEmitida3.getBonificacion(), 0.01);
        assertEquals(9000, facturaEmitida3.getMontoFinal(), 0.01);
    }
}

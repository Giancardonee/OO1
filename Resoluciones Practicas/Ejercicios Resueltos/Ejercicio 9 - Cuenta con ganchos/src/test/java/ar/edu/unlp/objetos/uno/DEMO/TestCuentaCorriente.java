
package ar.edu.unlp.objetos.uno.DEMO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCuentaCorriente {
    private CuentaCorriente cuentaCorriente;
    
    @BeforeEach 
    void setUp()
    {
        cuentaCorriente = new CuentaCorriente(); 
    }
    
    @Test
    void testCuentaCorriente ()
    {
    cuentaCorriente.setSaldo(100);
    cuentaCorriente.setLimiteDescubierto(-500);
    
    // Extraer 100, debería dejar el saldo en 0
    boolean pudoExtraer = cuentaCorriente.extraer(100);
    assertEquals(true, pudoExtraer); // Se pudo extraer
    assertEquals(0, cuentaCorriente.getSaldo()); // Saldo actual
    
    // Extraer 400 más, debería permitirlo y dejar el saldo en -400
    pudoExtraer = cuentaCorriente.extraer(400);
    assertEquals(true, pudoExtraer); // Se pudo extraer
    assertEquals(-400, cuentaCorriente.getSaldo()); // Saldo actual
    
    // Intentar extraer más de lo permitido (600), debería fallar
    pudoExtraer = cuentaCorriente.extraer(200);
    assertEquals(false, pudoExtraer); // No se pudo extraer
    assertEquals(-400, cuentaCorriente.getSaldo()); // El saldo no cambió
    }

}

package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmpleado {

    Empleado empleado1, empleado2,empleado3,empleado4;
    Contrato contrato1, contrato2, contrato3,contrato4,contrato5;

    @BeforeEach
    void setUp() {
        empleado1 = new Empleado("Gian", "Cardone", "unCUIL", LocalDate.of(2001, 8, 28), true, true);
        empleado2 = new Empleado("Leo", "Messi", "OtroCUIL", LocalDate.of(2000, 10, 10), true, true);
        empleado3 = new Empleado("Dibu", "Martinez", "unCUIL", LocalDate.of(2020, 1, 10), true, true);
        empleado4 = new Empleado("Matias", "Mansilla", "otroCCCCUIL", LocalDate.of(2000, 1, 10), true, true);
        
        contrato1 = new ContratoPorHora(LocalDate.of(2024,10, 20), 1000, 10, LocalDate.of(2024,11, 25));
        contrato2 = new ContratoPorHora(LocalDate.of(2024,10, 26), 250, 10, LocalDate.of(2024,10, 30));
        contrato3 = new ContratoDePlanta(LocalDate.of(2022, 10, 8), 1000, 300, 5000);
        contrato4 = new ContratoPorHora(LocalDate.of(2022,10, 26), 250, 10, LocalDate.of(2022,10, 30));
        contrato5 = new ContratoPorHora(LocalDate.of(1993,10, 26), 1500, 10, LocalDate.of(2024,11, 30));
    }

    @Test
    void testAddContrato()
    {
        assertEquals(true,empleado1.agregarContrato(contrato1));
        assertEquals(false,empleado1.agregarContrato(contrato2));
        
        assertEquals(true,empleado2.agregarContrato(contrato3));
        assertEquals(false,empleado2.agregarContrato(contrato1));
        
        assertEquals(true,empleado3.agregarContrato(contrato4));
    }
    
    @Test
    void testReciboContrato()
    {
        assertEquals(true,empleado4.agregarContrato(contrato4));
        assertEquals(null,empleado4.generarRecibo());
        
        assertEquals(true,empleado1.agregarContrato(contrato1));
        ReciboDeSueldo r1 = empleado1.generarRecibo();
        assertEquals(10000,r1.getMontoTotal());
        
        assertEquals(true,empleado2.agregarContrato(contrato5));
        ReciboDeSueldo r2 = empleado2.generarRecibo();
        assertEquals(30000,r2.getMontoTotal());
    }
    
    
}

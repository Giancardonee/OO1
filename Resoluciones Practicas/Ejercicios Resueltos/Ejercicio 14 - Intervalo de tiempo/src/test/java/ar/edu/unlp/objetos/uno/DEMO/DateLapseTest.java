package ar.edu.unlp.objetos.uno.DEMO;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
    private DateLapse lapso;
    private LocalDate fechaInicio;
    private LocalDate fechaHasta;
    private LocalDate fechaIntermedia;
    private LocalDate fehcaNoIntermedia;
    
    @BeforeEach
     void seTup() throws Exception {
        this.fechaInicio = LocalDate.of(2024, 8, 18);
        this.fechaHasta = LocalDate.of(2024, 8, 28);
        this.fechaIntermedia = LocalDate.of(2024,8, 26);
        this.fehcaNoIntermedia = LocalDate.of(2022, 5, 25);
        lapso = new DateLapse(fechaInicio, fechaHasta);
    }
     
     @Test
     void testConstructor ()
     {
         assertEquals(18,this.lapso.getFrom().getDayOfMonth());
         assertEquals(8,this.lapso.getFrom().getMonthValue());
         assertEquals(2024,this.lapso.getFrom().getYear());
         
         assertEquals(28,this.lapso.getTo().getDayOfMonth());
         assertEquals(8,this.lapso.getTo().getMonthValue());
         assertEquals(2024,this.lapso.getTo().getYear());
     }
     
     @Test
     void testSizeInDays ()
     {
         assertEquals(10,this.lapso.sizeInDays());
     }
     
     @Test
     void testIncludesDate ()
     {
         assertTrue(this.lapso.includesDate(fechaIntermedia));
         assertFalse(this.lapso.includesDate(fehcaNoIntermedia));
     }
    
}

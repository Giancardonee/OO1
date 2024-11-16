package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMascota {
    Mascota mascota;
    Vacunacion vacunacion;
    ConsultaMedica consultaMedica;
    Guarderia guarderia;
    Veterinario veterinario1;
    
    @BeforeEach
    void setUp()
    {
        mascota = new Mascota("mascota1", LocalDate.now(), "Perro"); // nombre, fecha nacimiento, especie
        veterinario1 = new Veterinario("Gianluca", LocalDate.of(2020, 8, 28),1000); // nombre, fecha ingreso, horonarios
    }
    
    @Test
    void TestServiciosMascota()
    {

        vacunacion = mascota.darDeAltaVacunacion(veterinario1, "Antirabia", 2000);
        assertEquals(1,mascota.getCantServiciosUtilizados());
        assertEquals(3500,mascota.calcularMontoGenerado(LocalDate.now()));
        
        consultaMedica = mascota.darDeAltaConsultaMedica(veterinario1);
        assertEquals(5200,mascota.calcularMontoGenerado(LocalDate.now()));

        guarderia = mascota.darDeAltaGuarderia(10);
        assertEquals(10200,mascota.calcularMontoGenerado(LocalDate.now()));   
    }
}

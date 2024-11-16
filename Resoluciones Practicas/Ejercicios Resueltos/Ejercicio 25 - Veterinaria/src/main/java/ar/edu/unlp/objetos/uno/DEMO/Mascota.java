package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Mascota {
    private String nombre; 
    private LocalDate fecha_nacimiento;
    private String especie;
    private List<Servicio> servicios;
    
    public Mascota (String nombre, LocalDate fecha_nacimiento, String especie)
    {
        this.servicios = new LinkedList<>();
        this.nombre = nombre; 
        this.fecha_nacimiento = fecha_nacimiento;
        this.especie = especie; 
    }
    
    public ConsultaMedica darDeAltaConsultaMedica(Veterinario veterinario)
    {
        ConsultaMedica consultaMedica = new ConsultaMedica(this, veterinario);
        this.agregarServicio(consultaMedica);
        return consultaMedica;
    }
    
    public Guarderia darDeAltaGuarderia(int cantDias)
    {
        Guarderia guarderia = new Guarderia(this, cantDias);
        this.agregarServicio(guarderia);
        return guarderia;
    }
    
    public Vacunacion darDeAltaVacunacion(Veterinario veterinario,String nombreVacuna,double costoVacuna)
    {
        Vacunacion vacunacion = new Vacunacion(this, veterinario, nombreVacuna, costoVacuna);
        this.agregarServicio(vacunacion);
        return vacunacion;
    }
    
    private void agregarServicio (Servicio servicio)
    {
        this.servicios.add(servicio);
    }
    
    public double calcularMontoGenerado(LocalDate fecha)
    {
        return this.servicios.stream()
                .filter(s -> s.tieneServicioEnFecha(fecha))
                .mapToDouble(s -> s.calcularCosto())
                .sum();
    }
    
    public int getCantServiciosUtilizados()
    {
        return this.servicios.size();
    }
    
}

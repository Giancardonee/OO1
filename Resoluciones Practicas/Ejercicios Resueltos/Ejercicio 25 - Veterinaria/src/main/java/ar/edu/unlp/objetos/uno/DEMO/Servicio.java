package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public abstract class Servicio {
    private LocalDate fecha_servicio; 
    private Mascota mascota;
    
    public Servicio(Mascota mascota)
    {
        this.mascota = mascota;
        this.fecha_servicio = LocalDate.now();
    }
    
    public LocalDate getFecha_Servicio()
    {
        return this.fecha_servicio;
    }
        
    public Mascota getMascota()
    {
        return this.mascota;
    }
    
    
    public abstract boolean tieneServicioEnFecha(LocalDate fecha);
    public abstract double calcularCosto();
    
}

package ar.edu.unlp.objetos.uno.DEMO;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class ServicioMedico extends Servicio {
    private Veterinario veterinarioAtiende; 
    private double adicionalCostoDomingo;
    
    public ServicioMedico(Mascota mascota, Veterinario veterinario)
    {
        super(mascota);
        this.veterinarioAtiende=veterinario;
        this.adicionalCostoDomingo = 200;
    }
    
    public Veterinario getVeterinario()
    {
        return this.veterinarioAtiende;
    }
    
    public boolean caeDiaDomingo()
    {
        LocalDate fecha = this.getFecha_Servicio();
        return fecha.getDayOfWeek() == DayOfWeek.SUNDAY;
    }
    
    public double getCostoAdicionalDomingo()
    {
        return this.adicionalCostoDomingo;
    }
    
    @Override
    public boolean tieneServicioEnFecha (LocalDate fecha)
    {
        return fecha.equals(this.getFecha_Servicio());
    }
}

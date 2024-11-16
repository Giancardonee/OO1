package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import java.time.Period;

public class ConsultaMedica extends ServicioMedico{
    
    public ConsultaMedica(Mascota mascota, Veterinario veterinario)
    {
        super(mascota,veterinario);    
    }
    
    
    @Override 
    public double calcularCosto()
    {
        double adicionalMaterialesDescartables = 300;
        int anhosAntiguedad = Period.between(this.getVeterinario().getFechaIngreso(), LocalDate.now()).getYears();
        double costo = this.getVeterinario().getHonorarios() + adicionalMaterialesDescartables + (anhosAntiguedad *100);
        if (this.caeDiaDomingo()) costo+= this.getCostoAdicionalDomingo();
        return costo;
    }
    
}

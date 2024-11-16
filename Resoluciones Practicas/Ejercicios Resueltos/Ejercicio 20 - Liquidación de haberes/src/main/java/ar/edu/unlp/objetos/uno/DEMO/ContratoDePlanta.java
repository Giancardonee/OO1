package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Duda: podriamos tener varios contratos de planta? si es asi, necesitariamos alguna forma para saber si esta activo o no cada contrato de planta.
*/

public class ContratoDePlanta extends Contrato {
    private double sueldoMensual;
    private double montoConyuge;
    private double montoHijos;
    //private boolean activo; 
    
    
    // sueldoMensual,montoConyuge,montoHijos deberia ser >= 0.
    public ContratoDePlanta (LocalDate fechaInicio,double sueldoMensual,double montoConyuge,double montoHijos)
    {
        super(fechaInicio);
        this.sueldoMensual=sueldoMensual;
        this.montoConyuge=montoConyuge;
        this.montoHijos=montoHijos;
    }
   

    @Override
    public boolean esVigente()
    {
        return true;
    }
    
    
    @Override 
    public double calcularSueldoBasico()
    {
        return this.sueldoMensual+this.montoHijos+this.montoConyuge;
    }
            
    @Override
    public int getAntiguedad()
    {
        return (int)ChronoUnit.YEARS.between(this.getFechaInicio(), LocalDate.now());
    }
    
}

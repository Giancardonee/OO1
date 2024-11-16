package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;


public abstract class Contrato {
    private LocalDate fechaInicio;
    
    public Contrato(LocalDate Fecha)
    {
        this.fechaInicio=Fecha;
    }
    
    public abstract boolean esVigente();
    public abstract double calcularSueldoBasico();
    public abstract int getAntiguedad();
    
    public LocalDate getFechaInicio()
    {
        return this.fechaInicio;
    }
    
}

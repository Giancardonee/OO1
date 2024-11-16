package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoPorHora extends Contrato {
    private double valorHora;
    private int cantHoras;
    private LocalDate fechaFin;
    
    public ContratoPorHora(LocalDate fechaInicio,double valorHora,int cantHoras,LocalDate fechaFin)
    {
        super(fechaInicio);
        this.valorHora=valorHora;
        this.cantHoras=cantHoras;
        this.fechaFin=fechaFin;
    }
    
    public LocalDate getFechaFin()
    {
        return this.fechaFin;
    }
    
    // Un contrato se encuentra vigente si fechaActual<=fechaFin 
    @Override
    public boolean esVigente()
    {
         return LocalDate.now().isBefore(this.fechaFin) || LocalDate.now().isEqual(fechaFin);
    }
    
    @Override
    public double calcularSueldoBasico()
    {
        return this.valorHora*this.cantHoras; 
    }
    
    
    // si el contrato esta vigente: calculamos los años entre la fecha de inicio y la fecha actual
    // si el contrato no esta vigenteÑ calculamos los años entre la fecha de inicio y la fecha de fin 
    @Override
    public int getAntiguedad()
    {
        return (esVigente())  ? (int)ChronoUnit.YEARS.between(getFechaInicio(), LocalDate.now()) : 
			 (int)ChronoUnit.YEARS.between(getFechaInicio(), fechaFin);
    }
}

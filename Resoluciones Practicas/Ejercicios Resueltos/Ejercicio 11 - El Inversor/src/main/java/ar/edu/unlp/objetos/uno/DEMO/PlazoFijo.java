package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
    private LocalDate fechaDeConstitucion;
    private double montoDepositado;
    private double porcentajeDeInteresDiario; 
    
    public PlazoFijo (double porcentajeInteres,double montoDepositado)
    {
        this.fechaDeConstitucion = LocalDate.now();
        this.porcentajeDeInteresDiario = porcentajeInteres;
        this.montoDepositado = montoDepositado; 
    }
    
    public double getCosto ()
    {
        int diasPlazoFijo = (int) (ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now()) + 1);
       // return  ( diasPlazoFijo * (montoDepositado * porcentajeDeInteresDiario) );
       return this.montoDepositado + ( this.montoDepositado * this.porcentajeDeInteresDiario * diasPlazoFijo );
    }
}

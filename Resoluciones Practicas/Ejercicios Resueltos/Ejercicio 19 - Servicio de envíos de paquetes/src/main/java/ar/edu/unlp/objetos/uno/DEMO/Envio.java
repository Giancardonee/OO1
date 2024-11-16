package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public abstract class Envio {
    private LocalDate fechaDespacho;
    private double pesoEnGramos; 
    private String origen;
    private String destino;
    
    public Envio (LocalDate fechaDespacho,double peso,String direcOrigen,String direcDestino)
    {
        this.pesoEnGramos = peso;
        this.origen = direcOrigen;
        this.destino = direcDestino;
    }
    
    public LocalDate getFechaDespacho()
    {
        return this.fechaDespacho;
    }
    
    public String getOrigen()
    {
        return this.origen;
    }
    
    public String getDestino()
    {
        return this.destino;
    }
    
    public double getPeso ()
    {
        return this.pesoEnGramos;
    }
    
    public abstract double calcularPrecioEnvio(); 

}

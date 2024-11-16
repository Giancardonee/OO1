package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {
    private double distanciaKm;
    
    public EnvioInterurbano(LocalDate fechaDespacho,double peso,String direcOrigen,String direcDestino,double distanciaKM)
    {
        super(fechaDespacho, peso, direcOrigen, direcDestino);
        this.distanciaKm = distanciaKM;
    }
    
    public double getDistanciaKm()
    {
        return this.distanciaKm;
    }
    
    @Override
    public double calcularPrecioEnvio()
    {
        double precioPorGramo;
        if (distanciaKm < 100) precioPorGramo = 20;
        else if (distanciaKm>=100 && distanciaKm <=500) precioPorGramo=25;
        else precioPorGramo=30;
        return precioPorGramo * this.getPeso();
    }
}

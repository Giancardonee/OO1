
package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class EnvioInternacional extends Envio {
    private double precioCualquierDestino;
    
    public EnvioInternacional (LocalDate fechaDespacho,double peso,String direcOrigen,String direcDestino)
    {
       super(fechaDespacho,peso, direcOrigen, direcDestino);
       precioCualquierDestino=5000;    
    }
    
    public double getPrecioCualquierDestino()
    {
        return this.precioCualquierDestino;
    }
    
    public double calcularPrecioEnvio()
    {
        double precioPorGramo;
        if (this.getPeso() < 1000) precioPorGramo=10;
        else precioPorGramo=12; 
        return precioPorGramo + this.getPeso() + this.getPrecioCualquierDestino();
    }
}

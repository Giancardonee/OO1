package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
    private double costoFijo;
    private double costoEntregaRapida;
    private boolean esEntregaRapida;

    public EnvioLocal(LocalDate fechaDespacho, double peso, String direcOrigen, String direcDestino, boolean entregaRapida) {
        super(fechaDespacho,peso, direcOrigen, direcDestino);
        this.costoEntregaRapida = 500;
        this.costoFijo=1000;
        this.esEntregaRapida = entregaRapida;
    }

    public double getCostoFijo()
    {
        return this.costoFijo;
    }
    
    public double getCostoEntregaRapida() {
        return this.costoEntregaRapida;
    }
    
    @Override
    public double calcularPrecioEnvio() {
        return esEntregaRapida ? this.getCostoFijo() + this.getCostoEntregaRapida() : this.getCostoFijo();
    }


}

package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public class Guarderia extends Servicio {
    private LocalDate fechaFin;
    private int cantDias;
    public Guarderia(Mascota mascota, int cantDias) {
        super(mascota);
        this.fechaFin = this.getFecha_Servicio().plusDays(cantDias);
        this.cantDias=cantDias;
    }

    @Override
    public boolean tieneServicioEnFecha(LocalDate fecha) {
        return fecha.equals(this.getFecha_Servicio()) || fecha.equals(this.fechaFin)
                || (fecha.isAfter(this.getFecha_Servicio()) && fecha.isBefore(this.fechaFin));
    }

    @Override
    public double calcularCosto()
    {
        double costoDiario = 500;
        double costo =  this.cantDias * costoDiario;
        if (this.getMascota().getCantServiciosUtilizados()>=5) costo *= 0.90;//  se le aplica un descuento del %10
        return costo;
    }
    
}

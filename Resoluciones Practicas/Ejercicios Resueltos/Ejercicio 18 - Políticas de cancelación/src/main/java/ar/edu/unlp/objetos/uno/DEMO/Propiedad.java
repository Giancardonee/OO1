package ar.edu.unlp.objetos.uno.DEMO;

import java.util.LinkedList;
import java.util.List;

public class Propiedad{
    private String direccion;
    private String nombreDescriptivo;
    private double precioPorNoche;
    private List<Reserva> reservas;
    private PoliticaCancelacion IPoliticaCancelacion;
    
    public Propiedad (String direccion, String nombreDescriptivo, double precioPorNoche,PoliticaCancelacion IPoliticaCancelacion)    
    {
        this.direccion = direccion;
        this.nombreDescriptivo = nombreDescriptivo;
        this.precioPorNoche = precioPorNoche;
        this.reservas = new LinkedList<>();
        this.IPoliticaCancelacion = IPoliticaCancelacion;
    }
    
    public boolean propiedadDisponible(DateLapse periodoSolicitado)
    {
       return this.reservas.stream()
               .anyMatch(reserva -> reserva.seEncuentraReservada(periodoSolicitado));
    }
    
    public Reserva crearReserva(DateLapse periodoSolicitado)
    {
        if (this.propiedadDisponible(periodoSolicitado))
        {
            Reserva reserva = new Reserva(periodoSolicitado, this);
            this.reservas.add(reserva);
        }
        return null; // propiedad no esta disponible
    }
    
    
    public double  cancelarReserva(Reserva reserva)
    {
        // si la reserva esta en curso, es imposible dar de baja la reserva.
        if (reserva.reservaEnCurso()) return 0;
        
        // si la reserva NO esta en curso, se la elimina. 
        this.reservas.remove(reserva);
        return IPoliticaCancelacion.reembolsar(reserva);
    }
    
    public double getPrecioPorNoche ()
    {
        return this.precioPorNoche;
    }
    
    public double getIngresosReservas()
    {
        return this.reservas.stream()
                .mapToDouble(reserva -> reserva.calcularPrecioReserva())
                .sum();
    }
    
}

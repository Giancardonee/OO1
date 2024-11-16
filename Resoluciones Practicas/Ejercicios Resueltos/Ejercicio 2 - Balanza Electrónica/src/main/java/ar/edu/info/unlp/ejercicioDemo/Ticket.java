package ar.edu.info.unlp.ejercicioDemo;

//import java.time.LocalDate; consultarlo 
import java.util.Date;


public class Ticket {
    private Date Fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal; 
    
    private static final double porcentajeImpuesto = 0.21; // impuesto %21
    
    public Ticket()
    {
        
    }

    public Ticket(Date Fecha, int cantidadDeProductos, double pesoTotal, double precioTotal) {
        this.Fecha = Fecha;
        this.cantidadDeProductos = cantidadDeProductos;
        this.pesoTotal = pesoTotal;
        this.precioTotal = precioTotal;
    }
    
    public double impuesto ()
    {
        return (this.precioTotal * porcentajeImpuesto) ;
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public static double getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }
    
    public Date getFecha()
    {
        return this.Fecha;
    }
    
    
}

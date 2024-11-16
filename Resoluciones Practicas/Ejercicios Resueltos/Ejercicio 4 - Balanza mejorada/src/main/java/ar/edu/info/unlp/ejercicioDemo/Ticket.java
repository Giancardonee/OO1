package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;


public class Ticket {
    private LocalDate Fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal; 
    private List<Producto> listaProductos;
    private static final double porcentajeImpuesto = 0.21; // impuesto %21
    
    public Ticket(LocalDate Fecha,  double pesoTotal,List<Producto> listaProductosBalanza) {
        this.Fecha = Fecha;
        this.pesoTotal = pesoTotal;
        this.listaProductos = listaProductosBalanza;
        this.cantidadDeProductos = listaProductosBalanza.size();
        this.calcularPrecioTotal(); 
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

    public double getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }
    
    public LocalDate getFecha()
    {
        return this.Fecha;
    }
    
    public void calcularPrecioTotal(){
        this.precioTotal = listaProductos.stream().mapToDouble(Prod -> Prod.getPrecio()).sum();
    }
    
}

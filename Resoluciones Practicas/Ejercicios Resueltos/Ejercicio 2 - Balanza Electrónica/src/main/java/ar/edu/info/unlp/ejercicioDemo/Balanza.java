package ar.edu.info.unlp.ejercicioDemo;

import java.util.Date;

public class Balanza {
    private int cantidadDeProductos; 
    private double precioTotal;
    private double pesoTotal; 
    
    public Balanza ()
    {
        this.variablesEnCero();
    }

    public Balanza(int cantidadDeProductos, double precioTotal, double pesoTotal) {
        this.cantidadDeProductos = cantidadDeProductos;
        this.precioTotal = precioTotal;
        this.pesoTotal = pesoTotal;
    }
    
    public void ponerEnCero()
    {
        this.variablesEnCero();
    }
    
    public void agregarProducto (Producto producto)
    {
        cantidadDeProductos++;
        pesoTotal+= producto.getPeso();
        precioTotal+= producto.getPrecio();
    }
    
    public Ticket emitirTicket()
    {
        return new Ticket(new Date(),this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }
    
    private void variablesEnCero()
    {
        this.cantidadDeProductos = 0 ;
        this.precioTotal=0;
        this.pesoTotal=0;
    }
}

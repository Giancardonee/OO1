package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Presupuesto {
    private LocalDate fecha;
    private String cliente; 
    private List<Item> items;
    
     public Presupuesto()
    {
        this.cliente = "";
        this.fecha = LocalDate.now();
        items = new ArrayList<> ();
    }
    
    public Presupuesto(String nombreCliente)
    {
        this.cliente = nombreCliente;
        this.fecha = LocalDate.now();
        items = new ArrayList<> ();
    }
            
    public void agregarItem (Item item)
    {
        this.items.add(item);
    }
    
    public double calcularTotal ()
    {
        return items.stream().mapToDouble(i -> i.costo()).sum();
    }
    
    public LocalDate getFecha()
    {
        return this.fecha;
    }
    
    public String getCliente ()
    {
        return this.cliente;
    }
    
}

package ar.edu.unlp.objetos.uno.DEMO;

public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Producto(String nombre, String categoria, double precio, int stock) 
    {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }
    
    public double getPrecio()
    {
        return this.precio;
    }
    
    public int getStock()
    {
        return this.stock;
    }
    
    public void descontarStock(int  unidadesVendidas)
    {
        this.stock-= unidadesVendidas;
    }
    
    public boolean hayUnidadesDisponibles(int unidadesSolicitadas)
    {
        return unidadesSolicitadas <= this.stock;
    }
    
    public String getCategoria ()
    {
        return this.categoria;
    }
   
}

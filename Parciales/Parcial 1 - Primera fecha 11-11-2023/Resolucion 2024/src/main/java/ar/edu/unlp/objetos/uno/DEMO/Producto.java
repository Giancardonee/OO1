package ar.edu.unlp.objetos.uno.DEMO;

public abstract class Producto {

    private String nombre;
    private double costoUnitario;
    private String descripcion;
    
    public Producto(String nombre, double costoUnitario, String descripcion) 
    {
        this.nombre = nombre;
        this.costoUnitario = costoUnitario;
        this.descripcion = descripcion;
    }
    
    public abstract double calcularImpuesto(double monto, int unidades); 
    
    public double getCostoUnitario()
    {
       return this.costoUnitario;
    }

    
}

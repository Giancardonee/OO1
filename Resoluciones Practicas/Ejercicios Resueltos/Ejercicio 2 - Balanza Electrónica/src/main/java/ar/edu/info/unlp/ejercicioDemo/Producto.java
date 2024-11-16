package ar.edu.info.unlp.ejercicioDemo;
public class Producto {
    private double precioPorKilo;
    private double peso;
    private String descripcion;
    
    public Producto ()
    {
        
    }

    public Producto(double precioPorKilo, double peso, String descripcion) {
        this.precioPorKilo = precioPorKilo;
        this.peso = peso;
        this.descripcion = descripcion;
    }
    
    public double getPrecio()
    {
        return this.precioPorKilo * peso; 
    }
    
    public void setPeso (double peso)
    {
        this.peso = peso;
    }
    
    public void setPrecioPorKilo (double precioPorKilo)
    {
        this.precioPorKilo = precioPorKilo;
    }
    
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion; 
    }
    
    public String getDescripcion()
    {
        return this.descripcion;
    }
    
    public Double getPrecioPorKilo()
    {
        return this.precioPorKilo;
    }
    
    public double getPeso()
    {
        return this.peso;
    }
    
    
}

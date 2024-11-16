package ar.edu.unlp.objetos.uno.DEMO;

/**
 *
 * @author Usuario
 */
public class Item {
    private String detalle;
    private int cantidad;
    private double costoUnitario; 
   
    public Item( String detalle, int cant, double precioUnitario)
    {
        this.detalle = detalle; 
        this.cantidad = cant;
        this.costoUnitario = precioUnitario;
    }
    
    public double costo()
    {
        return (cantidad * costoUnitario);
    }
    
    public double getCostoUnitario ()
    {
        return this.costoUnitario;
    }
}

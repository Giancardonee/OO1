package ar.edu.unlp.objetos.uno.DEMO;
public class Item {
    private Producto producto;
    private int cantidad; 
    
    public Item (Producto producto, int cantidad)
    {
        this.producto = producto;
        this.cantidad = cantidad; 
    }
    
    public Producto getProducto()
    {
        return this.producto;
    }
    
    public int getCantSolicitada ()
    {
        return this.cantidad;
    }
    
    public double getCosto()
    {
        double monto = this.producto.getCostoUnitario() * this.cantidad;
        double impuesto = this.producto.calcularImpuesto(monto, cantidad);
        return monto + impuesto;
    }
}

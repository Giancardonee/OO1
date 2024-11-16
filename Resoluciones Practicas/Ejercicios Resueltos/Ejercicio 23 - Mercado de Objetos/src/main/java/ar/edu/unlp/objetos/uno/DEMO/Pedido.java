
package ar.edu.unlp.objetos.uno.DEMO;
public class Pedido {
    private FormaDeRetiro retiro;
    private MetodoDePago metodoDePago;
    private Producto producto;
    private int cantidad; 
    
    
    // Si creamos el pedido es porque tiene stock. 
    /* La parte de verificar el stock para mi no entra dentro del pedido, sino entratia dentro de la compra
       que se evalua en la clase Cliente
    */
    public Pedido (FormaDeRetiro retiro,MetodoDePago metodoDePago, Producto producto,int cantidad) 
    {
        this.retiro=retiro;
        this.metodoDePago=metodoDePago;
        this.producto=producto;
        this.cantidad=cantidad;
        this.producto.descontarStock(cantidad); //  actualizamos el stock. 
    }
    
    public double getCostoTotal()
    {
        double costoProducto = this.producto.getPrecio() * this.cantidad;
        double costoMetodoPago = this.metodoDePago.costoAgregado();
        double costoRetiro = this.retiro.costoRetiro();
        return ( costoProducto * costoMetodoPago ) + costoRetiro;
    }

    public FormaDeRetiro getRetiro() {
        return retiro;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
    
    public Producto getProducto()
    {
        return this.producto;
    }    
    
}

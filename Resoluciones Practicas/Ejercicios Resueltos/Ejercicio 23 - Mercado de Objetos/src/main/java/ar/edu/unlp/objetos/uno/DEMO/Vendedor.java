package ar.edu.unlp.objetos.uno.DEMO;

import java.util.LinkedList;
import java.util.List;

public class Vendedor extends Persona{
    private List<Producto> productosOfrece;
    
    public Vendedor (String nombre,String direccion)
    {
        super(nombre,direccion);
        this.productosOfrece = new LinkedList(); 
    }
    
    public boolean addProducto (Producto producto)
    {
        if (!this.productosOfrece.contains(producto))
        {
            this.productosOfrece.add(producto);
            return true;
        }
        else 
        {// el producto ya se encuentra cargado, podriamos hacer algo para actualizar el stock.
            return false;
        }
    }
}

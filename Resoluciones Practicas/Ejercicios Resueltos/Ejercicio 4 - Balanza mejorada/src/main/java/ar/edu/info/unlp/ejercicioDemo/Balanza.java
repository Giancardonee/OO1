package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanza {
    /*cantidad de productos no seria necesario por que podemos hacer un listaProductos.size() */
    // private double precioTotal; el precio total ahora lo conoce y calcula el ticket,con la lista de productos
    
    private List<Producto> listaProductos; // declaro la lista de productos
    
    public Balanza ()
    {
        this.listaProductos = new ArrayList<>(); // inicializo la lista (lista vacia)
    }
    
    public void ponerEnCero()
    {
        this.listaProductos.clear(); // clear limpia / borra todos los elementos de la lista
    }
    
    public void agregarProducto (Producto producto)
    {
        listaProductos.add(producto); // agregamos el producto a la lista
    }
    
    // no me parece necesario pasarle la cantidad de productos por que le paso la lista directamente
    public Ticket emitirTicket()
    {
        return new Ticket(LocalDate.now(),this.getPesoTotal(),listaProductos);
    }

    public int getCantidadDeProductos() {
        return listaProductos.size();
    }

    public double getPesoTotal() {
        return listaProductos.stream().mapToDouble(prod -> prod.getPeso()).sum();
    }
    
    public List<Producto> getProductos()
    {
        return new ArrayList<>(this.listaProductos); // retorno una copia (otra referencia) de la lista
    }   
}

package ar.edu.unlp.objetos.uno.DEMO;

import java.util.LinkedList;
import java.util.List;

public class Cliente extends Persona {

    private List<Pedido> pedidos;

    public Cliente(String nombre, String direccion) {
        super(nombre, direccion);
        this.pedidos = new LinkedList();
    }

    public boolean crearPedido(MetodoDePago pago, FormaDeRetiro retiro, Producto producto, int cantSolicitada) {
        // si hay unidades disponibles generamos el pedido. 
        if (producto.hayUnidadesDisponibles(cantSolicitada)) {
            this.pedidos.add(new Pedido(retiro, pago,producto, cantSolicitada));
            return true;
        }
        // si no hay suficiente unidades disponibles: 
        return false;
    }
    
    public int cantidadDeProductosPedidosEnCategoria(String unaCategoria)
    {
       return (int) pedidos.stream()
                         .filter(pedido -> pedido.getProducto().getCategoria().equals(unaCategoria))
                         .count();
    } 
    
    public double calcularMontoTotal (Pedido pedido)
    {
        // chequeamos que el cliente tenga ese pedido. 
        if (this.pedidos.contains(pedido))
        {
            return pedido.getCostoTotal();
        }
        return -1; // si el cliente no tiene el pedido. 
    }
}

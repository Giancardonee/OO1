package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Cliente {
    private String nombre;
    private String email; 
    private LocalDate fechaAlta; 
    private List<Pedido> pedidos;
    
    public Cliente (String nombre, String email)
    {
        this.pedidos = new LinkedList<>();
        this.nombre = nombre;
        this.email = email;
        this.fechaAlta = LocalDate.now();
    }
        
    public void agregarPedido(Pedido pedido)
    {
        this.pedidos.add(pedido);
    }
    
    public int calcularCantidadSolicitada(Producto p) {
        return this.pedidos.stream()
                .mapToInt(pedido -> pedido.getCantUnidadesProducto(p)) 
                .sum(); 
    }

   
    public double calcularCostoTotalConPeriodo(LocalDate fechaInicio, LocalDate fechaFin)
    {
        return this.pedidos.stream()
                .filter(pedido -> pedido.estaEntreFechas(fechaInicio, fechaFin))
                .mapToDouble(pedido -> pedido.getCostoTotal())
                .sum();
    }

}

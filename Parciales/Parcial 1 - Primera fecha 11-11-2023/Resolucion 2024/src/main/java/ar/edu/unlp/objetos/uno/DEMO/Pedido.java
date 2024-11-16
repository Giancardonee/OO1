package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Pedido {

    private List<Item> items;
    private LocalDate fechaDePedido;

    public Pedido() {
        this.items = new LinkedList<>();
        this.fechaDePedido = LocalDate.now();
    }
    
    public int getCantUnidadesProducto(Producto p) {
    return this.items.stream()
            .filter(item -> item.getProducto().equals(p))  
            .mapToInt(item -> item.getCantSolicitada())     
            .sum();  
    }


    public double getCostoTotal() {
        return this.items.stream()
                .mapToDouble(item -> item.getCosto())
                .sum();
    }

    public boolean estaEntreFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        return (this.fechaDePedido.isEqual(fechaInicio) || this.fechaDePedido.isEqual(fechaFin)
                || (this.fechaDePedido.isAfter(fechaInicio) && this.fechaDePedido.isBefore(fechaFin)));
    }

    public void agregarItem(Item item) {
        this.items.add(item);
    }
}

package ar.edu.unlp.objetos.uno.DEMO;

import java.util.LinkedList;
import java.util.List;

public abstract class Cliente {

    private String nombre;
    private String direccion;
    private List<Envio> envios;

    // inicializar lista envios en constructor 
    public Cliente(String nombre, String direccion) {
        this.envios = new LinkedList<>();
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarEnvio(Envio envio) {
        this.envios.add(envio);
    }

    public double calcularMontoAPagar(DateLapse periodo) {
        double precioEnvio = this.envios.stream()
                .filter(envio -> periodo.includesDate(envio.getFechaDespacho())) // filtro envíos dentro del período
                .mapToDouble(Envio::calcularPrecioEnvio) // me quedo con el precio de cada envío
                .sum(); // sumo los precios

        return precioEnvio * this.descuento(); // aplico el descuento
    }

    public abstract double descuento();

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }
}

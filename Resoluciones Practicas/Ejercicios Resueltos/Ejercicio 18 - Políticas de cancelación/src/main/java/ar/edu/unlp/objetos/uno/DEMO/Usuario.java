package ar.edu.unlp.objetos.uno.DEMO;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String direccion;
    private String DNI;
    private List<Propiedad> propiedades;
    
    public Usuario (String nombre, String direccion, String DNI)
    {
        this.propiedades = new LinkedList<>();
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
    }
        
    public void agregarPropiedad(Propiedad unaPropiedad){
        if (!this.propiedades.contains(unaPropiedad)) this.propiedades.add(unaPropiedad);
    }
    
    public double calcularIngresos()
    {
        double ingreso =  this.propiedades.stream()
                .mapToDouble(propiedad -> propiedad.getIngresosReservas())
                .sum();
        return ingreso * 0.75; // El ingreso de un propietario es el %75 de la suma de los precios totales de las reservas. 
    }
            
}

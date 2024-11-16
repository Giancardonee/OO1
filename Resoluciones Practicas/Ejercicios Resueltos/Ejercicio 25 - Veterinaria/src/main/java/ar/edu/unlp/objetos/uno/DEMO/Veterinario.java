package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public class Veterinario {
    private String nombre; 
    private LocalDate fecha_ingreso;
    private double honorarios; 
    
    public Veterinario (String nombre, LocalDate fecha_ingreso, double honorarios)
    {
        this.nombre = nombre; 
        this.fecha_ingreso = fecha_ingreso;
        this.honorarios = honorarios;
    }
   
    public LocalDate getFechaIngreso()
    {
        return this.fecha_ingreso;
    }
    
    public double getHonorarios()
    {
        return this.honorarios;
    }
    
}

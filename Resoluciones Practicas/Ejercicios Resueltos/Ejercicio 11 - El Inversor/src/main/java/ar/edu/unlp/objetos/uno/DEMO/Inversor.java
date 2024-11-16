package ar.edu.unlp.objetos.uno.DEMO;

import java.util.LinkedList;
import java.util.List;

public class Inversor {
    private String nombre;
    private List<Inversion> inversiones;
    
    public Inversor (String nombre)
    {
        this.nombre = nombre;
        this.inversiones = new LinkedList<>();
    }
    
    public String getNombre ()
    {
        return this.nombre;
    }
    
    public void agregarInversion (Inversion nuevaInversion)
    {
        inversiones.add(nuevaInversion);
    }
    
    public double valorActual ()
    {
        return inversiones.stream().mapToDouble(Inversion::getCosto).sum();
    }
}

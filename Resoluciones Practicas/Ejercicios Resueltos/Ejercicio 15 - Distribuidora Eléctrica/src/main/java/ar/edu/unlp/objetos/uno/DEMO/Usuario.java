package ar.edu.unlp.objetos.uno.DEMO;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String domicilio;
    private List<Consumo> consumosRegistrados; 
    
    public Usuario (String nombre, String domicilio)
    {
        this.consumosRegistrados = new LinkedList<>();
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
    
    public void agregarConsumo (Consumo c)
    {
        this.consumosRegistrados.add(c);
    }
    
    public Consumo getUltimoConsumo()
    {
       return this.consumosRegistrados.isEmpty() ? null : this.consumosRegistrados.get(this.consumosRegistrados.size() - 1);        
    }
}

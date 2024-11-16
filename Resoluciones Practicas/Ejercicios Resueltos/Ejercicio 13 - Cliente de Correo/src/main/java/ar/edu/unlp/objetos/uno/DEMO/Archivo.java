package ar.edu.unlp.objetos.uno.DEMO;
public class Archivo {
    private String nombre;
    
    public Archivo (String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public int tamanho ()
    {
        return this.nombre.length();
    }
    
    
}

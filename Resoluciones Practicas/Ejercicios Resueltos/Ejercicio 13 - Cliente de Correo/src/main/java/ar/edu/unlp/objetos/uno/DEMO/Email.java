package ar.edu.unlp.objetos.uno.DEMO;

import java.util.LinkedList;
import java.util.List;

public class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> archivosAdjuntos;
    
    public Email (String titulo, String cuerpo)
    {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.archivosAdjuntos = new LinkedList<>();
    }
    
    public String getTitulo ()
    {
        return this.titulo;
    }
    
    public String getCuerpo ()
    {
        return this.cuerpo;
    }
    
    public void agregarArchivo (Archivo archivo)
    {
        this.archivosAdjuntos.add(archivo);
    }
    
    public List<Archivo> adjuntos ()
    {
        return this.archivosAdjuntos;
    }
    
    public int tamanho ()
    {
        return (this.titulo.length() + this.cuerpo.length() +
                this.adjuntos().stream()
                        .mapToInt(adj -> adj.tamanho())
                        .sum());
    }
    
    public boolean contiene (String buscado)
    {
        return (this.cuerpo.contains(buscado) || (this.titulo.contains(buscado)));
    }
}

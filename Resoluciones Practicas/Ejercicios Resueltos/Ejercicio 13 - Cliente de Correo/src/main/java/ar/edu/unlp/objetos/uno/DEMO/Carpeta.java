package ar.edu.unlp.objetos.uno.DEMO;

import java.util.LinkedList;
import java.util.List;

public class Carpeta {
    private List<Email> listaEmails;
    private String nombre;
    
    public Carpeta (String nombre)
    {
        this.nombre = nombre;
        listaEmails = new LinkedList<>();    
    }
    
    public String getNombre ()
    {
        return this.nombre;
    }
    
    public void agregarEmail (Email email)
    {
        this.listaEmails.add(email);
    }
    
    public void moverEmail (Email email, Carpeta destino)
    {
        listaEmails.remove(email);
        destino.agregarEmail(email);
    }
    
    public Email buscar (String texto)
    {
        return this.listaEmails.stream()
                .filter(email -> email.contiene(texto))
                .findFirst().orElse(null);
    }
    
    public int espacioOcupado ()
    {
        return this.listaEmails.stream()
                .mapToInt(email -> email.tamanho())
                .sum();
    }
    
    public int getCantidadEmails ()
    {
        return this.listaEmails.size();
    }
}

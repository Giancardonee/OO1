package ar.edu.unlp.objetos.uno.DEMO;

import java.util.LinkedList;
import java.util.List;

public class ClienteDeCorreo {
    private Carpeta inbox;
    private List<Carpeta> carpetas;
    
    
    public ClienteDeCorreo (Carpeta inbox)
    {
        this.inbox = inbox;
        carpetas = new LinkedList<>();
    }
    
    public void recibir (Email email)
    {
        this.inbox.agregarEmail(email); 
    }
    
    public void agregarCarpeta (Carpeta carpeta)
    {
        this.carpetas.add(carpeta); 
    }
    
    public Email buscar (String texto)
    {
            // primero buscamos en inbox
            Email emailBuscado = this.inbox.buscar(texto);
            if (emailBuscado != null)
            {
                return emailBuscado;
            }
            
            // si no retornamos antes, es por que se debe buscar en la lista de carpetas
            return this.carpetas.stream()
                .map(carpeta -> carpeta.buscar(texto))
                .findFirst() // Retorna el primer email encontrado
                .orElse(null); // Si no encuentra nada, retorna null
    }
    
    public int espacioOcuoado ()
    {
        return this.inbox.espacioOcupado()
                + this.carpetas.stream()
                .mapToInt(carpeta -> carpeta.espacioOcupado())
                .sum();
    }
}

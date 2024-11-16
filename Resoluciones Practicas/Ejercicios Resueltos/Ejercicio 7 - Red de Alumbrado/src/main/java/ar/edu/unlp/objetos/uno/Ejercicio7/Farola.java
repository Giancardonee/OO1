package ar.edu.unlp.objetos.uno.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Farola {
    private boolean on; 
    private List<Farola> farolas;
    
    
/*
* Crear una farola. Debe inicializarla como apagada
*/
public Farola ()
{
    this.on=false;
    this.farolas = new ArrayList<>();
}

/*
* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
*/    
public void pairWithNeighbor( Farola otraFarola )
{
    //evitamos farolas repetidas
    if (!this.farolas.contains(otraFarola))
    {
        this.farolas.add(otraFarola); // agregamos la farola a la lista actual
        otraFarola.pairWithNeighbor(this); // agregamos esta farola a la lista de la farola que recibimos por parametro
    }
}
/*
* Retorna sus farolas vecinas
*/
public List<Farola> getNeighbors ()
{
    return new ArrayList<>(this.farolas); // retornamos una copia de las farolas pero con otra referencia.
}

/*  * Si la farola no está encendida, la enciende y propaga la acción.*/
public void turnOn()
{
    if (this.on == false)
    {
        this.on = true; 
        farolas.stream().forEach(farola -> farola.turnOn()); // encendemos cada farola (si no esta encendida)
    }
}

/** Si la farola no está apagada, la apaga y propaga la acción.*/
public void turnOff()
{
    if (this.on == true)
    {
        this.on = false; 
        farolas.stream().forEach(farola -> farola.turnOff()); // apagamos cada farola (si no esta apagada)
    }
}
        
/*
* Retorna true si la farola está encendida.
*/
public boolean isOn()
{
    return this.on; 
}
        
public boolean isOff()
{
    return !this.on; 
}

}



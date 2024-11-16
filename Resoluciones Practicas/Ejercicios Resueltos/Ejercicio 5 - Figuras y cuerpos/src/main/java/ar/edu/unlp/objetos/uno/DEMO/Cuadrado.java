package ar.edu.unlp.objetos.uno.DEMO;


public class Cuadrado implements Figura{
    private double lado; 
    
    public void setLado (double valor)
    {
        this.lado = valor; 
    }
    
    public double getLado ()
    {
        return this.lado; 
    }
    
    public double getPerimetro ()
    {
        return lado * 4; 
    }
    
    public double getArea ()
    {
        return lado * lado; 
    }
    @Override
    public String toString ()
    {
        return "El valor de cada lado es: "+this.lado+" El perimetro es: "+this.getPerimetro()+" y el area es: "+this.getArea();
    }
}

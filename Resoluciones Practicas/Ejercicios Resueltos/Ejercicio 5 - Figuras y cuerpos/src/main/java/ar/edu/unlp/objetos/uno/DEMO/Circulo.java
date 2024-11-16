package ar.edu.unlp.objetos.uno.DEMO;

public class Circulo implements Figura {
    private double radio; 
    private double diametro; 
    
    public double getDiametro ()
    {
        return radio * 2; 
    }
    
    public void setDiametro (double valor)
    {
        this.diametro = valor;  
    }
    
    public double getPerimetro()
    {
        return Math.PI * (this.getDiametro()); 
    }
    
    public double getRadio()
    {
        return this.radio; 
    }
    
    public void setRadio(double valor)
    {
        this.radio = valor; 
    }
    
    public double getArea()
    {
        return Math.PI * (this.radio * this.radio); 
    }
    
    @Override
    public String toString()
    {
        return "Diametro: "+this.getDiametro()+" Area: "+this.getArea()+" Radio: "+this.getRadio();
    }
}

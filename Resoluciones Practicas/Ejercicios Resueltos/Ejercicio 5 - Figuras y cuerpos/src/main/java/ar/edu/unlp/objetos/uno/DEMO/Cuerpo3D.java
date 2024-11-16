package ar.edu.unlp.objetos.uno.DEMO;

public class Cuerpo3D {
    private double altura; 
    private Figura cara_basal; 
    
    public void setAltura (double valor)
    {
        this.altura = valor;
    }
    
    public double getAltura ()
    {
        return this.altura; 
    }
    
    public void setCaraBasal (Figura cara)
    {
        this.cara_basal = cara; 
    }
    
    public double getVolumen ()
    {
        return (cara_basal.getArea() * altura) ; 
    }
    
    public double getSuperficieExterior ()
    {
        return (2 * cara_basal.getArea() + cara_basal.getPerimetro() * this.altura);     
    }
}

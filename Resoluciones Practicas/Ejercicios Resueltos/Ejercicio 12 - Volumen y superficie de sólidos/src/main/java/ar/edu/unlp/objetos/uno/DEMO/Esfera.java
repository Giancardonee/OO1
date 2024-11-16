package ar.edu.unlp.objetos.uno.DEMO;
public class Esfera extends Pieza {
    private int radio;
    
    public Esfera (String unMaterial, String unColor, int unRadio)
    {
        super(unMaterial,unColor);
        this.radio=unRadio;
    }
    
    @Override
    public double getSuperficie ()
    {
         return ( 4 * Math.PI * Math.pow(this.radio,2));
    }
    
    public double getVolumen()
    {
        return ((double) 4/3) * Math.PI * Math.pow(this.radio,3);
    }
}

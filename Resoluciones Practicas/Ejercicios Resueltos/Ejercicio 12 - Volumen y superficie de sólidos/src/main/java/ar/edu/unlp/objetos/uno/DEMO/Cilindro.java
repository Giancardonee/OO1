package ar.edu.unlp.objetos.uno.DEMO;

public class Cilindro extends Pieza {
    private int radio;
    private int altura; 
    
    public Cilindro (String unMaterial, String unColor,int unRadio,int unaAltura)
    {
        super(unMaterial,unColor);
        this.radio = unRadio;
        this.altura = unaAltura;
    }
    
    @Override
    public double getSuperficie ()
    {
        return ( 2 * Math.PI * this.radio * this.altura + 2 * Math.PI * Math.pow(radio, 2));
    }
    
    @Override
    public double getVolumen()
    {
        return ( Math.PI * (Math.pow(this.radio, 2) * this.altura ));
    }
    
}

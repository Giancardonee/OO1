package ar.edu.unlp.objetos.uno.DEMO;
public class PrismaRectangular extends Pieza {
    private int ladoMayor;
    private int ladoMenor;
    private int altura;
    
    public PrismaRectangular(String unMaterial,String unColor,int unLadoMenor, int unLadoMayor,int unaAltura)
    {
        super(unMaterial,unColor);
        this.ladoMenor = unLadoMenor;
        this.ladoMayor = unLadoMayor;
        this.altura = unaAltura;
    }
    
    @Override
    public double getVolumen()
    {
        return this.ladoMayor * this.ladoMenor * this.altura;
    }
    
    @Override
    public double getSuperficie()
    {
        return 2 * (this.ladoMayor * this.ladoMenor 
				+ this.ladoMayor * this.altura
				+ this.ladoMenor* this.altura);
    }
    
    
}

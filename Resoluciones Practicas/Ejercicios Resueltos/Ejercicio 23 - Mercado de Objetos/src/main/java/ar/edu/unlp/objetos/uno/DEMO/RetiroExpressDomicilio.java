package ar.edu.unlp.objetos.uno.DEMO;

public class RetiroExpressDomicilio implements FormaDeRetiro{
    private CalculadoraDeDistancia calculadoraDistancia;
    private String direccion1;
    private String direccion2;
    private double costoPorKm;
    
    public RetiroExpressDomicilio(String direcc1,String direcc2,double costoKm)
    {
        this.calculadoraDistancia = new CalculadoraDeDistancia();
        this.direccion1=direcc1;
        this.direccion2=direcc2;
        this.costoPorKm=costoKm;
    }
    
    
    @Override
    public double costoRetiro ()
    {
        double distancia =  calculadoraDistancia.distanciaEntre(direccion1, direccion2);   
        return distancia * this.costoPorKm;
    }
}

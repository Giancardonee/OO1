package ar.edu.unlp.objetos.uno.DEMO;
public class Pago6Cuotas implements MetodoDePago{
    // para que sea completo deberia modelarse nose, una tarjeta, fecha inicio,fecha fin, datos importantes
    // pero el ejercicio no apunta a modelar metodos de pago. 
    
    @Override
    public double costoAgregado()
    {
        return 1.20;
    }
}

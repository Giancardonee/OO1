package ar.edu.unlp.objetos.uno.DEMO;
public class CajaDeAhorro extends Cuenta {
    private static final double porcentajeAdicional = 0.02; // % 2
    
    public CajaDeAhorro ()
    {
        super();  // invocamos al constructor de su superclase
    }
    
    @Override 
    public boolean puedeExtraer (double monto)
    {   
        return this.getSaldo() >= (monto - (calcularCostoOperacion(monto)));
    }
        
    public void depositar (double monto)
    {
        super.depositar(monto - (calcularCostoOperacion(monto)));
    }
    
    protected void extraerSinControlar(double monto)
    {
        super.extraerSinControlar( monto - (calcularCostoOperacion(monto)));
    }
    
    private double calcularCostoOperacion (double monto)
    {
        return monto * porcentajeAdicional;
    }
}

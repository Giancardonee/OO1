
package ar.edu.unlp.objetos.uno.DEMO;
public class CuentaCorriente extends Cuenta {
    private double limiteDescubierto; 
    
    public CuentaCorriente ()
    {
        super ();
        this.limiteDescubierto = 0;
    }
    
    
    public double getLimiteDescubierto ()
    {
        return this.limiteDescubierto;
    }
    
    public void setLimiteDescubierto (double limite)
    {
        this.limiteDescubierto = limite;
    }
    
    @Override
    public boolean puedeExtraer (double monto)
    {
        return this.getSaldo() - monto >= this.getLimiteDescubierto();
    }
    
}

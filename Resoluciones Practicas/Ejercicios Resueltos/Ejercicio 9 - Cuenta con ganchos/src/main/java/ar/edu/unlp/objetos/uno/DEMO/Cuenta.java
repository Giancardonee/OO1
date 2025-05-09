package ar.edu.unlp.objetos.uno.DEMO;

/**
 *
 * @author Usuario
 */
public abstract class Cuenta {
    private double saldo; 
    
    public Cuenta () 
    {
        this.saldo =0; 
    }
    
    public double getSaldo () 
    {
        return this.saldo;
    }
    
    public void depositar(double monto)
    {
        this.saldo += monto;
    }
    
    protected void extraerSinControlar (double monto)
    {
        this.saldo -= monto;
    }
    
    protected abstract boolean puedeExtraer(double monto);
    
    public boolean extraer (double monto) 
    {
        if (this.puedeExtraer(monto))
        {
            this.extraerSinControlar(monto);
            return true;
        }
        return false;
    }
    
    public boolean transferirACuenta(double monto, Cuenta cuentaDestino)
    {
        if (this.puedeExtraer(monto))
        {
            this.extraerSinControlar(monto);
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }
    
    // para test
    protected void setSaldo (double monto)
    {
        this.saldo = monto;
    }
}

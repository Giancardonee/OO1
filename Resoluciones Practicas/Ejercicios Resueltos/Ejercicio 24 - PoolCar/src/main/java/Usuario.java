public abstract class Usuario{
    private String nombre;
    protected double saldo;
    
    public Usuario (String nombre,double saldo)
    {
        this.nombre=nombre;
        this.saldo=saldo;
    }

    public abstract void cargarSaldo(double saldoAgregar);
    public abstract void descontarSaldo(double saldoDescontar);
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    
}

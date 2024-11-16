package ar.edu.unlp.objetos.uno.DEMO;
public class Consumo {
    private double energiaActiva;
    private double energiaReactiva;
    
    public Consumo (double EA, double ER)
    {
        this.energiaActiva=EA;
        this.energiaReactiva=ER;
    }

    public double getEnergiaActiva() {
        return energiaActiva;
    }

    public double getEnergiaReactiva() {
        return energiaReactiva;
    }
    
    public double calcularFactorPotencia()
    {
        return this.energiaActiva / (Math.sqrt(Math.pow(this.energiaActiva, 2) + Math.pow(this.energiaReactiva, 2)));
    }
}

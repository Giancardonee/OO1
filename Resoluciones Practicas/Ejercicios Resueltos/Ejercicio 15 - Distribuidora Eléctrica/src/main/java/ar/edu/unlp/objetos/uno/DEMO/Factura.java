package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public class Factura {
    private Usuario usuarioCorresponde; 
    private LocalDate fechaEmision; // fecha que se hace el new 
    private double bonificacion; // si bonificacion = 0. No aplica bonificacion. 
    private double montoFinal; 
    private CuadroTarifario tarifario;
    
    
    public Factura (CuadroTarifario cuadroTarifario)
    {
        this.bonificacion=0;
        this.fechaEmision=LocalDate.now();
        this.tarifario = cuadroTarifario;
        this.montoFinal=0;
    }
    
    public Factura emitirFactura (Usuario usuario)
    {
        this.usuarioCorresponde=usuario;
        Consumo consumo = this.usuarioCorresponde.getUltimoConsumo();
        
        if (consumo == null) return null;
       
        double montoConsumo = consumo.getEnergiaActiva() * this.tarifario.getPrecioKWH();
        bonificacion = calcularBonificacion(montoConsumo, consumo.calcularFactorPotencia());
        this.montoFinal = montoConsumo - bonificacion;
        return this;
    }
    
    private double calcularBonificacion(double montoConsumo, double factorPotencia)
    {
        return factorPotencia> 0.8 ? montoConsumo * 0.10 : 0;
    }
    
    public double getBonificacion()
    {
        return this.bonificacion;
    }
    
    public double getMontoFinal()
    {
        return this.montoFinal;
    }
    
}

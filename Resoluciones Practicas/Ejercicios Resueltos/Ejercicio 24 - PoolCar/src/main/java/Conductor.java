
import java.time.LocalDate;

public class Conductor extends Usuario {
    private Vehiculo vehiculo;
    
    
    public Conductor(String nombre,double saldo, Vehiculo vehiculo)
    {
        super(nombre,saldo);
        this.vehiculo=vehiculo;
    }
    
    public Viaje darDeAltaViaje(String origen, String destino,double costoTotal,LocalDate fecha)
    {
        return new Viaje(origen, destino, costoTotal, fecha,this.vehiculo);
    }
    
    @Override
    public void cargarSaldo (double saldoAgregar)
    {
        int cantAnhosAuto= LocalDate.now().getYear() - this.vehiculo.getAnhoFabricacion();
        double comision;
        if ( cantAnhosAuto < 5) comision= 1.01; // %1 
        else comision = 1.10;// %10
        this.saldo+= saldoAgregar * comision;
    }
    
    @Override
    public void descontarSaldo (double saldoDescontar)
    {
        double bonificacion=0.99; // %0.1 
        double descontar = saldoDescontar * bonificacion;
        this.saldo-= descontar;
    }
    
    
    
}
 
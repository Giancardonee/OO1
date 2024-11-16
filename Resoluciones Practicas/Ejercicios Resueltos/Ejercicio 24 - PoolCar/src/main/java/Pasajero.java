
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;

public class Pasajero extends Usuario {
    private List<Viaje> listaViajes;

    public Pasajero(String nombre, double saldo) {
       super(nombre, saldo);
        this.listaViajes = new LinkedList<>();  
    }

    public boolean registrarseEnViaje(Viaje viaje) {
        if (viaje.hayCapacidadDisponible() && this.getSaldo() > 0
                && ChronoUnit.DAYS.between(LocalDate.now(), viaje.getFechaViaje()) >= 2) {
            viaje.agregarPasajero(this);
            listaViajes.add(viaje);
        }
        return false; // no cumple condicion.
    }

    @Override
    public void cargarSaldo(double saldoAgregar) {
         // Se le cobra una comision del %10 si no realizó un viaje en los ultimos 30 dias. 
        double comision = 1.10;
         // si realizo un viaje en los ultimos 30 dias, la comision no se aplica. 
        Viaje ultViaje = this.listaViajes.get(this.listaViajes.size()-1);
        if (this != null) {
            int diasPasadosUltViaje = (int) ChronoUnit.DAYS.between(ultViaje.getFechaViaje(), LocalDate.now());
            if (diasPasadosUltViaje < 30) {
                comision = 1; 
            }
        }
        this.saldo += (saldoAgregar * comision);
    }

    @Override
    public void descontarSaldo(double saldoDescontar) {
        double bonificacion;
         Viaje ultViaje = this.listaViajes.get(this.listaViajes.size()-1);
        if (ultViaje != null) {
            bonificacion = 500;
        }
        this.saldo += (saldoDescontar - 500);
    }
}

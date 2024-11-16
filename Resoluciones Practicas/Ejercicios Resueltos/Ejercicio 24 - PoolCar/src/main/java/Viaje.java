
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Viaje {

    private Vehiculo vehiculo;
    private String origen;
    private String destino;
    private double costoTotal;
    private LocalDate fechaViaje;
    private List<Usuario> usuariosViajan;

    public Viaje(String origen, String destino, double costoTotal, LocalDate fecha, Vehiculo vehiculo) {
        this.origen = origen;
        this.destino = destino;
        this.costoTotal = costoTotal;
        this.fechaViaje = fecha;
        this.usuariosViajan = new LinkedList<>();
        this.usuariosViajan.add(vehiculo.getConductor());
    }

    public LocalDate getFechaViaje() {
        return this.fechaViaje;
    }

    public void agregarPasajero(Usuario usuario) {
        this.usuariosViajan.add(usuario);
    }

    
    // preguntar esto. Esta rari
    public void procesarViaje() {
        double costoEntreIntegrantes = (this.costoTotal / this.usuariosViajan.size());
        this.usuariosViajan.stream()
                .forEach(usuario -> {
                    // Descontamos saldo de todos los usuarios
                    usuario.descontarSaldo(costoEntreIntegrantes);
                });
    }

    public boolean hayCapacidadDisponible() {
        return this.usuariosViajan.size() < this.vehiculo.getCapacidad();
    }
}

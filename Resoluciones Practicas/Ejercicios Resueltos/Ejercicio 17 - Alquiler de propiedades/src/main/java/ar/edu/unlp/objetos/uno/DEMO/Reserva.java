package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public class Reserva {
    private DateLapse periodoReserva;
    private int cantDias;
    private Propiedad propiedad;

    public Reserva(DateLapse periodo, Propiedad propiedad) {
        this.periodoReserva = periodo;
        this.propiedad = propiedad;
        this.cantDias = periodo.sizeInDays();
    }
    
    public boolean seEncuentraReservada(DateLapse periodoSolicitado) {
        return this.periodoReserva.overlaps(periodoSolicitado);
    }

    // Evaluamos:  si al reserva esta entre los dias de la fecha de inicio y fecha de fin
    // y tambien evaluamos los extremos (fecha actual = fecha inicio) y (fecha actual = fecha fin)
    public boolean reservaEnCurso() {
        LocalDate fechaActual = LocalDate.now();
        return periodoReserva.includesDate(fechaActual)
                || this.periodoReserva.getFrom().equals(fechaActual) || this.periodoReserva.getTo().equals(fechaActual);
    }

    public double calcularPrecioReserva() {
        return this.cantDias + this.propiedad.getPrecioPorNoche();
    }

    public DateLapse getPeriodoReserva() {
        return this.periodoReserva;
    }

    public int getCantDias() {
        return this.cantDias;
    }

}

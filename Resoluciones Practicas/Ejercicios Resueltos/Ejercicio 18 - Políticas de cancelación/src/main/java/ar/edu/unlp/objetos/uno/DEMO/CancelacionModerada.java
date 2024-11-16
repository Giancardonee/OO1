package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CancelacionModerada implements PoliticaCancelacion {

    // si la reserva no esta en curso, o si no termino la reserva
    // si la cancelacion se hace hasta una semana antes, reembolsa %100, sino hasta 2 dias antes, reembolsamos %50
    public double reembolsar(Reserva unaReserva) {
        LocalDate hoy = LocalDate.now();
        LocalDate inicioReserva = unaReserva.getPeriodoReserva().getFrom();
        if (hoy.isBefore(unaReserva.getPeriodoReserva().getFrom())) {
            int cantidadDias = (int) ChronoUnit.DAYS.between(hoy, inicioReserva);
            double montoTotal = unaReserva.calcularPrecioReserva();
            if (cantidadDias >=7) return montoTotal; // %100
            else if (cantidadDias>=2) return montoTotal/2.0; // %50 
        }
        return 0; 
    }
}

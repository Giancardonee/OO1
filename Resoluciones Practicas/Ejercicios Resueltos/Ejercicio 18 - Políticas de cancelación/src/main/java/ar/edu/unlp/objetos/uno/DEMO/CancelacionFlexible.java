package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public class CancelacionFlexible implements PoliticaCancelacion {

    // si el dia de solicitud de reembolo es menor al dia del inicio de la reserva, se reembola el total, sino no se reembolsa nada. 
    public double reembolsar(Reserva unaReserva) {
        return LocalDate.now().isBefore(unaReserva.getPeriodoReserva().getFrom())
                ? unaReserva.calcularPrecioReserva() // reembolsamos el total. 
                : 0;
    }

}

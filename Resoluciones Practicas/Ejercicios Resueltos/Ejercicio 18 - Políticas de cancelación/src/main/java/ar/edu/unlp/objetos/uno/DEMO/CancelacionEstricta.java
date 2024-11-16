package ar.edu.unlp.objetos.uno.DEMO;

public class CancelacionEstricta implements PoliticaCancelacion {

    
    // no reembolsa nada. 
    public double reembolsar(Reserva unaReserva) {
        return 0;
    }
}

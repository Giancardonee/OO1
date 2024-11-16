package ar.edu.unlp.objetos.uno.DEMO;

import ar.edu.unlp.objetos.uno.DEMO.incisoB.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements Date{
    private LocalDate from;
    private LocalDate to;
    
    public DateLapse (LocalDate from, LocalDate to)
    {
        this.from = from;
        this.to = to;
    }
    
    public LocalDate getFrom ()
    {
        return this.from;
    }
    
    public LocalDate getTo ()
    {
        return this.to;
    }
    /*
	 * Retorna la cantidad de días entre la fecha 'from' y la fecha 'to'
    */
    public int sizeInDays ()
    {
        return (int) from.until(to , ChronoUnit.DAYS);
    }
    
    /*
	 * Recibe un objeto LocalDate y 
	 * retorna true si la fecha está  entre el from y el to del receptor y false en caso contrario.
    */
    public boolean includesDate(LocalDate unaFecha) {
            return unaFecha.isAfter(this.getFrom()) && unaFecha.isBefore(this.getTo());
    }
    
}

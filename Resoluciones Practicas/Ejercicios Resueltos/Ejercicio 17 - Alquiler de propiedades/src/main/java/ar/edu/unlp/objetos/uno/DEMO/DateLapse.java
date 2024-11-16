package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
    private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	/*
	 * Retorna la fecha de inicio del rango
	 */
	public LocalDate getFrom() {
		return this.from;
	}

	/*
	 * Retorna la fecha de fin del rango
	 */
	public LocalDate getTo() {
		return this.to;
	}

	/*
	 * Retorna la cantidad de días entre la fecha 'from' y la fecha 'to'
	 */
	public int sizeInDays() {
		return (int) this.getFrom().until(this.getTo(),ChronoUnit.DAYS);
	}

	/*
	 * Recibe un objeto LocalDate y 
	 * retorna true si la fecha está  entre el from y el to del receptor y false en caso contrario.
	 */
	public boolean includesDate(LocalDate other) {
		return other.isAfter(this.getFrom()) && other.isBefore(this.getTo());
	}
	
	public boolean overlaps (DateLapse anotherDateLapse)
        {
            return this.includesDate(anotherDateLapse.getFrom()) || this.includesDate(anotherDateLapse.getTo())
                    || this.equalsFrom(anotherDateLapse.getFrom()) || this.equalsTo(anotherDateLapse.getTo());
        }
	
	public boolean laterFrom () {
		return this.getFrom().isAfter(LocalDate.now());
	}
	
	public boolean equalsTo(LocalDate date) {
		return this.getTo().equals(date);
	}
	
	public boolean equalsFrom(LocalDate date) {
		return this.getFrom().equals(date);
	}
}

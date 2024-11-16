package ar.edu.unlp.objetos.uno.DEMO.incisoB;

import java.time.LocalDate;

public class DateLapse2 implements Date{
    private LocalDate from;
    private int sizeInDays;
    
        public DateLapse2(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}

	@Override
	public LocalDate getFrom() {
		return this.from;
	}

	@Override
	public LocalDate getTo() {
		return this.getFrom().plusDays(this.sizeInDays());
	}

	@Override
	public int sizeInDays() {
		return this.sizeInDays;
	}

	@Override
	public boolean includesDate(LocalDate other) {
		return other.isAfter(this.getFrom()) && other.isBefore(this.getTo());
	}
}

package ar.edu.unlp.objetos.uno.DEMO.incisoB;

import java.time.LocalDate;

public interface  Date {
    public LocalDate getFrom();
    public LocalDate getTo();
    public int sizeInDays();
    public boolean includesDate(LocalDate other);
}

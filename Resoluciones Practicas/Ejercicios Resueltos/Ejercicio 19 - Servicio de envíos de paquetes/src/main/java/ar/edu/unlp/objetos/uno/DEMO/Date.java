package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public interface  Date {
    public LocalDate getFrom();
    public LocalDate getTo();
    public int sizeInDays();
    public boolean includesDate(LocalDate other);
}

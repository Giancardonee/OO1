package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public class Mamifero {

    private String identificador;
    private String especie;
    private LocalDate nacimiento;
    private Mamifero padre;
    private Mamifero madre;

    public Mamifero() {
    }

    public Mamifero(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return this.especie;
    }

    public LocalDate getFechaNacimiento() {
        return this.nacimiento;
    }

    public void setFechaNacimiento(LocalDate fecha) {
        this.nacimiento = fecha;
    }

    public Mamifero getPadre() {
        return this.padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getMadre() {
        return this.madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }
    
    
    // Evaluamos si es distinto de null antes de acceder a sus metodos
    public Mamifero getAbueloMaterno() {
        return (this.getMadre() != null && this.getMadre().getPadre() != null) ? this.getMadre().getPadre() : null;
    }
    
    public Mamifero getAbuelaMaterna() {
        return (this.getMadre() != null && this.getMadre().getMadre() != null) ? this.getMadre().getMadre() : null;
    }

    public Mamifero getAbueloPaterno() {
        return (this.getPadre() != null && this.getPadre().getPadre() != null) ? this.getPadre().getPadre() : null;
    }

    public Mamifero getAbuelaPaterna() {
        return (this.getPadre() != null && this.getPadre().getMadre() != null) ? this.getPadre().getMadre() : null;
    }

    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        if (unMamifero.equals(this.getPadre()) || unMamifero.equals(this.getMadre())) {
            return true;
        }
        if ((this.getPadre() != null && this.getPadre().tieneComoAncestroA(unMamifero))
                || (this.getMadre() != null && this.getMadre().tieneComoAncestroA(unMamifero))) {
            return true;
        }
        return false;
    }

}

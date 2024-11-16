package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Empleado {

    private String nombre;
    private String apellido;
    private String CUIL;
    private LocalDate fechaNacimiento;
    private boolean hijosACargo;
    private boolean conyuge;
    private List<Contrato> contratos;

    public Empleado(String nombre, String apellido, String CUIL, LocalDate fechaNacimiento, boolean hijosACargo, boolean conyuge) {
        this.contratos = new LinkedList<>();
        this.nombre = nombre;
        this.apellido = apellido;
        this.CUIL = CUIL;
        this.fechaNacimiento = fechaNacimiento;
        this.hijosACargo = hijosACargo;
        this.conyuge = conyuge;
    }

    /* Un empleado solo puede tener un solo contrato vigente. 
        El contrato activo para el caso de contrato “de planta” es el único contrato vigente. 
        Para un contrato “por horas”, se considera activo aquel cuya fecha de fin sea posterior a la fecha actual.
     */
    public boolean agregarContrato(Contrato contrato) {
        if (!this.contratos.stream().anyMatch(c -> c.esVigente())) {
            contratos.add(contrato);
            return true;
        }
        return false; // Ya hay un contrato activo. No puedo agregar otro. 
    }

    public int getAntiguedad()
    {
        return this.contratos.stream().mapToInt(c -> c.getAntiguedad()).sum();
    }
   
    
    // Para generar el recibo de sueldo se tiene en cuenta solo su contrato vigente.
   public ReciboDeSueldo generarRecibo()
   {
       Contrato contratoVigente = contratos.stream().filter(c -> c.esVigente()).findFirst().orElse(null);
       // si tiene un contrato vigente, genero el ticket. 
       if (contratoVigente != null)
       {
           int antiguedad = this.getAntiguedad();
           return new ReciboDeSueldo(this.nombre, this.apellido, this.CUIL, antiguedad, contratoVigente.calcularSueldoBasico());
       }
       return null;
   }
}

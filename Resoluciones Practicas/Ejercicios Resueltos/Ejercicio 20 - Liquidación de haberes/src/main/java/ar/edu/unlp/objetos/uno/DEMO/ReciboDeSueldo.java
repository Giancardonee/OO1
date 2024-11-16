package ar.edu.unlp.objetos.uno.DEMO;
import java.time.LocalDate;

// Esta clase se encarga de clcular y generar un recibo de sueldo. 

public class ReciboDeSueldo {
    private String nombre;
    private String apellido;
    private String CUIL;
    private int antiguedad;
    private LocalDate fechaGenerado;
    private double montoTotal;//sueldoBasico + adicional
    
    public ReciboDeSueldo(String nombre,String apellido,String CUIL,int antiguedad,double sueldoBasico )
    {
       this.nombre=nombre;
       this.apellido=apellido;
       this.CUIL=CUIL;
       this.antiguedad=antiguedad;
       this.fechaGenerado=LocalDate.now();
       montoTotal=calcularMontoTotal(sueldoBasico);
    }
    
    private double calcularMontoTotal(double sueldoBasico)
    {
        double adicional=1.0;
        
        if (this.antiguedad>=20) adicional=2.00;
        else if (this.antiguedad>=15) adicional=1.70;
        else if (this.antiguedad>=10) adicional=1.50;
        else if (this.antiguedad>=5)  adicional=1.30;
        
        return sueldoBasico*adicional;
    }

    public double getMontoTotal() {
        return montoTotal;
    }
    
    
    
}

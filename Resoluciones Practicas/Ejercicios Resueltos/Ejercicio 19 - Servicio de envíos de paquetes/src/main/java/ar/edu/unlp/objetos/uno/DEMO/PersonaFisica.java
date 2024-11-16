package ar.edu.unlp.objetos.uno.DEMO;
public class PersonaFisica extends Cliente {
    private String dni; 
    
    public PersonaFisica(String nombre, String direccion,String dni)
    {
        super(nombre,direccion);
        this.dni = dni;
    }
    
    public String getDni()
    {
        return this.dni;
    }
    
    public void setDni(String unDni)
    {
        this.dni = unDni;
    }
    
    @Override 
    public double descuento ()
    {
        return 0.9;
    }
}

public class Vehiculo {
    private Conductor conductor; 
    private String descripcion;
    private int capacidad;
    private int anhoFabricacion;
    private double valorMercado;
    
    public Vehiculo(Conductor conductor,String descripcion,int capacidad, int anhoFabricacion,double valorMercado)
    {
        this.conductor=conductor;
        this.descripcion=descripcion;
        this.capacidad=capacidad;
        this.anhoFabricacion=anhoFabricacion;
        this.valorMercado=valorMercado;
    }
    
    public int getAnhoFabricacion()
    {
        return this.anhoFabricacion;
    }
    
    public int getCapacidad()
    {
        return this.capacidad;
    }
    
    public Conductor getConductor()
    {
        return this.conductor;
    }
}

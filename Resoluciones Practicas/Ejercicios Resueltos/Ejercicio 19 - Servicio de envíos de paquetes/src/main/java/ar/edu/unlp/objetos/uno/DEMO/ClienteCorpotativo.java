package ar.edu.unlp.objetos.uno.DEMO;
public class ClienteCorpotativo extends Cliente{
    private String cuit; 
    
    public ClienteCorpotativo(String nombre, String direccion,String cuit)
    {
        super(nombre,direccion);
        this.cuit = cuit;
    }
    
    public String getCuit()
    {
        return this.cuit;
    }
    
    public void setCuit (String unCuit)
    {
        this.cuit = unCuit;
    }
    
    @Override
    public double descuento ()
    {
        return 1;
    }   
}

package ar.edu.unlp.objetos.uno.DEMO;
public class ProductoImportado extends Producto{
    private String paisOrigen;
    
    public ProductoImportado(String nombre,double costoUnitario,String descripcion,String paisOrigen)
    {
        super(nombre, costoUnitario, descripcion);
        this.paisOrigen = paisOrigen;
    }
    
    @Override
    public double calcularImpuesto(double monto, int cantUnidades)
    {
        if (this.paisOrigenPerteneceMercosur() && cantUnidades > 50) return monto * 0.08; // %8
        else return monto * 0.21; // %21 {el else no es necesario, pero queda mas legible}
    }
    
    private boolean paisOrigenPerteneceMercosur()
    {
        return this.paisOrigen.equals("Brasil") || this.paisOrigen.equals("Paraguay")
                || this.paisOrigen.equals("Uruguay");
    }
}

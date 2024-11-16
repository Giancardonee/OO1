package ar.edu.unlp.objetos.uno.DEMO;
public class ProductoNacional extends Producto {
    
    public ProductoNacional (String nombre, double costoUnitario,String descripcion)
    {
        super(nombre, costoUnitario, descripcion);
    }
    
    @Override
    public double calcularImpuesto(double monto, int cantUnidades)
    {
        return cantUnidades <= 10 ? monto * 0.05 : 0;
    }
}

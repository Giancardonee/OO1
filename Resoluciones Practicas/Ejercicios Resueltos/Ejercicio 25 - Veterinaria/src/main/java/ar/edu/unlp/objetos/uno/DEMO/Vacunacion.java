package ar.edu.unlp.objetos.uno.DEMO;

public class Vacunacion extends ServicioMedico{
    private String nombreVacuna; 
    private double costoVacuna; 
    
    public Vacunacion (Mascota mascota,Veterinario veterinario, String nombreVacuna, double costoVacuna)
    {
        super(mascota, veterinario); 
        this.nombreVacuna=nombreVacuna;
        this.costoVacuna=costoVacuna;
    }
    
    public double getCostoVacuna()
    {
       return this.costoVacuna;
    }
    
    @Override
    public double calcularCosto()
    {
        double precioMaterialesDescartables = 500;
        double costo = this.getVeterinario().getHonorarios() + precioMaterialesDescartables + this.getCostoVacuna(); 
        if (this.caeDiaDomingo()) costo+= this.getCostoAdicionalDomingo();
        return costo;
    }
}

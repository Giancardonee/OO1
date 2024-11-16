package ar.edu.unlp.objetos.uno.DEMO;

import java.util.LinkedList;
import java.util.List;

public class ReporteDeConstruccion {
    private List<Pieza> listaPiezas;
    
    public ReporteDeConstruccion()
    {
        this.listaPiezas = new LinkedList<>();
    }
    
    public void agregarPieza (Pieza nuevaPieza)
    {
        this.listaPiezas.add(nuevaPieza);
    }
    
    public double getVolumenDeMaterial (String unMaterial)
    {
        return this.listaPiezas.stream()
                .filter(pieza -> pieza.getMaterial().equals(unMaterial))
                .mapToDouble(pieza -> pieza.getVolumen())
                .sum();
    }
    
    public double getSuperficieDeColor(String unColor)
    {
        return this.listaPiezas.stream()
                .filter(pieza -> pieza.getColor().equals(unColor))
                .mapToDouble(pieza -> pieza.getSuperficie())
                .sum();
    }
    
}

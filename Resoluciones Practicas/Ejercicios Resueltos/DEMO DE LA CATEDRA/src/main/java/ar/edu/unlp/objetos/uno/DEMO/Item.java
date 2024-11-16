/*
 * Copyright 2024 Usuario.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.unlp.objetos.uno.DEMO;

/**
 *
 * @author Usuario
 */
public class Item extends Presupuesto{
    private String detalle;
    private int cantidad;
    private double costoUnitario; 
   
    public Item( String detalle, int cant, double precioUnitario)
    {
        this.detalle = detalle; 
        this.cantidad = cant;
        this.costoUnitario = precioUnitario;
    }
    
    public double costo()
    {
        return (cantidad * costoUnitario);
    }
    
    public double getCostoUnitario ()
    {
        return this.costoUnitario;
    }
}

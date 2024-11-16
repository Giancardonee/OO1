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
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestCliente {
   
    Cliente cliente;
    ProductoNacional productoNacional;
    Pedido pedido;
    Item item;
   
   @BeforeEach
   void setUp()
   {
       cliente = new Cliente("Gianca", "Gianca@gmail.com");
       productoNacional = new ProductoNacional("Iphone 15", 100, "Es una locuira");
       item = new Item(productoNacional, 10);// producto . cantSolicitadas
       pedido = new Pedido();
       pedido.agregarItem(item);
   }
   
   // Testeamos los metodos: calcularCantidadSolicitada y calcularCostoTotalConPeriodo
   
   @Test 
   public void TestCalcularCantidadSolicitada() 
   {
       // no hay productos solicitados por el cliente. 
       assertEquals(0,cliente.calcularCantidadSolicitada(productoNacional));
       
       // agregqamos el pedido y calculamos la cantidad solicitada de ese producto por el cliente.
       cliente.agregarPedido(pedido);
       assertEquals(10,cliente.calcularCantidadSolicitada(productoNacional));
       
       // agregamos nuevamente el pedido, para tener mas cantidades solicitadas
       cliente.agregarPedido(pedido);
       assertEquals(20,cliente.calcularCantidadSolicitada(productoNacional));
   }
   
   @Test
   public void TestCalcularCostoTotalConPeriodo()
   {
	   // En este periodo no tiene ningun pedido realizado
	   LocalDate fechaInicio = LocalDate.of(2022, 10, 18);
	   LocalDate fechaFin = LocalDate.of(2023, 8, 28); 
	   assertEquals(0,cliente.calcularCostoTotalConPeriodo(fechaInicio, fechaFin));
	   
	   // En el periodo entre ayer y hoy, tenemos costos de productos. 
	   LocalDate fechaAyer = LocalDate.now().minusDays(1);
	   LocalDate fechaManhana = LocalDate.now().plusDays(1);
	   
	   cliente.agregarPedido(pedido);
	   cliente.agregarPedido(pedido);
	   assertEquals(2100,cliente.calcularCostoTotalConPeriodo(fechaAyer, fechaManhana)); 
   }

}

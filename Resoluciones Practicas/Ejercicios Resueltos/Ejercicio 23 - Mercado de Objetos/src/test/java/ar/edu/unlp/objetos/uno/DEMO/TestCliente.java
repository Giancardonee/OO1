package ar.edu.unlp.objetos.uno.DEMO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestCliente {
    Cliente cliente1; 
    Producto producto1; 
    MetodoDePago ef;
    MetodoDePago SeisCuotas;
    FormaDeRetiro expressDomicilio;
    FormaDeRetiro enSucursal;
    
    @BeforeEach
    public void setUp ()
    {
        cliente1 = new Cliente("Gianluca", "La Plata");
        producto1 = new Producto("Notebook Gamer i9", "Computadoras", 5000, 10);
        enSucursal = new RetiroEnSucursal();
        expressDomicilio = new RetiroExpressDomicilio("direccion1", "Direccion2", 0.5);
        SeisCuotas = new Pago6Cuotas();
        ef = new PagoEfectivo();
    }
    
    @Test
    public void TestCrearPedido()
    {
        assertEquals(10,producto1.getStock());
        assertFalse(cliente1.crearPedido(ef, enSucursal, producto1, 15)); // falso por que el stock actual es 10. 
        
        assertTrue(cliente1.crearPedido(SeisCuotas, expressDomicilio, producto1, 2));
        assertEquals(8,producto1.getStock());
    }
    
    @Test 
    public void TestCantProductosCategoria()
    {
        assertTrue(cliente1.crearPedido(SeisCuotas, expressDomicilio, producto1, 2));
        assertEquals(1,cliente1.cantidadDeProductosPedidosEnCategoria("Computadoras"));
        assertEquals(0,cliente1.cantidadDeProductosPedidosEnCategoria("Hogar"));
    }
    
    @Test
    public void TestMontoTotalPedido()
    {
        assertEquals(-1,cliente1.calcularMontoTotal(new Pedido(enSucursal, SeisCuotas, producto1, 5)),0.001); // el pedido no existe en el cliente
        
        Producto producto2 = new Producto("Pc GAMER", "Computadoras", 10000, 10);
        assertTrue(cliente1.crearPedido(SeisCuotas, enSucursal, producto2, 2));
        
        Pedido pedido = new Pedido(enSucursal, SeisCuotas, producto2, 2);
        assertEquals(27000,cliente1.calcularMontoTotal(pedido),0.0001); // 20.000 de las dos PC + 20% de cuotas: 4.000 + 3.000 por envio a sucursal = 27.000
    }
}


package ar.edu.unlp.objetos.uno.DEMO;
import static org.junit.jupiter.api.Assertions.*;  
import org.junit.jupiter.api.BeforeEach;          
import org.junit.jupiter.api.Test;   

/**
 *
 * @author Usuario
 */
public class TestClienteDeCorreo {
    
    private ClienteDeCorreo clienteCorreo;
    
    @BeforeEach
    public void setUpClass() {
        clienteCorreo = new ClienteDeCorreo(new Carpeta ("CARPETA"));
    }
    
    @Test
    public void TestEspacioOcupado ()
    {
        this.clienteCorreo.recibir(new Email ("AA", "B"));
        assertEquals(3,this.clienteCorreo.espacioOcuoado());
        this.clienteCorreo.recibir(new Email("a","b"));
        assertEquals(5,this.clienteCorreo.espacioOcuoado());
    }
    
    @Test
    public void TestBuscar ()
    {
        Email email = new Email ("Titulo","Hola como estas");
        this.clienteCorreo.recibir(email);
        assertEquals(email, this.clienteCorreo.buscar("Hola como estas"));
        
    }
    

}

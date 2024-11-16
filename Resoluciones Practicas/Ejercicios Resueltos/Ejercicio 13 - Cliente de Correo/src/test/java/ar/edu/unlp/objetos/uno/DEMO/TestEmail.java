
package ar.edu.unlp.objetos.uno.DEMO;


import static org.junit.jupiter.api.Assertions.*;  
import org.junit.jupiter.api.BeforeEach;          
import org.junit.jupiter.api.Test;   



/**
 *
 * @author Usuario
 */
public class TestEmail {
    
    private Email email; 
    
    @BeforeEach
    public void setUp() 
    {
        this.email = new Email ("UnTitulo", "Cuerpo");
    }
    
    @Test
    public void TestContiene ()
    {
        assertTrue(email.contiene("UnTitulo"));
    }
    
    
    @Test
    public void TestTamanho ()
    {
        assertEquals(14,this.email.tamanho());
        this.email.agregarArchivo(new Archivo ("Hola"));
        assertEquals(18,this.email.tamanho());
    }
  
}

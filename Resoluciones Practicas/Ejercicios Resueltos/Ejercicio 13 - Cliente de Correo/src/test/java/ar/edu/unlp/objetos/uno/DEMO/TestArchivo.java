package ar.edu.unlp.objetos.uno.DEMO;



import static org.junit.jupiter.api.Assertions.*;  
import org.junit.jupiter.api.BeforeEach;          
import org.junit.jupiter.api.Test;                 

public class TestArchivo {

    private Archivo archivo;

    @BeforeEach
    public void setUp() throws Exception {
        this.archivo = new Archivo("LanaDelRey");
    }

    @Test
    public void testTamaño() {
        assertEquals(10, this.archivo.tamanho());  
    }
}

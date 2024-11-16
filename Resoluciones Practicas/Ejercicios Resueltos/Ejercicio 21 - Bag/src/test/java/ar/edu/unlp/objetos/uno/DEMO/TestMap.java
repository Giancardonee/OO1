
package ar.edu.unlp.objetos.uno.DEMO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class TestMap {
     private  Map<String, Integer> map; 
     
     @Test
     void setUp()
     {
         map = new HashMap<>();
         
         // insertamos las tuplas: 
         map.put("Lionel Messi", 111);
         map.put("Gabriel Batistuta", 56);
         map.put("Kun Agüero", 42);    
         
        map.put("Gabriel Batistuta", 56);
        assertEquals(56, map.get("Gabriel Batistuta")); 
     }
     
     @Test 
     void TestVerificarValores()
     {
         assertEquals(111, map.get("Lionel Messi"));
         assertEquals(56, map.get("Gabriel Batistuta"));
         assertEquals(42, map.get("Kun Agüero"));
     }
     
     @Test
     void TestEliminarClave()
     {
         map.remove("Kun Agüero");
         assertFalse(map.containsKey("Kun Agüero"));
     }
     
     @Test
     void TestActualizarGoles()
     {
         map.put("Lionel Messi", 112);
         assertEquals(112, map.get("Lionel Messi"));
     }
     
     
     @Test
     void TestCalcularDeGoles()
     {
         int totalGoles = map.values().stream().mapToInt(Int -> Int.intValue()).sum();
          assertEquals(168, totalGoles); // 112 (Messi) + 56 (Batistuta) = 168
     }
     
     
     
     
     

    
}

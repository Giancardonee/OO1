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


import static org.junit.jupiter.api.Assertions.*;  
import org.junit.jupiter.api.BeforeEach;          
import org.junit.jupiter.api.Test;   

public class TestCarpeta {
    
private Carpeta carpetaConEmails;
	private Carpeta carpetaSinEmails;
	private Email email;
	private Email email2;

	@BeforeEach
	void setUp() throws Exception {
		this.carpetaConEmails = new Carpeta("TengoMails");
		this.carpetaSinEmails = new Carpeta("NoTengoMails");
		this.email= new Email ("SoyUnMail","12345Hola");
		this.email2= new Email ("Soy","12");
		
	}

	@Test
	void testAgregarYMoverCorreo() {
		this.carpetaConEmails.agregarEmail(email);
		assertEquals(1,this.carpetaConEmails.getCantidadEmails());
                this.carpetaConEmails.moverEmail(email, carpetaSinEmails);
                assertEquals(0,this.carpetaConEmails.getCantidadEmails());
                assertEquals(1,this.carpetaSinEmails.getCantidadEmails());
	}
	
	@Test
	void testBuscar() {
		this.carpetaConEmails.agregarEmail(email);
		assertEquals(this.email,this.carpetaConEmails.buscar("12345Hola"));
		assertNull(this.carpetaSinEmails.buscar("1234"));
	}
	
	@Test
	void testEspacioOcupado() {
		this.carpetaConEmails.agregarEmail(email);
		this.carpetaConEmails.agregarEmail(email2);
		assertEquals(23.00,this.carpetaConEmails.espacioOcupado());
		
	}

}

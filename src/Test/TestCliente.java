package Test;
import Clases.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestCliente {

	private Cliente juan;
	private ProductosCooperativaa arroz;
	private ProductoTradicionall leche;
	private Caja laCaja;
	
	@BeforeEach
	void setUp() {
		juan = new Cliente();
		arroz = new ProductosCooperativaa("Arroz", new Float(10));
		leche = new ProductoTradicionall("leche", new Float(20));
		laCaja = new Caja();
		
		//juan.addCarro(arroz);
		juan.addCarro(leche);
	}
	
	@Test
	void testCliente() {
		
		
		assertFalse(juan.getCarro().isEmpty());
		
	}
	
	@Test
	void testCaja() {
			
		assertEquals(new Float(20), laCaja.cobrar(juan));
		
	}

}

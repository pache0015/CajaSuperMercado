package Test;
import Clases.*;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.jupiter.api.Test;


class TestCliente {

	private Cliente juan;
	private ProductoCooperativa arroz;
	private ProductosTradicional leche;
	
	@Before
	void setUp() {
		juan = new Cliente();
		arroz = new ProductoCooperativa("Arroz", new Float(10));
		leche = new ProductosTradicional("leche", new Float(20));
	}
	
	@Test
	void testCliente() {
		juan.addCarro(arroz);
		juan.addCarro(leche);
		
		assert(juan.getCarro().isEmpty());
	}

}

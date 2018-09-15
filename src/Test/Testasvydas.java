package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import Clases.ProductoCooperativa;
import Clases.ProductosTradicional;

class Testasvydas {

	private Cliente juan;
	private ProductoCooperativa arroz;
	private ProductosTradicional leche;
	
	@Before
	void setUp() {
		juan = new Cliente();
		arroz = new ProductoCooperativa("Arroz", 10f);
		leche = new ProductosTradicional("leche", 20f);
	}
	
	@Test
	void testCliente() {
		juan.addCarro(arroz);
		juan.addCarro(leche);
	}

}

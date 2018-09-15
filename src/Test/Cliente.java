package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import Clases.*;
import org.junit.jupiter.api.Test;



class Cliente {

	private Cliente juan;
	private ProductoCooperativa arroz;
	
	@Before
	void setUp() {
		juan = new Cliente();
		arroz = new ProductoCooperativa("arroz", 10f);
	}
	
	@Test
	void testCliente() {
	
		juan.addCarro(arroz);
				
	}

}

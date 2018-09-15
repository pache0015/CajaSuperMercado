package Clases;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private List<Producto> carro;
	public Cliente(){
		List<Producto>  carro = new ArrayList<Producto>();
	}
	
	public void addCarro(Producto unProducto) {
		this.carro.add(unProducto);
	}
	public List<Producto> getCarro() {
		return this.carro;
	}
}

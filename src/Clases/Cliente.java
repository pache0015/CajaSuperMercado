package Clases;

import java.util.ArrayList;

public class Cliente {

	private ArrayList<Producto>  carro = new ArrayList<Producto>();
	public Cliente(){
		
	}
	
	public void setCarro(Producto unProducto) {
		this.carro.add(unProducto);
	}
	public ArrayList getCarro() {
		return this.carro;
	}
}

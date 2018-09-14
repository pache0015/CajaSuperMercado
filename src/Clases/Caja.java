package Clases;

public class Caja {
	private Float monto;
	public Caja() {
		
	}
	
	public void cobrar(Cliente unCliente) {
		for(Producto producto : unCliente.carro()) {
			monto += prodcuto.getPrecio();
		}
	}
}

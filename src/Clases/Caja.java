package Clases;

public class Caja {
	private Float monto = new Float(0);
	public Caja() {
		
	}
	
	public void cobrar(Cliente unCliente) {
		for(Producto producto : unCliente.getCarro()) {
			monto += producto.getPrecio();
			
		}
	}
}

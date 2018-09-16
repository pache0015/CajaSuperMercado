package Clases;

public class Caja {
	private Float monto;
	public Caja() {
		monto  = new Float(0);
	}
	
	public void cobrar(Cliente unCliente) {
		for(Producto producto : unCliente.getCarro()) {
			monto += producto.getPrecio();
			
		}
	}
}

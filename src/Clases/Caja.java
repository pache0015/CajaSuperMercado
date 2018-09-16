package Clases;

public class Caja {
	private Float monto;
	public Caja() {
		monto  = new Float(0);
	}
	
	public Float cobrar(Cliente unCliente) {
		for(Producto producto : unCliente.getCarro()) {
			monto += producto.getPrecio();
			
		}
		return monto;
	}
}

package Clases;

public class ProductoCooperativa extends Producto{

	private String nombre;
	private Float precio;
	
	public ProductoCooperativa(String unNombre, Float unPrecio) {
		this.setNombre(unNombre);
		this.setPrecio(unPrecio);
	}
	
	private void setNombre(String unNombre) {
		this.nombre =unNombre;
	}
	private void setPrecio(Float unPrecio) {
		this.precio = unPrecio;
	}
	
	
	public Float getPrecio() {
		return this.precio;
	}
}

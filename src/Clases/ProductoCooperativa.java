package Clases;

public class ProductoCooperativa extends Producto{

	private String nombre;
	private Float precio;
	
	public ProductoCooperativa(String unNombre, Float unPrecio) {
		this.setNombre(unNombre);
		this.setPrecio(unPrecio);
	}
	
	public void setNombre(String unNombre) {
		this.nombre =unNombre;
	}
	public void setPrecio(Float unPrecio) {
		this.precio = unPrecio;
	}
	public Float getPrecio() {
		return this.precio;
	}
}

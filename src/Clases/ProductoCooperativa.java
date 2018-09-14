package Clases;

public class ProductoCooperativa implements Producto{

	private String nombre;
	private Float precio;
	
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

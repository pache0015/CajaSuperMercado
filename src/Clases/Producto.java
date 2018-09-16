package Clases;

public abstract class Producto {
	protected String nombre;
	protected Float precio;
	
	
	
	protected void setNombre(String unNombre) {
		this.nombre =unNombre;
	}
	protected void setPrecio(Float unPrecio) {
		this.precio = unPrecio;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public Float getPrecio() {
		return this.precio;
	}
	
}

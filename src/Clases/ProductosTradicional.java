package Clases;

public class ProductosTradicional extends Producto {

	private String nombre;
	private Float precio;
	private Float descuento = 10f;
	
	public ProductosTradicional(String unNombre, Float unPrecio){
		this.setNombre(unNombre);
		this.setPrecio(unPrecio);
	}
	
	public void setNombre(String unNombre) {
		this.nombre =unNombre;
	}
	public void setPrecio(Float unPrecio) {
		this.precio = unPrecio;
	}
	public void setDescuento(Float unDescuento) {
		this.descuento = unDescuento;
	}
	private Float descuento(Float unPrecio) {
		return precio * this.descuento /100;
	}
	public Float getPrecio() {
		return this.precio - this.descuento(precio);
	}
}

package Clases;

public class ProductosTradicional extends Producto {

	private String nombre;
	private Float precio;
	private Float descuento = new Float(10);
	
	public ProductosTradicional(String unNombre, Float unPrecio){
		this.setNombre(unNombre);
		this.setPrecio(unPrecio);
	}
	
	private void setNombre(String unNombre) {
		this.nombre =unNombre;
	}
	private void setPrecio(Float unPrecio) {
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

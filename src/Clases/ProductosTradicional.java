package Clases;

public class ProductosTradicional extends Producto {


	private Float descuento = new Float(10);
	
	public ProductosTradicional(String unNombre, Float unPrecio){
		this.setNombre(unNombre);
		this.setPrecio(unPrecio);
	}
	
	public void setDescuento(Float unDescuento) {
		this.descuento = unDescuento;
	}
	private Float descuento(Float unPrecio) {
		return precio * this.descuento /100;
	}
	@Override
	public Float getPrecio() {
		return this.precio - this.descuento(precio);
	}
}

package Tienda_Online;

public class FamiliaProductos {
	private int _familiaId;
	private String _nombre;
	private Producto _productos;
	public CarritoCompras _unnamed_CarritoCompras_;
	public Producto _unnamed_Producto_;
	public Pedido _unnamed_Pedido_;

	public int getFamiliaId() {
		return this._familiaId;
	}

	public void setFamiliaId(int aFamiliaId) {
		this._familiaId = aFamiliaId;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public Producto getProductos() {
		return this._productos;
	}

	public void setProductos(Producto aProductos) {
		this._productos = aProductos;
	}
}
package Tienda_Online;

import java.util.Vector;
import Tienda_Online.FamiliaProductos;

public class Producto {
	public long _productoId;
	public String _nombre;
	public double _precio;
	public int _stock;
	public Vector<FamiliaProductos> _unnamed_FamiliaProductos_ = new Vector<FamiliaProductos>();

	public long getProductoId() {
		return this._productoId;
	}

	public void setProductoId(long aProductoId) {
		this._productoId = aProductoId;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public double getPrecio() {
		return this._precio;
	}

	public void setPrecio(double aPrecio) {
		this._precio = aPrecio;
	}

	public int getStock() {
		return this._stock;
	}

	public void setStock(int aStock) {
		this._stock = aStock;
	}
}
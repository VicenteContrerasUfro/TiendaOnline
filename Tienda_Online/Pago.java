package Tienda_Online;

import java.util.Vector;
import Tienda_Online.Pedido;

public class Pago {
	private long _productoId;
	private String _tipo;
	private double _precio;
	public Vector<Pedido> _unnamed_Pedido_ = new Vector<Pedido>();

	public long getProductoId() {
		return this._productoId;
	}

	public void setProductoId(long aProductoId) {
		this._productoId = aProductoId;
	}

	public String getTipo() {
		return this._tipo;
	}

	public void setTipo(String aTipo) {
		this._tipo = aTipo;
	}

	public double getPrecio() {
		return this._precio;
	}

	public void setPrecio(double aPrecio) {
		this._precio = aPrecio;
	}
}
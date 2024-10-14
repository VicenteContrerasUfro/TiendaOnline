package Tienda_Online;

import java.util.Vector;
import Tienda_Online.FamiliaProductos;

public class CarritoCompras {
	private long _carritoId;
	public Cuenta _unnamed_Cuenta_6;
	public Vector<FamiliaProductos> _unnamed_FamiliaProductos_ = new Vector<FamiliaProductos>();

	public long getCarritoId() {
		return this._carritoId;
	}

	public void setCarritoId(long aCarritoId) {
		this._carritoId = aCarritoId;
	}
}
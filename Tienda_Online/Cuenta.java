package Tienda_Online;

import java.util.Vector;
import Tienda_Online.Pedido;

public class Cuenta {
	private long _userId;
	private String _usuario;
	private String _clave;
	private String _email;
	public Cliente _unnamed_Cliente_;
	public Vector<Pedido> _unnamed_Pedido_ = new Vector<Pedido>();
	public CarritoCompras _unnamed_CarritoCompras_17;

	public String getUsuario() {
		return this._usuario;
	}
}
package Tienda_Online;

public class Pedido {
	private long _pedidoId;
	private date _fecha;
	private EstadoPedido _estado_pedido;
	public FamiliaProductos _unnamed_FamiliaProductos_;
	public Pago _unnamed_Pago_;
	public Cuenta _unnamed_Cuenta_;

	public long getPedidoId() {
		return this._pedidoId;
	}

	public void setPedidoId(long aPedidoId) {
		this._pedidoId = aPedidoId;
	}

	public date getFecha() {
		return this._fecha;
	}

	public void setFecha(date aFecha) {
		this._fecha = aFecha;
	}

	public EstadoPedido getEstado_pedido() {
		return this._estado_pedido;
	}

	public void setEstado_pedido(EstadoPedido aEstado_pedido) {
		this._estado_pedido = aEstado_pedido;
	}
}
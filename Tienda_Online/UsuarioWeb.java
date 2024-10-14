package Tienda_Online;

public class UsuarioWeb {
	private long _userId;
	private String _usuario;
	private String _clave;
	private EstadoUsuarioWeb _estado;
	public Cliente _unnamed_Cliente_;

	public void activar() {
		throw new UnsupportedOperationException();
	}

	public void bloquearTemporalmente() {
		throw new UnsupportedOperationException();
	}

	public void prohibir() {
		throw new UnsupportedOperationException();
	}

	public void setEstado(EstadoUsuarioWeb aEstado) {
		this._estado = aEstado;
	}

	public EstadoUsuarioWeb getEstado() {
		return this._estado;
	}
}
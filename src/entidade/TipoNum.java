package entidade;

public class TipoNum<T> { //Classe gen�rica.
	private int id;
	private T valor; //Campo gen�rico.
	public TipoNum (int id, T valor) { //Par�metro gen�rico.
		setId(id);
		setValor(valor);
	}
	public int getId() { return id; }
	public T getValor() { return valor; } //valor de retorno gen�rico.
	public void setId (int id) {
		if (id < 0) throw new RuntimeException("id<0");
		this.id = id;
	}
	public void setValor (T valor) { //Par�metro gen�rico.
		if (valor==null) throw new RuntimeException("valor==null");
		this.valor = valor;
	}
	public void troca (TipoNum<T> p) { //Par�metro gen�rico compat�vel.
		T valorAux = p.valor; //Vari�vel local gen�rica.
		p.valor = valor;
		valor = valorAux;
	}
}

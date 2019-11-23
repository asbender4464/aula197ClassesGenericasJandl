package entidade;

public class TipoNum<T> { //Classe genérica.
	private int id;
	private T valor; //Campo genérico.
	public TipoNum (int id, T valor) { //Parâmetro genérico.
		setId(id);
		setValor(valor);
	}
	public int getId() { return id; }
	public T getValor() { return valor; } //valor de retorno genérico.
	public void setId (int id) {
		if (id < 0) throw new RuntimeException("id<0");
		this.id = id;
	}
	public void setValor (T valor) { //Parâmetro genérico.
		if (valor==null) throw new RuntimeException("valor==null");
		this.valor = valor;
	}
	public void troca (TipoNum<T> p) { //Parâmetro genérico compatível.
		T valorAux = p.valor; //Variável local genérica.
		p.valor = valor;
		valor = valorAux;
	}
}

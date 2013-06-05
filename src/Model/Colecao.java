package Model;

public class Colecao extends Livro {
	
	private String nomeColecao;
	
	public Colecao(String n, String a, String d, String c, String num) {
		super(n, a, d, num);
		this.setNomeColecao(c);
	}

	public String getNomeColecao() {
		return nomeColecao;
	}

	public void setNomeColecao(String nomeColecao) {
		this.nomeColecao = nomeColecao;
	}
	
	public int numdeLivros(int livros)
	{
		return livros;
	}
	
}

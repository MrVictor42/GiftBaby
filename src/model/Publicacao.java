package model;

public class Publicacao {
	
	public String nome;
	public String tam;
	public Double preco;
	
	public Publicacao(String nome,String tam,Double preco) {
		setNome(nome);
		setTam(tam);
		setPreco(preco);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTam() {
		return tam;
	}
	public void setTam(String tam) {
		this.tam = tam;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
}

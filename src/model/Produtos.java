package model;

import org.apache.tomcat.util.http.fileupload.FileItem;

public class Produtos {
	
	private int idPublicacao;
	private String nome;
	private String tam;
	private Double preco;
	private String descricao;
	private FileItem imagemFile;
	private byte[] imagemByte;

	public Produtos () {
		
	}
	
	public Produtos(int idPublicacao,String nome,String tam,Double preco,String descricao,FileItem imagemFile,byte[] imagemByte) {
		setIdPublicacao(idPublicacao);
		setNome(nome);
		setTam(tam);
		setPreco(preco);
		setDescricao(descricao);
		setImagemFile(imagemFile);
		setImagemByte(imagemByte);
	}
	
	public byte[] getImagemByte() {
		return imagemByte;
	}

	public void setImagemByte(byte[] imagemByte) {
		this.imagemByte = imagemByte;
	}

	public int getIdPublicacao() {
		return idPublicacao;
	}

	public void setIdPublicacao(int idPublicacao) {
		this.idPublicacao = idPublicacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public FileItem getImagemFile() {
		return imagemFile;
	}

	public void setImagemFile(FileItem imagemFile) {
		this.imagemFile = imagemFile;
	}
	
	
}

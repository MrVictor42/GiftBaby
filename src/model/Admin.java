package model;


public class Admin {
	
	private String id;
	private String nome;
	private String senha;
	private String enderecoLoja;
	private String email;
	private String telefone;

	public Admin () {
		
	}
	
	public Admin (String id,String nome,String senha,String enderecoLoja,String email,String telefone) {
		setId(id);
		setNome(nome);
		setSenha(senha);
		setEnderecoLoja(enderecoLoja);
		setEmail(email);
		setTelefone(telefone);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getEnderecoLoja() {
		return enderecoLoja;
	}

	public void setEnderecoLoja(String enderecoLoja) {
		this.enderecoLoja = enderecoLoja;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

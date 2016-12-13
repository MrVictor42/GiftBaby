package model;


public class Admin {
	
	public Integer id;
	public String nome;
	public String senha;
	public String enderecoLoja;
	public String email;
	public String telefone;

	public Admin () {
		
	}
	
	public Admin (Integer id,String nome,String senha,String enderecoLoja,String email,String telefone) {
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
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

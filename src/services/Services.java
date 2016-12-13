package services;

import java.util.ArrayList;

import model.Admin;
import model.Publicacao;

public class Services {
	
	public static ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();
	public static ArrayList<Admin> admins = new ArrayList<Admin>();
	
	public static boolean createAdmin (Integer id,String nome,String senha,String enderecoLoja,String email,String telefone) {
		
		boolean valid = true;
		Admin admin = new Admin(id,nome,senha,enderecoLoja,email,telefone);
		
		if (admin.getNome() != null && admin.getSenha() != null
			&& admin.getEnderecoLoja() != null && admin.getEmail() !=null
			&& admin.getTelefone() != null) {
			admins.add(admin);
			
			valid = true;
		} else {
			valid = false;
		}
		return valid;
	}
}

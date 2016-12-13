package services;

import java.util.ArrayList;

import dao.AdminDao;
import model.Admin;
import model.Publicacao;

public class Services {
	
	public static ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();
	public static ArrayList<Admin> admins = new ArrayList<Admin>();
	
	public static void createAdmin (String id,String nome,String senha,String enderecoLoja,String email,String telefone) {
		
		Admin admin = new Admin(id,nome,senha,enderecoLoja,email,telefone);
		System.out.println("CREATE ADMIN");
		if (admin.getNome() != null && admin.getSenha() != null
			&& admin.getEnderecoLoja() != null && admin.getEmail() !=null
			&& admin.getTelefone() != null) {
			admins.add(admin);
			AdminDao.insertAdmin(admin);
		}
	}
}

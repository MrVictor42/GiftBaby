package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Admin;
import model.Publicacao;

public class AdminDao extends ConnectionFactory{
	
	private static Connection connection;
	
	public AdminDao () {
		connection = ConnectionFactory.getConexao();
	}
	
	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		AdminDao.connection = connection;
	}

	public static void insertAdmin(Admin admin) {
		
		try {
			String query = "INSERT INTO Admin(id,nome,endereco,email,telefone,senha) VALUES (?,?,?,?,?,?);";
			if (connection == null){
				AdminDao adminDao = new AdminDao();
				connection = adminDao.getConexao();
			}
			PreparedStatement pstm = connection.prepareStatement(query);
			pstm.setString(1, admin.getId());
			pstm.setString(2, admin.getNome());
			pstm.setString(3, admin.getEnderecoLoja());
			pstm.setString(4, admin.getEmail());
			pstm.setString(5, admin.getTelefone());
			pstm.setString(6, admin.getSenha());
			
			pstm.executeUpdate();
			pstm.close();	
			System.out.println("Admin Adicionado com sucesso");
				
		} catch (SQLException e) {
			System.out.println("Erro ao adicionar Admin");
			e.printStackTrace();
		}
	}
	
	public static void updateStudent(Admin admin) {
		
		
	}
}

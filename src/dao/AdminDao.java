package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Admin;

public class AdminDao extends ConnectionFactory {

	private static Connection connection;

	public AdminDao() {
		connection = ConnectionFactory.getConexaoMySQL();
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
			if (connection == null) {
				connection = AdminDao.getConexaoMySQL();
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

	public static void editarAdmin(Admin admin,String id) {
		try {
			connection = AdminDao.getConexaoMySQL();
			PreparedStatement pstm = connection.prepareStatement(
					"UPDATE Admin SET nome=?, endereco=?, email=?, telefone=?, senha=? WHERE id=?");
			pstm.setString(1, admin.getNome());
			pstm.setString(2, admin.getEnderecoLoja());
			pstm.setString(3, admin.getEmail());
			pstm.setString(4, admin.getTelefone());
			pstm.setString(5, admin.getSenha());
			pstm.setString(6, id);

			pstm.execute();
			pstm.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Admin> listarAdmin() {
		List<Admin> lista = new ArrayList<Admin>();
		try {
			connection = AdminDao.getConexaoMySQL();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Admin");
			while (resultSet.next()) {
				Admin admin = new Admin();
				admin.setId(resultSet.getString("id"));
				admin.setNome(resultSet.getString("nome"));
				admin.setEnderecoLoja(resultSet.getString("endereco"));
				admin.setEmail(resultSet.getString("email"));
				admin.setTelefone(resultSet.getString("telefone"));
				admin.setSenha(resultSet.getString("senha"));
				lista.add(admin);
			}
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}

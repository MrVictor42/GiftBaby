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
			String query = "INSERT INTO Admin(registration,name,dateOfBirth,letterClass,room,turn,year,modalityCourse,scholarship) VALUES (?,?,?,?,?,?,?,?,?);";
			if (connection == null){
				AdminDao adminDao = new AdminDao();
				connection = adminDao.getConexao();
			}
			PreparedStatement pstm = connection.prepareStatement(query);
			pstm.setString(1, student.getRegistration());
			pstm.setString(2, student.getName());
			pstm.setString(3, student.getDataOfBirth());
			pstm.setString(4, student.getLetterClass());
			pstm.setString(5, student.getRoom());
			pstm.setString(6, student.getTurn());
			pstm.setString(7, student.getYear());
			pstm.setString(8, student.getModalityCourse());
			pstm.setString(9, student.getScholarship());
			pstm.executeUpdate();
			pstm.close();	
			System.out.println("Aluno Adicionado com sucesso");
				
		} catch (SQLException e) {
			System.out.println("Erro ao adicionar aluno");
			e.printStackTrace();
		}
	}
	
	public static void updateStudent(Student student) {
		
		
	}
}

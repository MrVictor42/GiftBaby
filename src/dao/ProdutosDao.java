package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Produtos;

public class ProdutosDao extends ConnectionFactory {

	private static Connection connection;

	public ProdutosDao() {
		connection = ConnectionFactory.getConexaoMySQL();
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		ProdutosDao.connection = connection;
	}

	public static void inserirProduto(Produtos produtos) {

		try {
			String query = "INSERT INTO Produtos(nomeProduto,tamanho,preco,descricao,foto) VALUES (?,?,?,?,?);";
			if (connection == null) {
				connection = ProdutosDao.getConexaoMySQL();
			}
			PreparedStatement pstm = connection.prepareStatement(query);
			pstm.setString(1, produtos.getNome());
			pstm.setString(2, produtos.getTam());
			pstm.setDouble(3, produtos.getPreco());
			pstm.setString(4, produtos.getDescricao());
			pstm.setString(5, produtos.getImagem());

			pstm.executeUpdate();
			pstm.close();
			System.out.println("Produto Adicionado com sucesso");

		} catch (SQLException e) {
			System.out.println("Erro ao adicionar Produto");
			e.printStackTrace();
		}
	}

	public static void editarProduto(Produtos produtos,String id) {
		try {
			connection = ProdutosDao.getConexaoMySQL();
			
			PreparedStatement pstm = connection.prepareStatement(
					"UPDATE Produtos nomeProduto=?, tamanho=?, preco=?, descricao=?, foto=? WHERE idPublicacao=?");
			pstm.setString(1, produtos.getNome());
			pstm.setString(2, produtos.getTam());
			pstm.setDouble(3, produtos.getPreco());
			pstm.setString(4, produtos.getDescricao());
			pstm.setString(5, produtos.getImagem());

			pstm.setString(6, id);

			pstm.execute();
			pstm.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Produtos> listarProdutos() {
		List<Produtos> lista = new ArrayList<Produtos>();
		try {
			connection = ProdutosDao.getConexaoMySQL();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Produtos");
			while (resultSet.next()) {
				Produtos produtos = new Produtos();
				produtos.setIdPublicacao(resultSet.getInt("idPublicacao"));
				produtos.setNome(resultSet.getString("nomeProduto"));
				produtos.setTam(resultSet.getString("tamanho"));
				produtos.setPreco(resultSet.getDouble("preco"));
				produtos.setDescricao(resultSet.getString("descricao"));
				produtos.setImagem(resultSet.getString("foto"));
				lista.add(produtos);
			}
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}

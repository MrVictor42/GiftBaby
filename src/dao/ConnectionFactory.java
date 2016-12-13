package dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	static String status = "";
	private static Connection connection;
	
	public static synchronized Connection getConexao() {
		
		if (connection != null) 
			return connection;
		
		Properties properties = new Properties();
		InputStream inStream = ConnectionFactory.class.getClassLoader().getResourceAsStream("/db.properties");
		
		try {
			
			properties.load(inStream);
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");;
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			Class.forName(driver);
			connection = DriverManager.getConnection(url,user, password);			
			status = "Connection opened";
			
		} catch (IOException error) {
			status = "Connection not found";
			System.out.println(status);
		} catch (ClassNotFoundException error) {
			status = "Connection not found";
			error.printStackTrace();
		} catch (SQLException error) {
			status = "Connection not found";
			error.printStackTrace();
		}
		System.out.println(status);
		return connection;
	}
	
	public static void closeConnection (Connection toBeClosed) {
		if (toBeClosed == null){
			return;
		} try {
			toBeClosed.close();
		} catch (SQLException error) {
			error.printStackTrace();
		}
	}
}

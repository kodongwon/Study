package spring_app05_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {

	private static MysqlConnection mc = null;
	private static Connection conn;
	
	final String DRIVER = "com.mysql.jdbc.Driver";
	final String URL    = "jdbc:mysql://localhost:3306/testdb?usessl=false";
	final String USER   = "scott";
	final String PASSWORD = "tiger";
	
private MysqlConnection() {}
	
	public static MysqlConnection getInstance() {
		if(mc == null) mc = new MysqlConnection();
		return mc;
	}
	
	public Connection getConnection() {
		if(conn == null) {
			try {
				Class.forName(DRIVER);
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
}

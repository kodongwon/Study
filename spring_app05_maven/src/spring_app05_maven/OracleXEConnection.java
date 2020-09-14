package spring_app05_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleXEConnection {

	private static OracleXEConnection xe = null;
	private static Connection conn;
	
	final String DRIVER = "orcle.jdbc.driver.OracleDriver";
	final String URL    = "jdbc:orcl:thin:@localhost:1521:orcl";
	final String USER   = "scott";
	final String PASSWORD = "tiger";
	
	private OracleXEConnection() {}
	
	public static OracleXEConnection getInstance() {
		if(xe == null) xe = new OracleXEConnection();
		return xe;
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

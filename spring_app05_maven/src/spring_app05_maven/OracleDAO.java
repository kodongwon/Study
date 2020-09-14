package spring_app05_maven;

import java.sql.Connection;

public class OracleDAO implements CommonDAO{

	@Override
	public Connection connect() {
		// TODO Auto-generated method stub
		return OracleXEConnection.getInstance().getConnection();
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		System.out.println("데이터 잘 가져옴");
	}

}

package spring_app05_maven;

import java.sql.Connection;

public class MysqlDAO implements CommonDAO{

	@Override
	public Connection connect() {
		// TODO Auto-generated method stub
		return MysqlConnection.getInstance().getConnection();
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		System.out.println("전부 다 출력 됨");
	}

}

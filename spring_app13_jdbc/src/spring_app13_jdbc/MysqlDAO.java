package spring_app13_jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MysqlDAO implements Dao{

	private JdbcTemplate jdbcTemplate;
	StringBuffer sb = new StringBuffer();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<DeptDTO> selectAll() {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("select * from dept");
		
		RowMapper<DeptDTO> rm = new RowMapper<DeptDTO>() {

			@Override
			public DeptDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
//				DeptDTO dto = new DeptDTO();
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				
//				dto.setDeptno(deptno);
//				dto.setDname(dname);
//				dto.setLoc(loc);
//				
//				return null;
				return new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			
		};
			
		jdbcTemplate.query(sb.toString(), rm);
		return null;
	}

	@Override
	public DeptDTO selectOne(int no) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("select * from dept ");
		sb.append("where deptno = ? ");
		
		RowMapper<DeptDTO> rm = new RowMapper<DeptDTO>() {

			@Override
			public DeptDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		};
		DeptDTO dto = jdbcTemplate.queryForObject(sb.toString(), rm,no);
		return dto;
	}

	@Override
	public void insertOne(DeptDTO dto) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("insert into dept ");
		sb.append("values (?, ?, ?) ");
		
		int result = jdbcTemplate.update(sb.toString(), dto.getDeptno(), dto.getDname(), dto.getLoc());
		
		System.out.println("insert 贸府搬苞 : " + result);
	}

	@Override
	public void updateOne(DeptDTO dto) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("update dept ");
		sb.append("set dname = ? , loc = ? ");
		sb.append("where deptno = ? ");
		
		int result = jdbcTemplate.update(sb.toString(), dto.getDname(), dto.getLoc(), dto.getDeptno());
		System.out.println("update 贸府搬苞  " + result);
	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("delete from dept ");
		sb.append("where deptno = ? ");
		
		int result = jdbcTemplate.update(sb.toString(), no);
		System.out.println("delete 贸府搬苞 : " + result);
	}

}

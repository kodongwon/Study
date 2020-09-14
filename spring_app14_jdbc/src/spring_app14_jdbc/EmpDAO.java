package spring_app14_jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDAO implements Dao{

	private JdbcTemplate jdbcTemplate;
	StringBuffer sb = new StringBuffer();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<EmpDTO> selectAll() {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("select * from emp");
		
		RowMapper<EmpDTO> rm = new RowMapper<EmpDTO>() {

			@Override
			public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

				return new EmpDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
			}
			
		};
			
		jdbcTemplate.query(sb.toString(), rm);
		return null;
	}

	@Override
	public EmpDTO selectOne(int no) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("select * from emp ");
		sb.append("where empno = ? ");
		
		RowMapper<EmpDTO> rm = new RowMapper<EmpDTO>() {

			@Override
			public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new EmpDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
			}
		};
		EmpDTO dto = jdbcTemplate.queryForObject(sb.toString(), rm,no);
		return dto;
	}

	@Override
	public void insertOne(EmpDTO dto) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("insert into emp ");
		sb.append("values (?, ?, ?, ?, curdate(), ?, ?, ?) ");
		
		int result = jdbcTemplate.update(sb.toString(), dto.getEmpno(), dto.getEname(), dto.getJob(), dto.getMgr(), dto.getSal(), dto.getComm(), dto.getDeptno());
		
		System.out.println("insert 贸府搬苞 : " + result);
	}

	@Override
	public void updateOne(EmpDTO dto) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("update emp ");
		sb.append("set ename = ? , sal = ?, deptno = ? ");
		sb.append("where empno = ? ");
		
		int result = jdbcTemplate.update(sb.toString(), dto.getEname(), dto.getSal(), dto.getDeptno(), dto.getEmpno());
		System.out.println("update 贸府搬苞  " + result);
	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("delete from emp ");
		sb.append("where empno = ? ");
		
		int result = jdbcTemplate.update(sb.toString(), no);
		System.out.println("delete 贸府搬苞 : " + result);
	}

}

package spring_app16_mybatis_to_db;

import java.util.List;

public interface Dao {
	public List<EmpDTO> selectAll();
	public EmpDTO selectOne(int no);
	public void insertOne(EmpDTO dto);
	public void updateOne(EmpDTO dto);
	public void deleteOne(int no);
}

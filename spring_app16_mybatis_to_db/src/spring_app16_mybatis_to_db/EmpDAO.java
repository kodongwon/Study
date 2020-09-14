package spring_app16_mybatis_to_db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class EmpDAO implements Dao{

	ConnectionManager cm;
	
	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}
	@Override
	public List<EmpDTO> selectAll() {
		// TODO Auto-generated method stub
		
//		SqlSessionFactory factory = cm.getFactory();
//		SqlSession ss = factory.openSession(true);
//		
//		List<DeptDTO> list = ss.selectList("selectAll");
//		return list;
		
		return cm.getFactory().openSession(true).selectList("selectAll");
	}

	@Override
	public EmpDTO selectOne(int no) {
		// TODO Auto-generated method stub
		return cm.getFactory().openSession(true).selectOne("selectOneByEmpno", no);
	}

	@Override
	public void insertOne(EmpDTO dto) {
		// TODO Auto-generated method stub
		cm.getFactory().openSession(true).insert("insertOneByEmp", dto);
	}

	@Override
	public void updateOne(EmpDTO dto) {
		// TODO Auto-generated method stub
		cm.getFactory().openSession(true).update("updateOneByEmp", dto);
	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		cm.getFactory().openSession(true).delete("deleteOneByEmp", no);
	}

}

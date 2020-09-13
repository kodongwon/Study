package execute;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.DeptVO;

public class DeptMain {
	public static void main(String[] args) {
		
		Reader r = null;
		SqlSession ss = null;
		
		try {
			r = Resources.getResourceAsReader("config/MapConfig.xml");
			
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			
			SqlSessionFactory factory = ssfb.build(r);
			
			r.close();
			
			ss = factory.openSession(true);
			
			List<DeptVO> list = ss.selectList("selectAllDept");
			
//			for(DeptVO vo : list) {
//				System.out.println(vo.getDeptno()+"\t"+vo.getDname()+"\t"+vo.getLoc());
//			}
			
//			Object obj = ss.selectOne("selectOneByDeptno", 10);
//			DeptVO vo1 = (DeptVO)obj;
//			System.out.println(vo1.getDeptno()+"\t"+vo1.getDname()+"\t"+vo1.getLoc());
			
			System.out.println("--------------------");
			
//			DeptVO vo2 = new DeptVO();
//			vo2.setDeptno(60);
//			vo2.setDname("QA");
//			vo2.setLoc("집근처");
//			ss.insert("insertOneDept", vo2);
			
			System.out.println("--------------------");
			
//			DeptVO vo3 = new DeptVO();
//			vo3.setDeptno(60);
//			vo3.setDname("HR");
//			vo3.setLoc("재택근무");
			
//			ss.update("updateOneDept",vo3);
			
			ss.delete("deleteOneDept", 60);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

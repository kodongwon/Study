package execute;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.EmpVO;


public class EmpMain {
	public static void main(String[] args) {
		
		Reader r = null;
		SqlSession ss = null;
		
		try {
			r = Resources.getResourceAsReader("config/MapConfig.xml");
			
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			
			SqlSessionFactory factory = ssfb.build(r);
			
			r.close();
			
			ss = factory.openSession(true);
			
//			List<EmpVO> list = ss.selectList("selectAllByEmp");
//			
//			for(EmpVO vo : list) {
//				System.out.println(vo.getEmpno()+"\t"+vo.getEname()+"\t"+vo.getJob()+"\t"+vo.getMgr()
//									+"\t"+vo.getHiredate()+"\t"+vo.getSal()+"\t"+vo.getComm()+"\t"+vo.getDeptno());
//			}
			
//			Object obj = ss.selectOne("selectOneByEmpno", 7369);
//			EmpVO vo1 = (EmpVO)obj;
//			System.out.println(vo1.getEmpno()+"\t"+vo1.getEname()+"\t"+vo1.getJob()+"\t"+vo1.getMgr()
//			+"\t"+vo1.getHiredate()+"\t"+vo1.getSal()+"\t"+vo1.getComm()+"\t"+vo1.getDeptno());
			
			System.out.println("--------------------");
			
//			EmpVO vo2 = new EmpVO();
//			vo2.setEmpno(empno);
//			vo2.setEname(ename);
//			vo2.setJob(job);
//			vo2.setMgr(mgr);
//			vo2.setHiredate(hiredate);
//			vo2.setSal(sal);
//			vo2.setComm(comm);
//			vo2.setDeptno(deptno);
//			ss.insert("insertOneEmp", vo2);
			System.out.println("--------------------");
			
//			EmpVO vo3 = new EmpVO();
//			vo3.setEmpno(empno);
//			vo3.setEname(ename);
//			vo3.setDeptno(deptno);	
//			ss.update("updateOneEmp",vo3);
			
			System.out.println("--------------------");
			
			ss.delete("deleteOneEmp", 60);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

package spring_app14_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TestMain {
	public static void main(String[] args) {
		
ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		Dao d = context.getBean("dao", Dao.class);
		
		EmpDTO dto1 = d.selectOne(1111);
		System.out.println(dto1.getEmpno() + "/" + dto1.getEname() + "/" + dto1.getJob() +"/" + dto1.getMgr()
							+ "/" + dto1.getHiredate() + "/" + dto1.getSal() + "/" + dto1.getComm() + "/" + dto1.getDeptno());
		
//		System.out.println("-------------------------");
//		EmpDTO dto2 = new EmpDTO(1111, "고동원", "개발", 9999, "" , 8000, 200, 30);
//		d.insertOne(dto2);
		
//		System.out.println("-------------------------");
//		EmpDTO dto3 = new EmpDTO(1111, "홍길동", 3333, 20);
//		d.updateOne(dto3);
		
//		System.out.println("------------------------");
//		d.deleteOne(1111);
	}
}

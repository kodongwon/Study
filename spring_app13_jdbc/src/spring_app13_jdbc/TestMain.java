package spring_app13_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		Dao d = context.getBean("dao", Dao.class);
		
		DeptDTO dto1 = d.selectOne(60);
		System.out.println(dto1.getDeptno() + "/" + dto1.getDname() + "/" +dto1.getLoc());
		
//		System.out.println("-------------------------");
//		DeptDTO dto2 = new DeptDTO(60, "영업", "체크");
//		d.insertOne(dto2);
		
//		System.out.println("-------------------------");
//		DeptDTO dto3 = new DeptDTO(60, "qa", "유럽");
//		d.updateOne(dto3);
		
		System.out.println("------------------------");
		d.deleteOne(60);
	}
}

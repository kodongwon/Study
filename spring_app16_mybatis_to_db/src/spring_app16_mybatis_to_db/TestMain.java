package spring_app16_mybatis_to_db;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		Dao d = context.getBean("dao", Dao.class);
		
		List<EmpDTO> list = d.selectAll();
		for (EmpDTO dto : list) {
			System.out.println(dto.getEmpno() + "\t" + dto.getEname() +"\t" +dto.getSal() + "\t" + dto.getDeptno());
		}
	}
}

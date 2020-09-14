package kr.co.goott.app.mybatis;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		Dao d = context.getBean("dao", Dao.class);
		
		List<DeptDTO> list = d.selectAll();
		for (DeptDTO dto : list) {
			System.out.println(dto.getDpetno() + "\t" + dto.getDname() +"\t" +dto.getLoc());
		}
	}
}

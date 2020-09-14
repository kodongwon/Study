package spring_app05_maven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/connection.xml"));
		
//		CommonDAO dao = new OracleDAO();
//		CommonDAO dao2 = new MysqlDAO();
		
		CommonDAO conn = factory.getBean("oracle", CommonDAO.class);
		
		System.out.println("conn : " + conn);
		
		conn.connect();
		conn.selectAll();
	}
}

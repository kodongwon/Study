package kr.co.goott.www;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestMain {

	public static void main(String[] args) {
		
//		Gun ch0 = new Gun();
//		
//		Police p1 = new Police(ch0, 150);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		
		Character ch1 = context.getBean("p1", Character.class);
		ch1.attack("µµµÏ½§");
		
	}
}

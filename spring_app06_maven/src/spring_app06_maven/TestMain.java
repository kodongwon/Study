package spring_app06_maven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {

	public static void main(String[] args) {
		
//		Gun ch0 = new Gun();
//		
//		Police p1 = new Police(ch0, 150);
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		Character ch1 = factory.getBean("p1", Character.class);
		ch1.attack("µµµÏ½§");
	}
}

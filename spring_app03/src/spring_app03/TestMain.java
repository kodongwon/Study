package spring_app03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class TestMain {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/printer.xml"));
		
//		Object obj =factory.getBean("dot");
//		DotPrinter dot = (DotPrinter)obj;
//		dot.printing("금요일");
		
		Printer print = factory.getBean("dot", Printer.class);
		print.printing("오늘은 목요일");

	}
}

package spring_app11_JavaConf;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");

		BeanFactory factory = new AnnotationConfigApplicationContext(JavaConf.class);
		
		Monitor mt = factory.getBean("sm", Monitor.class);
		
		mt.showMonitor();
	}
}

package spring_app10_anno;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
//		Phone phone = new SmartPhone();
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
//		BeanFactory facotry = new XmlBeanFactory(new ClassPathResource("app.xml"));
//		
//		Phone phone = facotry.getBean("sp", Phone.class);

		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		
		Phone phone = context.getBean("sp",Phone.class);
		phone.call("010-1111-2222");
		phone.sendMsg("쉬는 시간 입니다.");
	}
}

package spring_app02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {

	public static void main(String[] args) {
	
//		Beverage b = new CoffeeImple("�ʰ����");
//		b.drink("ȫ�浿");
		
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		Object obj =factory.getBean("b");
		Object obj2 =factory.getBean("b2");
//		Beverage b = (Beverage)obj;
//		b.drink("ȫ�浿");
		MachineCoffee mc1 = new MachineCoffee();
		MachineCoffee mc2 = new MachineCoffee();
		
		System.out.println(mc1 + " : " + mc2);
	}
}

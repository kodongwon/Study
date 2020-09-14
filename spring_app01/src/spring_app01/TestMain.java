package spring_app01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
//		Hellokr hk = new Hellokr();
//		hk.sayHello("ȫ�浿");
//		1. ������ �����̳ʸ� ���� �о���̱�
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
//		2. bean ����
		Object obj = factory.getBean("cn"); // xml���Ͽ� ����� bean�� id�� ã�ƿ�
		
		Hello h = (Hello) obj;
		h.sayHello("ȫ�浿");
		
	}
}

package spring_app01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
//		Hellokr hk = new Hellokr();
//		hk.sayHello("홍길동");
//		1. 스프링 컨테이너를 통해 읽어들이기
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
//		2. bean 구현
		Object obj = factory.getBean("cn"); // xml파일에 등록한 bean의 id로 찾아옴
		
		Hello h = (Hello) obj;
		h.sayHello("홍길동");
		
	}
}

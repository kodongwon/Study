package spring_app10_anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConf {
	@Bean
	public PhoneOS phoneOS() {
		PhoneOS po = new PhoneOS();
		po.setName("¾ÆÀÌÆù");
		po.setVersion("IOS 13");
		return po;
	}
	@Bean(name="p")
	public SmartPhone smartPhone() {
		SmartPhone sp = new SmartPhone();
		sp.setOs(phoneOS());
		return sp;
	}
}
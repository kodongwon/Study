package spring_app11_JavaConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConf {

	@Bean
	public Sender sender() {
		return new Sender();
	}
	
	@Bean
	public SystemMonitor systemMonitor() {
		SystemMonitor sm = new SystemMonitor();
		sm.setSender(sender());
		
		return sm;
	}
}

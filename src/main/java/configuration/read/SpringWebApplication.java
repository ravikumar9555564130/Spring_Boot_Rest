package configuration.read;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "configuration.read" })
public class SpringWebApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringWebApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringWebApplication.class, args);
		

	}

}

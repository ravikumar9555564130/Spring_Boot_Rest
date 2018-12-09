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

	private final Logger logger = LoggerFactory.getLogger(getClass().getName());

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringWebApplication.class, args);

	}

}

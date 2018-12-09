package profile.read;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "profile.read" })
public class SpringWebApplication {

	private final static Logger logger = LoggerFactory.getLogger(SpringWebApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringWebApplication.class, args);

		DataSource datasource = (DataSource) context.getBean("dataSource1");

		logger.info("datasource  :: " + datasource);
	}

}

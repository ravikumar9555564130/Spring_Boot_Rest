package profile.read;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

	@Bean("dataSource1")
	@Profile("dev")
	public DataSource getDevDataSource() {

		return new DataSource("url_dev", "9001");
	}
	

	@Bean(name = "dataSource1")
	@Profile("prod")
	public DataSource getProdDataSource() {

		return new DataSource("url_prod", "7001");
	}

}

package configuration.read;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@Value("${env}")
	String env;

	@GetMapping("/profile")
	public String getProfile() {
		return env;
	}

}

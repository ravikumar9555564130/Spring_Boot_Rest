package configuration.read;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationRestController {

	@Value("${dev.msg1}")
	String msg1;
	
	@Value("${dev.msg2}")
	String msg2;
	
	@Value("${dev.msg3}")
	String msg3;

	@GetMapping("/")
	public String show() {

		return msg1+ " ," +msg2 + " ," + msg3;

	}

}

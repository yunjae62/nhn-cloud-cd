package ex.nhncd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NhnCdApplication {

	@GetMapping
	public String home() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(NhnCdApplication.class, args);
	}

}

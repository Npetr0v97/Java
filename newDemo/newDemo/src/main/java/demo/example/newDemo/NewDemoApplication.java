package demo.example.newDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NewDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewDemoApplication.class, args);
	}

}

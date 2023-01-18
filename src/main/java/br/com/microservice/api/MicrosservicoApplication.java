package br.com.microservice.api;

import br.com.microservice.api.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicrosservicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosservicoApplication.class, args);

		User user = new User(1, "lucas", "lucas@email.com", "123");
	}

}

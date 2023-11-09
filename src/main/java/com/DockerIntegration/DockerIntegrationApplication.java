package com.DockerIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerIntegrationApplication {

	public static void main(String[] args) {
		System.out.println("Hello.........Application Started");
		SpringApplication.run(DockerIntegrationApplication.class, args);
	}
	@RestController
	public static class DockerMessageController {
		@GetMapping("/messages")
		public String getMessage() {
			return "Hello from Docker!";
		}
	}
}

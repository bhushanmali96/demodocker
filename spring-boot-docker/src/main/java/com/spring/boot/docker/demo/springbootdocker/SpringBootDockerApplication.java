package com.spring.boot.docker.demo.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	@GetMapping("/")
	public String getMessage() {
		return "Hello World ! You are welcome";
				}
	
	@GetMapping("/1")
	public String getMessagePage() {
		return "This is My App on Page 1";
				}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}

package com.gcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Nitor2Application {

	@GetMapping
	public String getMessage(){
		return "This is service2";
	}

	public static void main(String[] args) {
		SpringApplication.run(Nitor2Application.class, args);
	}

}

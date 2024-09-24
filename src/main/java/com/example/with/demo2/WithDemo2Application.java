package com.example.with.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class WithDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(WithDemo2Application.class, args);
	}

}

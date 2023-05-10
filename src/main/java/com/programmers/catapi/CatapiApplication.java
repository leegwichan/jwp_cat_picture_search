package com.programmers.catapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CatapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatapiApplication.class, args);
	}

}

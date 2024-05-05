package com.gian.ecommercebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceBackendApplication {

	static void runApi() {
		SpringApplication.run(ECommerceBackendApplication.class, args);
	}

	public static void main(String[] args) {
		runApi();
	}

}

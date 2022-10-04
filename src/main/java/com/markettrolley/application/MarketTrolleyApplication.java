package com.markettrolley.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.markettrolley.application.repository")
public class MarketTrolleyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketTrolleyApplication.class, args);
	}

}

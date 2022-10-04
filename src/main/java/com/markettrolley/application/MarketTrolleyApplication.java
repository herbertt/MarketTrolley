package com.markettrolley.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Slf4j
public class MarketTrolleyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketTrolleyApplication.class, args);
	}

}

package com.markettrolley.application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;




@Slf4j
@RestController
@RequestMapping("message")
public class MarketTrolley {
	
	private static Logger logger = LoggerFactory.getLogger(MarketTrolley.class);
	
	@GetMapping(value = "/trazer")
	public ResponseEntity getAll() {
		logger.info("Chegou");
		return new ResponseEntity("OK",HttpStatus.OK); 
	}
	
}
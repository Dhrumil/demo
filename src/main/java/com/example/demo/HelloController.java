package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {

	 private Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	@RequestMapping("/")
	public String sayHello(){
		logger.info("Hello Sleuth");
		return "Hello Dhrumil shah";
	}
	
}

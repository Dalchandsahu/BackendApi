package com.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController public class WelcomeController {
	private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@GetMapping("/welcome")
	public String getAllLocation() {
		String msg = "Staringpoint of method getAllLocation {} ";

		logger.info("this is the entring point" + msg);
		System.out.println("This is the logging level Info");

		String msgs = "endingpoint";
		logger.info("this is the endpoint" + msgs);

		return "Welcome to Bikkad IT ";

	}

}

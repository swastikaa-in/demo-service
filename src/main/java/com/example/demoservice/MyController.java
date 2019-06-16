package com.example.demoservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MyController.class);

	@Autowired
	AppProperties appProperties;

	@GetMapping("/api/getnamecity")
	String getname() {
		LOGGER.info("Configured name:city {} , {}", appProperties.getName(), appProperties.getCity());
		return "Configured name:city is: " + appProperties.getName() + ":" + appProperties.getCity();
	}

}

package com.esprit.devops;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsApplication {

	private static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		logger.info("Starting the application ================");
		SpringApplication.run(DevopsApplication.class, args);
		logger.info("Done starting the application DevopsApplication");
	}

}

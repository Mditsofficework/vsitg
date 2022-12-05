package com.example1.jenkinwithspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinwithspringbootApplication implements CommandLineRunner {
	public static final Logger logger = LoggerFactory.getLogger(JenkinwithspringbootApplication.class);

	public static void main(String[] args) {
		logger.info("it's a CI job");
		SpringApplication.run(JenkinwithspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("my second CI");
		logger.info("my third CI");
		logger.info("my fourth CI");
		logger.info("my fifth CI");
		logger.info("vsit");
		
		
	}

}

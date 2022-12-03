package com.example1.jenkinwithspringboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinwithspringbootApplicationTests {
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(JenkinwithspringbootApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("it's my test class");
		logger.info("it's my test class 2");
logger.info("it's my test class3");
		assertEquals(true,true);
	}

}

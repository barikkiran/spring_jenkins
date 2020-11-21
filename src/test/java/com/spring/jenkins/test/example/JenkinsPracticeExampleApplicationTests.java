package com.spring.jenkins.test.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsPracticeExampleApplicationTests {
	
	
	//private static final Logger LOGGER = LoggerFactory.getLogger(JenkinsPracticeExampleApplicationTests.class);
	

	@Test
	void contextLoads() {

		
	LOGGER.info("test runing..");	
	LOGGER.info("Adding Second Test...");
	LOGGER.info("Adding Third Test...");
	
     Assertions.assertEquals(true,true);
	
	}

}

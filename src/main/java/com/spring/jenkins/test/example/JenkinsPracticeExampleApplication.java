package com.spring.jenkins.test.example;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPracticeExampleApplication {

	private final static Logger LOGGER = LoggerFactory.getLogger(JenkinsPracticeExampleApplication.class);

	@PostConstruct
	public void init() {

		LOGGER.info("spring_jenkins_demo project intialization starting....");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPracticeExampleApplication.class, args);
		LOGGER.info("spring_jenkins_demo project execution starting .....");
	}

}

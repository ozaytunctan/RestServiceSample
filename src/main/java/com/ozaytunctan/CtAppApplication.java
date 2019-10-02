package com.ozaytunctan;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.ozaytunctan.model"})
@EnableJpaRepositories(basePackages = {"com.ozaytunctan.repository"})
@PropertySource("classpath:application.properties")
@PropertySource("classpath:custom/properties/${application.env}.properties")
public class CtAppApplication {


	private static Logger logger= Logger.getLogger(CtAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CtAppApplication.class, args);

		logger.info("===================>CtAppApplication Started<===================");

	}

}
